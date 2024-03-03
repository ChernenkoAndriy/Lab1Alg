/**
 * Represents a human being with a name, surname, and patronymic.
 * Implements the Comparable interface for comparing humans based on their names.
 */
public class Human implements Comparable<Human> {

    protected String nsp; // Name, Surname, and Patronymic

    /**
     * Constructs a new Human with the specified name, surname, and patronymic.
     *
     * @param nsp The name, surname, and patronymic.
     */
    public Human(String nsp) {
        this.nsp = nsp;
    }

    /**
     * Compares this human with another human based on their names.
     *
     * @param o Another human to compare with.
     * @return A negative value if this human is smaller, 0 if equal, and a positive value if this human is greater.
     */
    @Override
    public int compareTo(Human o) {
        return this.nsp.compareTo(o.getNsp());
    }


    //getters and setters
    /**
     * Gets the name, surname, and patronymic of the human.
     *
     * @return The name, surname, and patronymic.
     */
    public String getNsp() {
        return nsp;
    }

    /**
     * Sets the name, surname, and patronymic of the human.
     *
     * @param nsp The new name, surname, and patronymic.
     */
    public void setNsp(String nsp) {
        this.nsp = nsp;
    }

}
