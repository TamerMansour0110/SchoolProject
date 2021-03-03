package school.control;

import school.model.*;

import java.util.ArrayList;
import java.util.Random;

import school.model.SClass;

public class SClassControl {
    private SClass sClass;

    public SClassControl(SClass sClass) {
        this.sClass = sClass;
    }

    public SClass getsClass() {
        return sClass;
    }

    public void setsClass(SClass sClass) {
        this.sClass = sClass;
    }

    //Add Students
    public void addStudent(ArrayList<Student> student) {
        sClass.setStudents(student);
    }

    //Assign Room Number
    public void assignRoomNumber(SClass roomNumber) {
        sClass.setRoomNumber(34);
    }

    //Build Table
    public void buildTable(ArrayList<Table> table) {
        sClass.getTable();
    }

    //Assign Books
    public void assignBooks(ArrayList<Book> books) {
        sClass.setBooks(books);
    }

    //Add Random Instructor
    private void setInstructor(Random random) {
        random(sClass.getMangerAssistance());
    }

    private void random(Student mangerAssistance) {
    }

    //Calculate The Average
    public void Average() {
        int studentsMarks[] = {89, 99, 78, 89, 100, 95, 12, 34, 77, 75, 45};
        int avg = studentsMarks.length;
        double sum = 0;
        double a, p;
        for (int i = 0; i < studentsMarks.length; i++) {
            sum = sum + studentsMarks[i];
        }
        System.out.println(sum);
        a = sum / avg;
        p = (sum / (avg * 100)) * 100;
        System.out.println("Average Marks = " + a);
        System.out.print("Percentage = " + p + "%");
    }

}