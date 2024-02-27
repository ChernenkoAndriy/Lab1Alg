import java.io.Serializable;

/**
 * Represents a teacher, extending the Human class, with additional attributes such as name, surname, patronymic,
 * and affiliated Cathedra.
 */
public class Teacher extends Human implements Comparable<Human>{

    private String nsp;       // Name, Surname, and Patronymic
    private Cathedra cathedra; // The academic department (Cathedra) to which the teacher is affiliated

    public Teacher(String nsp, Cathedra cathedra) {
        this.nsp = nsp;
        this.cathedra = cathedra;
    }

    /**
     * Compares this teacher with another teacher based on their names.
     *
     * @param o Another teacher to compare with.
     * @return A negative value if this teacher is smaller, 0 if equal, and a positive value if this teacher is greater.
     */
    public int compareTo(Teacher o) {
        return super.compareTo(o);
    }
    //getters and setters
    public Cathedra getCathedra() {
        return cathedra;
    }
    public void setCathedra(Cathedra cathedra) {
        this.cathedra = cathedra;
    }
    @Override
    public String getNsp() {
        return super.getNsp();
    }
    @Override
    public void setNsp(String nsp) {
        super.setNsp(nsp);
    }
    // Конструктор з трьома аргументами

}

