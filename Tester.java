package school.model.Test;

import school.control.SchoolControl;
import school.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;

public class Tester {

    public static void main(String[] args) {


        SClass sClass = new SClass(123, 123, null, null, "", 'e');

        Date a = new Date(87, 7, 9);
        Admin admin = new Admin(132, "Yahya", a, Person.Gender.Male);
        System.out.println(admin.toString() + "\n");

        Book book = new Book(123, "Basic od AI", "D.Wiliam", 998, 1927);
        System.out.println(book.toString() + "\n");

        Period period = new Period(Period.Day.Thursday, Period.Time.FORTH);
        System.out.println(period);

        Lecture lecture = new Lecture(12234, "Math");
        System.out.println(lecture.toString() + "\n");

        Date date = new Date(99, 2, 3);
        Person person = new Person(123444234, "Ahmad", date, Person.Gender.Male);
        System.out.println(person.toString() + "\n");

        Date I = new Date(99, 9, 9);


        Date s = new Date(104, 2, 30);
        Student student = new Student(1223, "Saja", s, Person.Gender.Female);
        System.out.println(student.toString() + "\n");


        School school = new School(admin);

        SchoolControl schoolControl = new SchoolControl(school);
        schoolControl.saveSchool();
        schoolControl.importSchool();

        Date date1 = new Date(2000, 2, 15);
        Date date2 = new Date(1998, 1, 17);
        Date date3 = new Date(2008, 1, 30);
        Date releaseYear = new Date(2001, 02, 23);

        Level level;
        ArrayList<Student> students = null;
        ArrayList<Lecture> lectures = null;
        Person person2 = new Person(10, "mohamad", date, Person.Gender.Male);
        System.out.println(person2.toJson());
        Admin admin2 = new Admin(1, "Faris", date, Person.Gender.Male);
        System.out.println(admin2.toJson());
        Book book2 = new Book(15, "english", "English for palestine", 235, 1993);
        System.out.println(book2.toJson());
        Period period2 = new Period(Period.Day.Thursday, Period.Time.FORTH);
        System.out.println(period2.getDay());
        Lecture lecture2 = new Lecture("Khalil", sClass, book, period);
        System.out.println(lecture2.toJson());
        Instructor instructor1 = new Instructor(2, "Mother", date1, Person.Gender.Male, lecture);
        System.out.println(instructor1.toString());
        Table table2 = new Table(23, "", sClass, null);
        System.out.println(table2.toJson());
        SClass sClass2 = new SClass(12, 32, students, lectures, "", 'a');
        System.out.println(sClass2.toString());
        Student student2 = new Student(123, "", date2, Person.Gender.Female, sClass, student.getStudentsMarks());
        System.out.println(student2.toString());
        Table table = new Table(123, "", sClass, null);
        System.out.println(table.toString() + "\n");
    }
}


/**
 * test person
 * System.out.println(person.toJson());
 * System.out.println(person.getId());
 * System.out.println(person.setName("Amr"));
 * System.out.println(person.toString());
 * System.out.println(person.getGender());
 * //  System.out.println(person.setGender(Person.Gender.Male));
 * System.out.println(person.setDateOfBarthe(releaseYear));
 * System.out.println(person.setId(15));
 * System.out.println(person.getName());
 * // ************************************************************************************************
 * //                                                            test admin
 * System.out.println(admin.getId());
 * System.out.println(admin.getDateOfBarth());
 * System.out.println(admin.getGender());
 * System.out.println(admin.getName());
 * System.out.println(admin.getClass());
 * System.out.println(admin.setId(12));
 * System.out.println(admin.setDateOfBarthe(date2));
 * // System.out.println(admin.setGender(Person.Gender.Male));
 * System.out.println(admin.setName("hani"));
 * System.out.println(admin.toJson());
 * // ************************************************************************************************
 * //                                                            test book
 * System.out.println(book.getId());
 * System.out.println(book.getName());
 * System.out.println(book.getAutherName());
 * System.out.println(book.getNomberOfPages());
 * System.out.println(book.getClass());
 * System.out.println(book.getReleaseYear());
 * System.out.println(book.setId(2));
 * System.out.println(book.setAutherName("Enghl fo pales"));
 * System.out.println(book.setName("engli"));
 * System.out.println(book.setNomberOfPages(289));
 * System.out.println(book.setReleaseYear(date3));
 * System.out.println(book.toJson());
 * System.out.println(book.toString());
 * // ************************************************************************************************
 * //                                test period
 * System.out.println(period.getTime());
 * System.out.println(period.getDay());
 * System.out.println(period.setDay(Period.Day.FRIDAY));
 * System.out.println(period.setTime(Period.Time.Fiveth));
 *************************************************************************************/