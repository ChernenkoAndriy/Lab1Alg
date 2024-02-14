/**
 * Represents a faculty within a university, identified by its name.
 */
public class Faculty {

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
    public String getFacName() {
        return facName;
    }
    public void setFacName(String facName) {
        this.facName = facName;
    }
}
