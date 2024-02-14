/**
 * Represents a group of students within a university, identified by a group number,
 * a group name, and associated with a specific Cathedra (academic department).
 */
public class Group {

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

    //getters and setters
    public Cathedra getCathedra() {
        return cathedra;
    }

    public void setCathedra(Cathedra cathedra) {
        this.cathedra = cathedra;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
