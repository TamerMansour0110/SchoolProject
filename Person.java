package school.model;

import org.json.simple.JSONObject;

import java.util.Date;

public class Person implements InterFace {

    private long id;
    private String name;
    private Date dateOfBirth;
    private Gender gender;
    private static long counter = 1;

    public enum Gender {
        Male, Female
    }

    public Person(long id, String name, Date dateOfBirth, Gender gender) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public Person(String name, Date dateOfBirth, Gender gender) {
        this(counter++, name, dateOfBirth, gender);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                '}';
    }

    public JSONObject toJson() {
        JSONObject object = new JSONObject();
        object.put("id", id);
        object.put("name", name);
        object.put("dateOfBirth", dateOfBirth.toString());
        object.put("Gender", gender.name());
        return object;
    }

    public Object fromJson(JSONObject object) {
        object.put("id", 1);
        object.put("name", "Ahmad");
        object.put("dateOfBirth", 98 / 3 / 19);
        object.put("Gender", Gender.Male);
        return null;
    }
}