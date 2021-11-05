
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // implement here your program that uses the PersonalInformation class

        while (true) {
            System.out.println("First name: ");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                break;
            }
            
            System.out.println("LastName: ");
            String lastName = scanner.nextLine();
            System.out.println("Identification number: ");
            String idNumber = scanner.nextLine();
            infoCollection.add(new PersonalInformation(firstName, lastName, ""));
        }//end of while loop
        
        for (PersonalInformation personalInformation : infoCollection) {
            System.out.println(personalInformation.getFirstName() + " " + personalInformation.getLastName() + " " + personalInformation.getIdentificationNumber());
            //System.out.println(personalInformation.toString());
        }
    }
}
