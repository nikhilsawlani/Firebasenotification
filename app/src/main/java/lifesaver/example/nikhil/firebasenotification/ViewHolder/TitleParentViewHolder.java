package lifesaver.example.nikhil.firebasenotification.ViewHolder;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;

import lifesaver.example.nikhil.firebasenotification.R;

/**
 * Created by nikhil on 25-05-2017.
 */

public class TitleParentViewHolder extends ParentViewHolder {
    public TextView textView, textView2,textView3,textView4;



    public TitleParentViewHolder(View itemView) {
        super(itemView);
        textView=(TextView)itemView.findViewById(R.id.textView2);
        textView2=(TextView)itemView.findViewById(R.id.percentage);
        textView3=(TextView) itemView.findViewById(R.id.sign);
        textView4=(TextView)itemView.findViewById(R.id.textview);
    }
}
