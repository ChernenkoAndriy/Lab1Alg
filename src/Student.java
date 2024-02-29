import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Represents a student, extending the Human class, with additional attributes such as course and group.
 */
public class Student extends Human{
   // Name, Surname, and Patronymic
    private int course;    // The academic year/course of the student
    private Group group;   // The academic group to which the student belongs

    /**
     * Constructs a new Student with the specified name, course, and group.
     *
     * @param nsp    The name, surname, and patronymic of the student.
     * @param course The academic year/course of the student.
     * @param group  The academic group to which the student belongs.
     */
    public Student(String nsp, int course, Group group) {
        super(nsp);
        this.course = course;
        this.group = group;
    }



    /**
     * Compares the course of this student with another student.
     *
     * @param o Another student to compare courses with.
     * @return 0 if courses are equal, -1 if this student's course is less, 1 if this student's course is greater.
     */
    public int compareByCourse(Student o) {
        if (this.course == o.course) return 0;
        if (this.course < o.course) return -1;
        return 1;
    }
    /**
     * Compares this student with another student based on their names.
     *
     * @return A negative value if this student is smaller, 0 if equal, and a positive value if this student is greater.
     */

    //getters and setters
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public Group getGroup() {
        return group;
    }
    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String getNsp() {
        return nsp;
    }

    @Override
    public void setNsp(String nsp) {
        this.nsp = nsp;
    }

    /**
     * Returns a string representation of the student, including name, course, group, Cathedra, and Faculty.
     *
     * @return String representation of the student.
     */
    @Override
    public String toString() {
        return "ПІБ: " + this.nsp + "    Курс: " + this.course + "   " + this.group;
    }

}
