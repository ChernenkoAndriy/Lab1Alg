import java.io.Serializable;
import java.util.Objects;

/**
 * Represents a faculty within a university, identified by its name.
 */
public class Faculty{

    private String facName; // The name of the faculty

    /**
     * Constructs a new Faculty with the specified name.
     *
     * @param facName The name of the faculty.
     */
    public Faculty(String facName) {
        this.facName = facName;
    }
    //getters and setters
    /**
     * Gets the name of the faculty.
     *
     * @return The name of the faculty.
     */
    public String getFacName() {
        return facName;
    }

    /**
     * Sets the name of the faculty.
     *
     * @param facName The name to set for the faculty.
     */
    public void setFacName(String facName) {
        this.facName = facName;
    }

    /**
     * Checks if this Faculty is equal to another object based on their names.
     *
     * @param o Another object to compare with.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty faculty)) return false;
        return Objects.equals(getFacName(), faculty.getFacName());
    }

    /**
     * Generates a hash code for the Faculty based on its name.
     *
     * @return The hash code for the Faculty.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getFacName());
    }

    /**
     * Returns a string representation of the Faculty, including its name.
     *
     * @return String representation of the Faculty.
     */
    @Override
    public String toString() {
        return "Факультет: " +  facName;
    }
}
