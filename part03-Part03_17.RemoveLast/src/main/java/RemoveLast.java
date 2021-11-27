
//Create the method public static void removeLast(ArrayList<String> strings) in the exercise template. 
//The method should remove the last value in the list it receives as a parameter. 
//If the list is empty, the method does nothing.

import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        // Populate the list with 3 items
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        // Print the list as-is
        for (String element: strings) {
          System.out.println(element);
        } 
        // Call removeLast
        removeLast(strings);

        // Print the modified list
        for (String element: strings) {
          System.out.println(element);
        } 
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.isEmpty()) {
            return;
        }
        strings.remove(strings.size() -1);
    }
}















//import java.util.Scanner;
//import java.util.ArrayList;
//
//public class RemoveLast {
//public static void removeLast(ArrayList<String> strings) {
//
//        int b = strings.size();
//        int c = b - 1;
//        strings.remove(c);
//        for (int i = 0; i < strings.size(); ++i) {
//            String a;
//            a = strings.get(i);
//            System.out.println(a);
//        }
//    }
//public static void main(String[] args) {
//// Try your method in here
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> list;
//        list = new ArrayList<>();
//        while (true) {
//            String b = scanner.nextLine();
//            if ("".equals(-1)) {
//            } else {
//                break;
//            }
//            list.add(b);
//        }
//        removeLast(list);
//    }
//}