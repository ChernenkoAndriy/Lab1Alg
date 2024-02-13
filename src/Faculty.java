import java.util.Arrays;
import java.util.Objects;

/**
 * The Faculty class represents a faculty in an educational institution.
 */
public class Faculty {
    private static String name;
    private static String[] caf;

    /**
     * Constructs a Faculty object with the specified name.
     *
     * @param name The name of the faculty.
     */
    public Faculty(String name) {
        this.name = name;
        this.caf = new String[0];
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
        caf = ArrayManager.addToAr(caf, cafedra);
    }
    public void deleteCaf(String cafedra){
        for(int i =0; i< caf.length; i++){
            if (cafedra.equals(caf[i])){
            caf = ArrayManager.delFromArr(caf, i);
            break;
            }
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty faculty)) return false;
        return Objects.equals(getName(), faculty.getName()) && Arrays.equals(getCaf(), faculty.getCaf());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName());
        result = 31 * result + Arrays.hashCode(getCaf());
        return result;
    }

}

