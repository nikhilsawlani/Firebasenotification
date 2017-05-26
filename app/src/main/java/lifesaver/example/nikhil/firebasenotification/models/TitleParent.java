package lifesaver.example.nikhil.firebasenotification.models;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Created by nikhil on 25-05-2017.
 */

public class TitleParent implements ParentObject {
    private List<Object> mchildlist;
    private UUID id;
    private String title;

    public TitleParent(String mchildlist) {
        this.title = title;
        id=UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public List<Object> getChildObjectList() {

        return mchildlist;
    }

    @Override
    public void setChildObjectList(List<Object> list) {
        mchildlist=list;

    }
}
