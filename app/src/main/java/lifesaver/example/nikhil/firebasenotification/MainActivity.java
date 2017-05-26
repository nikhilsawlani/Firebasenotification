package lifesaver.example.nikhil.firebasenotification;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.github.mikephil.charting.charts.PieChart;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lifesaver.example.nikhil.firebasenotification.Adapter.MyAdapter;
import lifesaver.example.nikhil.firebasenotification.models.TitleChild;
import lifesaver.example.nikhil.firebasenotification.models.TitleCreator;
import lifesaver.example.nikhil.firebasenotification.models.TitleParent;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
     Toolbar toolbar;
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        ((MyAdapter)recyclerView.getAdapter()).onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        recyclerView=(RecyclerView)findViewById(R.id.recycle_view);

        database=FirebaseDatabase.getInstance();
        reference=database.getReference("Equity-technology");
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter = new MyAdapter(this,initData());
        adapter.setParentClickableViewAnimationDefaultDuration();
        adapter.setParentAndIconExpandOnClick(true);
        recyclerView.setAdapter(adapter);
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowCustomEnabled(true);

        }

    }



    private List<ParentObject> initData() {
        TitleCreator titlecreator=TitleCreator.get(this);
        List<TitleParent> titles=titlecreator.getAll();
        List<ParentObject> parentobject= new ArrayList<>();
        for(TitleParent title:titles){
            List<Object> childlist=new ArrayList<>();
            childlist.add(new TitleChild("Birla sun life","9.85%"));
            childlist.add(new TitleChild("Equity large cap","12.60%"));
            childlist.add(new TitleChild("Kotak 50-Growth","9.25%"));
            childlist.add(new TitleChild("HDFC top 200 fund Growth","8.25%"));
            childlist.add(new TitleChild("Reliance top 200 fund","12.77%"));
            //childlist.add(new TitleChild("Equlity large cap","12.60%"));
            title.setChildObjectList(childlist);
            parentobject.add(title);
        }
        return parentobject;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int res_id=item.getItemId();
        if(res_id==R.id.action_search){
            Toast.makeText(this,"Search",Toast.LENGTH_LONG).show();
        }
        if(item.getItemId()==android.R.id.home){
            finish();
        }
        return true;
    }
}
