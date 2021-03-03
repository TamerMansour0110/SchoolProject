package school.model;

import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.logging.Level;

public class SClass implements InterFace{

    private long id;
    private int roomNumber;
    private ArrayList<Table> table;//208
    private ArrayList<Book> books;
    private ArrayList<Student> students;
    private ArrayList<Lecture> lecture;
    private String classManager;
    private Student mangerAssistance;
    private char section;
    private static Level level;
    private Student StudentsMarks;
    public static long counter = 1;

    public SClass(long id, int roomNumber, ArrayList<Student> students, ArrayList<Lecture> lectures, String classManager, char section) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.students = students;
        this.lecture = lecture;
        this.classManager = classManager;
        this.section = section;
    }

    public SClass(long id, int roomNumber,ArrayList<Table> table, ArrayList<Book> books, ArrayList<Student> students,
                  ArrayList<Lecture> lecture, String classManager, Student mangerAssistance, char section,
                  Level level, Student studentsMarks) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.table = table;
        this.books = books;
        this.students = students;
        this.lecture = lecture;
        this.classManager = classManager;
        this.mangerAssistance = mangerAssistance;
        this.section = section;
        this.level = level;
        this.StudentsMarks = studentsMarks;
    }
    public SClass(int roomNumber, ArrayList<Table> table, ArrayList<Book> books, ArrayList<Student> students,
                  ArrayList<Lecture> lecture, String classManager, Student mangerAssistance, char section,
                  Level level, Student studentsMarks){
        this(counter++,roomNumber,table,books, students,lecture,classManager,mangerAssistance,section,level,studentsMarks);
    }



    public JSONObject toJson(){
        JSONObject object = new JSONObject();
        object.put("id",id);
        object.put("roomNumber",roomNumber);
        object.put("table",table);
        object.put("books",books);
        object.put("student", students);
        object.put("lecture",lecture);
        object.put("classManager",classManager);
        object.put("mangerAssistance",mangerAssistance);
        object.put("section",section);
        object.put("level",level);
        object.put("StudentsMarks ",StudentsMarks.toJson());
        return object;
    }
    public Object fromJson(JSONObject object){

        object.put("id",8);
        object.put("roomNumber",6);
        object.put("table",table);
        object.put("books",books);
        object.put("student", students);
        object.put("lecture",lecture);
        object.put("classManager",classManager);
        object.put("mangerAssistance",mangerAssistance);
        object.put("section",'c');
        object.put("level",3);
        object.put("StudentsMarks ",StudentsMarks);
        return null;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public ArrayList<Table> getTable() {
        return table;
    }

    public void setTable(ArrayList<Table> table) {
        this.table = table;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Lecture> getLecture() {
        return lecture;
    }

    public void setLecture(ArrayList<Lecture> lecture) {
        this.lecture = lecture;
    }

    public String getClassManager() {
        return classManager;
    }

    public void setClassManager(String classManager) {
        this.classManager = classManager;
    }

    public Student getMangerAssistance() {
        return mangerAssistance;
    }

    public void setMangerAssistance(Student mangerAssistance) {
        this.mangerAssistance = mangerAssistance;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public Student getStudentsMarks() {
        return StudentsMarks;
    }

    public void setStudentsMarks(Student studentsMarks) {
        StudentsMarks = studentsMarks;
    }

    public char getSection() {
        return section;
    }

    public static Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "SClass{" +
                "id=" + id +
                ", roomNumber=" + roomNumber +
                ", table=" + table +
                ", books=" + books +
                ", student=" + students +
                ", lecture=" + lecture +
                ", classManager='" + classManager + '\'' +
                ", mangerAssistance=" + mangerAssistance +
                ", section=" + section +
                ", StudentsMarks=" + StudentsMarks +
                '}';
    }
}