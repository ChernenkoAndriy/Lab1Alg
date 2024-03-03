import java.io.Serializable;
import java.util.Objects;
import java.util.StringTokenizer;

/**
 * Represents a group of students within a university, identified by a group number,
 * a group name, and associated with a specific Cathedra (academic department).
 */
public class Group{

    private int groupNum; // The unique identifier for the group
    private String groupName; // The name of the group
    private Cathedra cathedra; // The academic department to which the group is affiliated

    /**
     * Constructs a new Group with the specified group number, group name, and Cathedra.
     *
     * @param groupNum The unique identifier for the group.
     * @param groupName The name of the group.
     * @param cathedra The academic department (Cathedra) to which the group is affiliated.
     */
    public Group(int groupNum, String groupName, Cathedra cathedra) {
        this.groupNum = groupNum;
        this.groupName = groupName;
        this.cathedra = cathedra;
    }

    /**
     * Constructs a new Group with the specified group name and Cathedra.
     *
     * @param groupName The name of the group.
     * @param cathedra  The academic department (Cathedra) to which the group is affiliated.
     */
    public Group(String groupName, Cathedra cathedra) {
        this.groupName = groupName;
        this.cathedra = cathedra;
    }

    //getters and setters

    /**
     * Gets the academic department (Cathedra) to which the group is affiliated.
     *
     * @return The Cathedra associated with the group.
     */
    public Cathedra getCathedra() {
        return cathedra;
    }

    /**
     * Sets the academic department (Cathedra) to which the group is affiliated.
     *
     * @param cathedra The new Cathedra for the group.
     */
    public void setCathedra(Cathedra cathedra) {
        this.cathedra = cathedra;
    }

    /**
     * Gets the unique identifier for the group.
     *
     * @return The group number.
     */
    public int getGroupNum() {
        return groupNum;
    }

    /**
     * Sets the unique identifier for the group.
     *
     * @param groupNum The new group number.
     */
    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    /**
     * Gets the name of the group.
     *
     * @return The name of the group.
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the name of the group.
     *
     * @param groupName The new name for the group.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * Checks if two Group objects are equal.
     *
     * @param o The object to compare with.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group group)) return false;
        return getGroupNum() == group.getGroupNum() && Objects.equals(getGroupName(), group.getGroupName()) && Objects.equals(getCathedra(), group.getCathedra());
    }

    /**
     * Generates a hash code for the Group object.
     *
     * @return The hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getGroupNum(), getGroupName(), getCathedra());
    }

    /**
     * Returns a string representation of the Group object.
     *
     * @return A string representation of the Group object.
     */
    @Override
    public String toString() {
        return "Спеціальність: " + groupName + "    Номер спеціальності: " + groupNum + "   " + cathedra;
    }
}

