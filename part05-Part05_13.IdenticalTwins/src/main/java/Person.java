
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }
    
    public String getName() {
        return this.name;
    }

    public SimpleDate getBirthday() {
        return this.birthday;
    }

    public int getHeight() {
        return this.height;
    }
    
    public int getWeight() {
        return this.weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared) {
        Person person = (Person) compared;
        return this.name.equals(person.name) &&
            this.birthday.equals(person.birthday) &&
            this.height == person.height &&
            this.weight == person.weight; 
                
        }
    }
//(this.name.equals(compared.getName())