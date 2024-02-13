public class Human implements Comparable<Human>{
    private String nsp;
    /**
     * Порівнює цю людину з іншою людиною на основі імені.
     *
     * @param o Інша людина для порівняння.
     * @return Значення < 0, якщо ця людина менше, = 0, якщо рівні, і > 0, якщо ця людина більше.
     */
    @Override
    public int compareTo(Human o) {
        return this.nsp.compareTo(o.nsp);
    }
    public String getNsp() {
        return nsp;
    }

    public void setNsp(String nsp) {
        this.nsp = nsp;
    }
}
