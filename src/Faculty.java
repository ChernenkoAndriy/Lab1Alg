import java.util.Arrays;
import java.util.Objects;

/**
 * The Faculty class represents a faculty in an educational institution.
 */
public class Faculty {

    private ArrayManager am = new ArrayManager(); // ArrayManager for array manipulation
    private String name;
    private String[] caf;

    /**
     * Constructs a Faculty object with the specified name.
     *
     * @param name The name of the faculty.
     */
    public Faculty(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the faculty.
     *
     * @return The name of the faculty.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the faculty.
     *
     * @param name The new name for the faculty.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the array of cafedras (departments) associated with the faculty.
     *
     * @return The array of cafedras.
     */
    public String[] getCaf() {
        return caf;
    }

    /**
     * Sets the array of cafedras for the faculty.
     *
     * @param caf The array of cafedras to be set.
     */
    public void setCaf(String[] caf) {
        this.caf = caf;
    }

    /**
     * Adds a new cafedra to the array of cafedras associated with the faculty.
     *
     * @param cafedra The new cafedra to be added.
     */
    public void addCaf(String cafedra) {
        am.addToAr(caf, cafedra);
    }

    /**
     * Overrides the equals method to compare Faculty objects for equality.
     *
     * @param o The object to compare with.
     * @return True if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty faculty)) return false;
        return Objects.equals(name, faculty.name) && Arrays.equals(caf, faculty.caf);
    }

    /**
     * Overrides the hashCode method to generate a hash code for Faculty objects.
     *
     * @return The hash code for the Faculty object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

