
package school.model;

import org.json.simple.JSONObject;

public class Book implements InterFace {

    private long id;
    private String name;
    private String authorName;
    private int numberOfPages;
    private int releaseYear;
    public static long counter = 1;

    public Book(long id, String name, String authorName, int numberOfPages, int releaseYear) {
        this.name = name;
        this.id = id;
        this.authorName = authorName;
        this.numberOfPages = numberOfPages;
        this.releaseYear = releaseYear;

    }

    public Book(String name, String authorName, int numberOfPages, int releaseYear) {
        this(counter++, name, authorName, numberOfPages, releaseYear);
    }

    public long getId() {
        return id;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id :" + id +
                ", name :" + name +
                ", authorName :" + authorName +
                ", numberOfPages :" + numberOfPages +
                ", releaseYear :" + releaseYear +
                '}';
    }

    public JSONObject toJson() {
        JSONObject object = new JSONObject();
        object.put("id", id);
        object.put("name", name);
        object.put("authorName", authorName);
        object.put("numberOfPages", numberOfPages);
        object.put("releaseYear", releaseYear);
        return object;

    }

    public Object fromJson(JSONObject object) {
        object.put("id", 0);
        object.put("name", "Ahmad");
        object.put("authorName", "Basic Of AI");
        object.put("numberOfPages", 899);
        object.put("releaseYear", 99 / 11 / 2);
        return null;
    }
}