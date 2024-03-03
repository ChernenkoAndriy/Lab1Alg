import java.io.Serializable;

/**
 * Represents a teacher, extending the Human class, with additional attributes such as name, surname, patronymic,
 * and affiliated Cathedra.
 */
public class Teacher extends Human implements Comparable<Human>{
    private Cathedra cathedra; // The academic department (Cathedra) to which the teacher is affiliated

    /**
     * Constructs a new Teacher with the specified name and affiliated Cathedra.
     *
     * @param nsp      The name, surname, and patronymic of the teacher.
     * @param cathedra The academic department (Cathedra) to which the teacher is affiliated.
     */
    public Teacher(String nsp, Cathedra cathedra) {
        super(nsp);
        this.cathedra = cathedra;
    }


    //getters and setters
    /**
     * Gets the affiliated Cathedra of the teacher.
     *
     * @return The Cathedra to which the teacher is affiliated.
     */
    public Cathedra getCathedra() {
        return cathedra;
    }

    /**
     * Sets the affiliated Cathedra of the teacher.
     *
     * @param cathedra The Cathedra to which the teacher will be affiliated.
     */
    public void setCathedra(Cathedra cathedra) {
        this.cathedra = cathedra;
    }

    /**
     * Gets the name, surname, and patronymic of the teacher.
     *
     * @return The name, surname, and patronymic of the teacher.
     */
    @Override
    public String getNsp() {
        return nsp;
    }

    /**
     * Sets the name, surname, and patronymic of the teacher.
     *
     * @param nsp The name, surname, and patronymic to set for the teacher.
     */
    @Override
    public void setNsp(String nsp) {
        super.setNsp(nsp);
        this.nsp = nsp;
    }

    /**
     * Returns a string representation of the teacher, including name, and affiliated Cathedra.
     *
     * @return String representation of the teacher.
     */
    @Override
    public String toString() {
        return "ПІБ: " + nsp + "    " + cathedra;
    }
}

