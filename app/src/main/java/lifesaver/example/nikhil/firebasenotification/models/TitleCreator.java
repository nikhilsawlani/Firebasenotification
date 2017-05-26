package lifesaver.example.nikhil.firebasenotification.models;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikhil on 25-05-2017.
 */

public class TitleCreator {
    static TitleCreator titleCreator;
    List<TitleParent> titleparents;

    public TitleCreator(Context context) {
        titleparents=new ArrayList<>();
        for (int i=0;i<50;i++){
            TitleParent title=new TitleParent(String.format("Caller #%d",i));
            titleparents.add(title);
        }
    }

    public static TitleCreator get(Context context) {
        if (titleCreator == null)
            titleCreator = new TitleCreator(context);
            return titleCreator;



    }

    public List<TitleParent> getAll() {
        return titleparents;
    }
}