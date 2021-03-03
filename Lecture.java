package school.model;

import org.json.simple.JSONObject;


public class Lecture implements InterFace{
    private long id;
    private String name;
    private SClass sClass;
    private Book book;
    private Period period;
    public static long counter = 1;

    public Lecture(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Lecture(long id, String name, SClass sClass, Book book, Period period) {
        this.id = id;
        this.name = name;
        this.sClass = sClass;
        this.book = book;
        this.period = period;

    }


    public Lecture(String name, SClass sClass, Book book, Period period) {
        this(counter++, name, sClass, book, period);


    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public long getId() {
        return id;
    }

    public Period getPeriod() {
        return period;
    }


    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sClass=" + sClass +
                ", book=" + book +
             //   ", periods=" + period.getDay() + period.getTime() +
                '}';
    }

    public JSONObject toJson() {
        JSONObject object = new JSONObject();
        object.put("id", id);
        object.put("name", name);
        object.put("sClass", sClass);
        object.put("book", book.toJson());
        object.put("periods", period);
        return object;

    }

    public Object fromJson(JSONObject object) {
        object.put("id", 101);
        object.put("name", "Math");
        object.put("sClass", sClass);
        object.put("gender", book);
        object.put("periods", period);
        return null;

    }
}

