package lifesaver.example.nikhil.firebasenotification;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by nikhil on 21-05-2017.
 */

public class Firedata extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);

    }
}
