//Create a class named Whistle. Add the variable private String sound to the class. 
//After that, create the constructor public Whistle(String whistleSound), 
//which is used to create a new whistle that's given a sound.


public class Whistle {
    private String sound;
    
    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }
    public void sound() {

    System.out.println(sound);  
    }
}
