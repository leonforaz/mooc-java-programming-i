//In this exercise, we'll be working with files stored in CSV-format
//that contain names and ages separated by commas.
//The file format may look like this:

import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Name of the file: ");
        String file = scanner.nextLine();

        try ( Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String data = fileScanner.nextLine();
                String[] csv = data.split(",");
                if (csv[1].equals("1")) {
                    System.out.println(csv[0] + ", age: " + csv[1] + " year");
                } else {
                    System.out.println(csv[0] + ", age: " + csv[1] + " years");
                }
            }
            //end of try
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
//comma-separated values (CSV)
