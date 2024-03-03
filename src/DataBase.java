/**
 * The DataBase class represents a database for storing information about students, teachers,
 * faculties, cathedras, and groups in a university.
 */
public class DataBase {
    private Student[] students;
    private Teacher[] teachers;
    private Faculty[] faculties;
    private Cathedra[] cathedras;
    private Group[] groups;

    /**
     * Gets the instance of the DataBase class using the singleton pattern.
     *
     * @return The instance of the DataBase class.
     */
    public static DataBase getInstance() {
        if (instance == null) {
            instance = new DataBase();
        }
        return instance;
    }

    private static DataBase instance;

    /**
     * Private constructor for the singleton pattern.
     */
    private DataBase() {

        students = new Student[0];
        teachers = new Teacher[0];
        faculties = new Faculty[0];
        cathedras = new Cathedra[0];
        groups = new Group[0];
         /*
        students = new Student[]{
                new Student("ЧерненкоАндрійЮрійович", 4,  new Group("ІПЗ", new Cathedra("ІТ" ,new Faculty("ФІ")))),
                new Student("СеменюкМаксимСеменович", 4,  new Group("ІПЗ", new Cathedra("ІТ" ,new Faculty("ФІ")))),
                new Student("Гринь Марія n", 2,  new Group("ІПЗ", new Cathedra("ІТ" ,new Faculty("ФІ")))),
                new Student("Морміль Максим n", 2,  new Group("ІПЗ", new Cathedra("ІТ" ,new Faculty("ФІ")))),
                new Student("Силенко Ілля Володимирович", 3,  new Group("ІПЗ", new Cathedra("ІТ" ,new Faculty("ФІ")))),
                new Student("Прохоров Олександр Прохоров", 3,  new Group("ІПЗ", new Cathedra("ІТ" ,new Faculty("ФІ")))),
                new Student("N", 1,  new Group("ІПЗ", new Cathedra("ІТ" ,new Faculty("ФІ")))),
                new Student("A", 2,  new Group("ІПЗ", new Cathedra("ІТ" ,new Faculty("ФІ")))),
                new Student("d", 4,  new Group("ІПЗ", new Cathedra("ІТ" ,new Faculty("ФІ")))),
                new Student("e", 5,  new Group("ІПЗ", new Cathedra("ІТ" ,new Faculty("ФІ")))),
        };
        teachers = new Teacher[]{
                new Teacher("Глибовець Андрій Миколайович", new Cathedra("ІТ" ,new Faculty("ФІ"))),
                new Teacher("Глибовець Андрій Миколайович", new Cathedra("ІТ" ,new Faculty("ФІ"))),
                new Teacher("Митник Юрій null", new Cathedra("ІТ" ,new Faculty("ФІ"))),
                new Teacher("Гусь Гусь Гусь", new Cathedra("ІТ" ,new Faculty("ФІ"))),
                new Teacher("Чорней Руслан Костянтинович", new Cathedra("ІТ" ,new Faculty("ФІ"))),
                new Teacher("Калиновська Оксана В'ячеславівна", new Cathedra("УКР" ,new Faculty("ФІ"))),
                new Teacher("CALinovska", new Cathedra("УКР" ,new Faculty("ФІ"))),
                new Teacher("ALinovska", new Cathedra("УКР" ,new Faculty("ФІ"))),
                new Teacher("Алиновська Оксана В'ячеславівна", new Cathedra("УКР" ,new Faculty("ФІ"))),
                new Teacher("ЛОЛ", new Cathedra("ІСТОРІЯ" ,new Faculty("ФП"))),
        };
        faculties = new Faculty[]{new Faculty("ФІ"),
                    new Faculty("ФСНСТ"),
                    new Faculty("ФП")};
        cathedras = new Cathedra[]{
                new Cathedra("ІТ" ,new Faculty("ФІ")),
                new Cathedra("WEBS" ,new Faculty("ФІ")),
                new Cathedra("УKR" ,new Faculty("ФІ")),
                new Cathedra("ФС" , new Faculty("ФСНСТ")),
                new Cathedra("НС" , new Faculty("ФСНСТ")),
                new Cathedra("СТ" , new Faculty("ФСНСТ")),
                new Cathedra("ПРАВО" ,new Faculty("ФП")),
                new Cathedra("ІСТОРІЯ" ,new Faculty("ФП")),
                new Cathedra("АНГЛМ" ,new Faculty("ФП")),
        };
        groups = new Group[]{
                new Group("ІПЗ", new Cathedra("ІТ" ,new Faculty("ФІ"))),
                new Group("КН", new Cathedra("ІТ" ,new Faculty("ФІ"))),
                new Group("КБ", new Cathedra("ІТ" ,new Faculty("ФІ"))),
                new Group("ПМ", new Cathedra("ІТ" ,new Faculty("ФІ"))),
                new Group("ВЕБІНЖ", new Cathedra("WEBS" ,new Faculty("ФІ"))),
                new Group("РОУТЕРІНЖ", new Cathedra("WEBS" ,new Faculty("ФІ"))),
                new Group("ФІЛОЛОГІЯ", new Cathedra("УКР" ,new Faculty("ФІ"))),
                new Group("СОЦІОЛІНГВІСТИКА", new Cathedra("УКР" ,new Faculty("ФІ"))),
                new Group("ФІЛОСОФІЯ", new Cathedra("ІСТОРІЯ" ,new Faculty("ФП"))),
                new Group("АНГЛГРАМ", new Cathedra("АНГЛМ" ,new Faculty("ФП"))),
                new Group("ФІНАНСИ", new Cathedra("СТ" ,new Faculty("ФСНСТ"))),
        };
*/

    }

    /**
     * Gets the array of students in the database.
     *
     * @return The array of students.
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * Gets the array of teachers in the database.
     *
     * @return The array of teachers.
     */
    public Teacher[] getTeachers() {
        return teachers;
    }

    /**
     * Gets the array of faculties in the database.
     *
     * @return The array of faculties.
     */
    public Faculty[] getFaculties() {
        return faculties;
    }

    /**
     * Gets the array of cathedras in the database.
     *
     * @return The array of cathedras.
     */
    public Cathedra[] getCathedras() {
        return cathedras;
    }

    /**
     * Gets the array of groups in the database.
     *
     * @return The array of groups.
     */
    public Group[] getGroups() {
        return groups;
    }

    /**
     * Sets the array of students in the database.
     *
     * @param students The new array of students.
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * Sets the array of teachers in the database.
     *
     * @param teachers The new array of teachers.
     */
    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    /**
     * Sets the array of faculties in the database.
     *
     * @param faculties The new array of faculties.
     */
    public void setFaculties(Faculty[] faculties) {
        this.faculties = faculties;
    }

    /**
     * Sets the array of cathedras in the database.
     *
     * @param cathedras The new array of cathedras.
     */
    public void setCathedras(Cathedra[] cathedras) {
        this.cathedras = cathedras;
    }

    /**
     * Sets the array of groups in the database.
     *
     * @param groups The new array of groups.
     */
    public void setGroups(Group[] groups) {
        this.groups = groups;
    }
}