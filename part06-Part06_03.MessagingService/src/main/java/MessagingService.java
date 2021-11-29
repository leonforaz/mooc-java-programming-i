
import java.util.ArrayList;

//The class must have a parameterless constructor and 
//contain a list of Message objects.
public class MessagingService {

    private ArrayList<Message> messages;

    public MessagingService() {
        this.messages = new ArrayList<>();
    }

    public void add(Message message) {
        //adds a message passed as a parameter to the messaging service 
        //as long as the message content is at most 280 characters long.
        //use the .getContent function/method from the Message class - as instructed!
        if (message.getContent().length() <= 280) {
            messages.add(message);
        }
//        option from mooc.fi - I think it's better than mine
//        if (message.getContent().length() > 280) {
//            return;
//        }
//        this.messages.add(message);
    }

public ArrayList<Message> getMessages() {
        //returns the messages added to the messaging service.
        return messages;
    }
}
