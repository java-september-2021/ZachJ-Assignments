import java.util.Date;
public class AlfredQuotes {
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name, String dayPeriod) {
                String newGuestGreeting = String.format("Well hello, %s. I trust you are having a wonderful %s.", "Beth Kane", "evening");

        return newGuestGreeting;
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return String.format("My good gentleperson, the present date is %s", date.toString());
    }


    public String respondBeforeAlexis(String conversation) {
        
        if (conversation.indexOf("Alexis") >= 0) {
            return "I am certain you have misspoken, sir. Surely you mean Alfred?";
        } if (conversation.indexOf("Alfred") >= 0) {
            return "Of course, my good sir. How may I further assist you?";
        } else {
            return "If there is no further business to attend to, I shall take my leave.";
        }
    }
}
