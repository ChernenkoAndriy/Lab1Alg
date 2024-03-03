import java.io.Serializable;
import java.util.Objects;
import java.util.StringTokenizer;

/**
 * Represents an academic department (Cathedra) within a university, identified by its name and associated with a Faculty.
 */
public class Cathedra{

    private String cathName; // The name of the Cathedra
    private Faculty faculty; // The Faculty to which the Cathedra is affiliated

    /**
     * Constructs a new Cathedra with the specified name and associated Faculty.
     *
     * @param cathName The name of the Cathedra.
     * @param faculty The Faculty to which the Cathedra is affiliated.
     */
    public Cathedra(String cathName, Faculty faculty) {
        this.cathName = cathName;
        this.faculty = faculty;
    }
    //getters and setters

    /**
     * Gets the name of the Cathedra.
     *
     * @return The name of the Cathedra.
     */
    public String getCathName() {
        return cathName;
    }

    /**
     * Sets the name of the Cathedra.
     *
     * @param cathName The new name of the Cathedra.
     */
    public void setCathName(String cathName) {
        this.cathName = cathName;
    }

    /**
     * Gets the Faculty to which the Cathedra is affiliated.
     *
     * @return The Faculty to which the Cathedra is affiliated.
     */
    public Faculty getFaculty() {
        return faculty;
    }

    /**
     * Sets the Faculty to which the Cathedra is affiliated.
     *
     * @param faculty The new Faculty to which the Cathedra is affiliated.
     */
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    /**
     * Checks if two Cathedra objects are equal.
     *
     * @param o The object to compare with.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cathedra cathedra)) return false;
        return Objects.equals(getCathName(), cathedra.getCathName()) && Objects.equals(getFaculty(), cathedra.getFaculty());
    }

    /**
     * Generates a hash code for the Cathedra object.
     *
     * @return The hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getCathName(), getFaculty());
    }

    /**
     * Returns a string representation of the Cathedra object.
     *
     * @return A string representation of the Cathedra object.
     */
    @Override
    public String toString() {
        return "Кафедра " + cathName + "   " + faculty;
    }
}

