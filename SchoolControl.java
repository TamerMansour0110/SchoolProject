package school.control;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import school.model.Admin;
import school.model.Instructor;
import school.model.SClass;
import school.model.School;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.json.simple.parser.JSONParser;

public class SchoolControl {
    private School school;

    public SchoolControl(School school) {
        this.school = school;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void setAdmin(Admin admin) {
        school.setAdmin(admin);
    }

    public void addSClass(SClass sClass) {
        List<SClass> levelSClasses = school.getsClasses().get(sClass.getLevel());
        char schoolClassSection = 'a';
        schoolClassSection += levelSClasses.size();
        sClass.setSection(schoolClassSection);
        levelSClasses.add(sClass);

    }

    public void setAdmin(School admin) {
        this.school = admin;
    }

    public void addInstructor(Instructor instructor) {
        school.getInstructors().add(instructor);
    }

    public void saveSchool() {
        school.toJson();
        try (FileWriter file = new FileWriter("C:\\Development\\NetBeans\\school\\school.json")) {
            file.write(school.toJson().toJSONString());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void importSchool() {
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader("C:\\Development\\NetBeans\\school\\school.json")) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            System.out.println(school.toJson());
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}