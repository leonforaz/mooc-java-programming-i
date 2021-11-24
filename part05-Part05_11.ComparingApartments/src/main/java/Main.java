
public class Main {

    public static void main(String[] args) {
        //rooms, squares, pricepersquares
        // you can write code here to try out your program
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500); //88000
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);//159600
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);//195000

        System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));  //71600
        System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));   //35400

    }
}
