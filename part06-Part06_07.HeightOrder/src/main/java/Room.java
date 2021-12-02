
//The class should contain a list of persons as an instance variable, 
//and it should have a parameterless constructor. 

import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;
    
    //remember to capitalize r
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
         return this.persons.isEmpty();
    }//don't need two } for this method, git gud
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
}

//Empty room? true
//Empty room? false
//
//Lea (183 cm)
//Kenya (182 cm)
//Auli (186 cm)
//Nina (172 cm)
//Terhi (185 cm)