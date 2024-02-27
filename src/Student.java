import java.util.Collection;
import java.util.logging.Filter;

/**
 * Represents a student, extending the Human class, with additional attributes such as course and group.
 */
public class Student extends Human{

    private String nsp;   // Name, Surname, and Patronymic
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
        this.nsp = nsp;
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
     * @param o Another student to compare with.
     * @return A negative value if this student is smaller, 0 if equal, and a positive value if this student is greater.
     */
    public int compareTo(Student o) {
        return super.compareTo(o);
    }
    /**
     * Returns a string representation of the student, including name, course, group, Cathedra, and Faculty.
     *
     * @return String representation of the student.
     */
    @Override
    public String toString() {
        return "Name: " + this.nsp + "  Course: " + this.course + "  Group: " +
                this.group + "  Cathedra: " + this.group.getCathedra().getCathName() +
                "  Faculty: " + this.group.getCathedra().getFaculty().getFacName();
    }
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
}
