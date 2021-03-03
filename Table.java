package school.model;

import org.json.simple.JSONObject;
import java.util.ArrayList;

public class Table implements InterFace{
    private long id;
    private String tableName;
    private ArrayList<Lecture> lectures;
    private SClass sClass;
    public static long counter = 1;


    public Table(long id, String tableName, SClass sClass, ArrayList<Lecture> lectures) {
        this.id = id;
        this.tableName = tableName;
        this.sClass = sClass;
        lectures = new ArrayList<Lecture>();
        this.lectures = lectures;
    }

    public Table(String tableName,SClass sClass, ArrayList<Lecture> lectures) {
        this(counter++,tableName,sClass,lectures);
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public long getId() {
        return id;
    }

    public ArrayList<Lecture> getLectures() {
        return lectures;
    }

    public SClass getSClass() {
        return sClass;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLectures(ArrayList<Lecture> lecture) {
        this.lectures = lecture;
    }

    public void setSClass(SClass sClass) {
        this.sClass = sClass;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", lectures=" + lectures +
                ", sClass=" + sClass +
                '}';
    }
    public JSONObject toJson() {
        JSONObject object = new JSONObject();
        object.put("id", getId());
        object.put("lectures", getLectures());
        object.put("TableName", getTableName());
        object.put("sClass", getSClass());
        return object;
    }

    public InterFace fromJson(JSONObject jsonObject){
        return (InterFace) (jsonObject);
    }
}