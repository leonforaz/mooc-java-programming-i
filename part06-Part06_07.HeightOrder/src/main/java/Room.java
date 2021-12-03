
//The class should contain a list of persons as an instance variable,
//and it should have a parameterless constructor.

import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    //remember to capitalize r to R
    //this is constructorless
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

    //which returns the shortest person added to the room.
    //If the room is empty, a null reference is returned.
    //The method should not remove a person from the room.

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }

        //create an object reference for the object to be returned
        //its first value is the first object on the list
        Person returnPerson = this.persons.get(0);

        for (Person person : this.persons) {
            //getHeight() from Person class, git gud
            if(returnPerson.getHeight() > person.getHeight()) {
                returnPerson = person;
            }
        }
        return returnPerson;
    }

    //which takes the shortest person in the room. When a room is empty,
    //it returns a null reference.
//    public Person take() {
//        if (this.persons.isEmpty()) {
//            return null;
//        }
//
//        Person personOut = this.persons.get(0);
//        for (Person person : this.persons) {
//            //getHeight() from Person class, git gud
//            if (personOut.getHeight() > person.getHeight()) {
//                personOut = person;
//            }
//        }
//        //same code as above, just use .remove for the returnPerson
//        this.persons.remove(personOut);
//        return personOut;
//
//    }
//}

    //mooc.fi solution here. tunnel vision on loops again.
    //Better than mine because barbarians are verbose
    public Person take() {
        Person shortestPerson = shortest();
        this.persons.remove(shortestPerson);
        return shortestPerson;
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