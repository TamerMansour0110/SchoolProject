package school.model;

import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

public class School implements InterFace {
    private Admin admin;
    private ArrayList<Instructor> instructors;
    private static Map<Level, ArrayList<SClass>> sClasses = new HashMap<>();

    public School(Admin admin) {
        this.admin = admin;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(ArrayList<Instructor> instructors) {
        this.instructors = instructors;
    }

    public static Map<Level, ArrayList<SClass>> getsClasses() {
        return sClasses;
    }

    public void setsClasses(Map<Level, ArrayList<SClass>> sClasses) {
        this.sClasses = sClasses;
    }

    enum level {
        FIRST, SECOND, THIRD, FORTH, FIFTH, SIXTH, SEVENTH, EIGHTH, NINTH, TENTH, ELEVENTH;
    }

    public JSONObject toJson() {
        JSONObject object = new JSONObject();
        object.put("Admin", admin.toJson());
        object.put("aClasses",sClasses);
        return object;
    }

    public Object fromJson(JSONObject object) {
        object.put("Admin", admin);
        object.put("sClasses", sClasses);
        object.put("Instructor", instructors);
        return null;
    }
}