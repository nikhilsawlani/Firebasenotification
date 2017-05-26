package lifesaver.example.nikhil.firebasenotification.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.List;

import lifesaver.example.nikhil.firebasenotification.R;
import lifesaver.example.nikhil.firebasenotification.ViewHolder.TitleChildViewHolder;
import lifesaver.example.nikhil.firebasenotification.ViewHolder.TitleParentViewHolder;
import lifesaver.example.nikhil.firebasenotification.models.TitleChild;
import lifesaver.example.nikhil.firebasenotification.models.TitleParent;

/**
 * Created by nikhil on 25-05-2017.
 */

public class MyAdapter extends ExpandableRecyclerAdapter<TitleParentViewHolder,TitleChildViewHolder> {

    LayoutInflater inflater;

    public MyAdapter(Context context, List<ParentObject> parentItemList) {
        super(context, parentItemList);
        inflater=LayoutInflater.from(context);
    }

    @Override
    public TitleParentViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        View view =inflater.inflate(R.layout.rawlist,viewGroup,false);
        return new TitleParentViewHolder(view);
    }

    @Override
    public TitleChildViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
        View view =inflater.inflate(R.layout.layout_child,viewGroup,false);
        return new TitleChildViewHolder(view);
    }

    @Override
    public void onBindParentViewHolder(TitleParentViewHolder titleParentViewHolder, int i, Object o) {
        TitleParent title = (TitleParent) o;
        titleParentViewHolder.textView.setText(title.getTitle());
    }
    @Override
    public void onBindChildViewHolder(TitleChildViewHolder titleChildViewHolder, int i, Object o) {
            TitleChild title=(TitleChild)o;
         titleChildViewHolder.title2.setText(title.getTitle2());
        titleChildViewHolder.percentage2.setText(title.getPercentage2());
    }
}
