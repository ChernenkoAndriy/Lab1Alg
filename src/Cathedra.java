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
    public String getCathName() {
        return cathName;
    }
    public void setCathName(String cathName) {
        this.cathName = cathName;
    }
    public Faculty getFaculty() {
        return faculty;
    }
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cathedra cathedra)) return false;
        return Objects.equals(getCathName(), cathedra.getCathName()) && Objects.equals(getFaculty(), cathedra.getFaculty());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCathName(), getFaculty());
    }
}

