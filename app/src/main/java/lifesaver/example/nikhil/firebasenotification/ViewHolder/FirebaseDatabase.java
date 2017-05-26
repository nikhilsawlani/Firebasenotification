package lifesaver.example.nikhil.firebasenotification.ViewHolder;

/**
 * Created by nikhil on 26-05-2017.
 */

public class FirebaseDatabase {
    String title,percentage;

    public FirebaseDatabase(String title, String percentage) {
        this.title = title;
        this.percentage = percentage;
    }
    public  FirebaseDatabase(){

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }
}
