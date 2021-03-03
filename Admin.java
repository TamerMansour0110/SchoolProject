package school.model;

import org.json.simple.JSONObject;

import java.util.Date;

public class Admin extends Person {

    public Admin(long id, String name, Date dateOfBirth, Gender gender) {
        super(id, name, dateOfBirth, gender);
    }

    @Override
    public String toString() {
        return "{" +
                "id" + getId() +
                ", name'" + getName() + '\'' +
                ", dateOfBirth" + getDateOfBirth() +
                ", gender" + getGender() +
                '}';
    }

    public JSONObject toJson() {
        JSONObject object = super.toJson();
        return object;

    }

    public Object fromJson(JSONObject object) {
        object.put("id", 1);
        object.put("name", "Jack");
        object.put("dateOfBirth", 91 / 3 / 19);
        object.put("gender", Gender.Male);
        return null;
    }
}