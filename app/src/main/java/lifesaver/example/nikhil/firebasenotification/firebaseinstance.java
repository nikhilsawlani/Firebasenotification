package lifesaver.example.nikhil.firebasenotification;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by nikhil on 11-05-2017.
 */

public class firebaseinstance extends FirebaseInstanceIdService {
     private  static  final String get_tokrn="REG_TOKEN";
    @Override
    public void onTokenRefresh() {
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d(get_tokrn,token);
    }
}
