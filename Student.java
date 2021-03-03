package school.model;

import org.json.simple.JSONObject;

import java.util.*;

public class Student extends Person {

    private SClass sClass;

    private List<Double> studentsMarks = new ArrayList<>();
    Map<Lecture, Double[]> studentMarks = new HashMap<>();

    public Student(long id, String name, Date dateOfBirth, Gender gender, SClass sClass,
                   List<Double> studentsMarks) {
        super(id, name, dateOfBirth, gender);
        this.sClass = sClass;
        this.studentsMarks = studentsMarks;
    }

    public Student(long id, String name, Date dateOfBirth, Gender gender) {
        super(id, name, dateOfBirth, gender);
    }

    public SClass getsClass() {
        return sClass;
    }

    public void addStudentsMark(Lecture lecture, Double[] value) {
        studentMarks.put(lecture, value);

    }

    public List<Double> getStudentMarks() {
        return studentsMarks;
    }

    public void addMark(Double mark) {
        studentsMarks.add(mark);
    }

    public void setStudentMarks(List<Double> studentMarks) {
        this.studentsMarks = studentMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                ", gender=" + getGender() +
                ", SClass=" + getsClass() +
                '}';
    }

    public void setsClass(SClass sClass) {
        this.sClass = sClass;
    }

    public List<Double> getStudentsMarks() {
        return studentsMarks;
    }

    public void setStudentsMarks(List<Double> studentsMarks) {
        this.studentsMarks = studentsMarks;
    }

    public void setStudentMarks(Map<Lecture, Double[]> studentMarks) {
        this.studentMarks = studentMarks;
    }

    public JSONObject toJson() {
        JSONObject object = super.toJson();
        object.put("SClass", sClass.toJson());
        object.put("StudentsMarks",studentMarks);
        return object;

    }
    public InterFace fromJson(JSONObject jsonObject){
        return (InterFace) (jsonObject);
    }


}