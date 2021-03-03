package school.model;

import org.json.simple.JSONObject;
import java.util.Date;

public class Instructor extends Person {

    Lecture lecture;

    public Instructor(long id, String name, Date dateOfBirth, Gender gender, Lecture lecture) {
        super(id, name, dateOfBirth, gender);
        this.lecture=lecture;
    }

    public Lecture getLectures() {
        return lecture;
    }

    public void setLectures(Lecture lectures) {
        this.lecture = lectures;
    }
    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + getId()+
                ", name='" + getName() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                ", gender=" + getGender() +
                ", SClass=" + getLectures() +
                '}';
    }
    public JSONObject toJson(){
        JSONObject object = super.toJson();
        object.put("lecture",lecture.toJson());
        return object;

    }
    public Object fromJson(JSONObject object){
        object.put("id",1002);
        object.put("name","William");
        object.put("dateOfBirth",87/6/30);
        object.put("gender",Gender.Male);
        return null;
    }
}