
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        
        for (Book book : books) {
            if(book.getId() == searchedId) {
                return books.indexOf(book);
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        int begin = 0;
        int end = books.size() -1;
        int middle = 0;
        
        while(begin <= end) {
            middle = ((begin + end) / 2);
            
            Book book = books.get(middle);
            int bookId = book.getId();

            //mooc.fi solution is superior
            //int bookId = books.get(middle).getId();
            //You forgot about .get method for ArrayList
            //Since middle is a Book, use the .getId() methhod from the Book class
            
            if(bookId == searchedId) {
                return middle;
            } else if (bookId < searchedId) {
                begin = (middle +1);
            } else {
//            } else if (bookId > searchedId) {
                end = (middle - 1);
            }
        }
        
        return -1;
    }
}

//Binary search didn't find a book in list contaiting one book, 
//even though the book was on the list. 
//Try testing binary search with the following book:
//[(id: 422341; name: name 422341)]

//The method must be implemented as a binary search, which assumes the list is ordered. 
//You should also assume, that the ids towards the beginning of the list, 
//are always smaller than the ids towards the end of the list.


