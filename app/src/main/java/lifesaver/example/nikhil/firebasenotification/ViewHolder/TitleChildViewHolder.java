package lifesaver.example.nikhil.firebasenotification.ViewHolder;

import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;

import lifesaver.example.nikhil.firebasenotification.R;

/**
 * Created by nikhil on 25-05-2017.
 */

public class TitleChildViewHolder extends ChildViewHolder {

    public TextView title2,percentage2;

    public TitleChildViewHolder(View itemView) {
        super(itemView);
        title2=(TextView)itemView.findViewById(R.id.title2);
        percentage2=(TextView)itemView.findViewById(R.id.percentage2);
    }
}
