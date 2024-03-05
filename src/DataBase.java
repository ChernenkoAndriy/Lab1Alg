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

//        students = new Student[0];
//        teachers = new Teacher[0];
//        faculties = new Faculty[0];
//        cathedras = new Cathedra[0];
//        groups = new Group[0];

        faculties = new Faculty[]{new Faculty("ФІ"),
                new Faculty("ФСНСТ"),
                new Faculty("ФП")};
        cathedras = new Cathedra[]{
                new Cathedra("ІТ" ,faculties[0]),
                new Cathedra("WEBS" ,faculties[0]),
                new Cathedra("УKR" ,faculties[0]),
                new Cathedra("ФС" , faculties[1]),
                new Cathedra("НС" , faculties[1]),
                new Cathedra("СТ" , faculties[1]),
                new Cathedra("ПРАВО" ,faculties[2]),
                new Cathedra("ІСТОРІЯ" ,faculties[2]),
                new Cathedra("АНГЛМ" ,faculties[2]),
        };
        groups = new Group[]{
                new Group("ІПЗ", cathedras[0]),
                new Group("КН",cathedras[0]),
                new Group("КБ",cathedras[0]),
                new Group("ПМ", cathedras[0]),
                new Group("ВЕБІНЖ", cathedras[1]),
                new Group("РОУТЕРІНЖ",cathedras[1]),
                new Group("ФІЛОЛОГІЯ", cathedras[2]),
                new Group("СОЦІОЛІНГВІСТИКА", cathedras[2]),
                new Group("ФІЛОСОФІЯ",  cathedras[7]),
                new Group("АНГЛГРАМ", cathedras[8]),
                new Group("ФІНАНСИ",  cathedras[5]),
        };


        students = new Student[]{
                new Student("ЧерненкоАндрійЮрійович", 4, groups[0]),
                new Student("СеменюкМаксимСеменович", 4,  groups[0]),
                new Student("Гринь Марія n", 2,  groups[0]),
                new Student("Морміль Максим n", 2,  groups[0]),
                new Student("Силенко Ілля Володимирович", 3, groups[0]),
                new Student("Прохоров Олександр Прохоров", 3,  groups[0]),
                new Student("N", 1,  groups[0]),
                new Student("A", 2,  groups[0]),
                new Student("d", 4,  groups[0]),
                new Student("e", 5,  groups[0]),
        };
        teachers = new Teacher[]{
                new Teacher("Глибовець Андрій Миколайович", cathedras[0]),
                new Teacher("Глибовець Андрій Миколайович", cathedras[0]),
                new Teacher("Митник Юрій null", cathedras[0]),
                new Teacher("Гусь Гусь Гусь", cathedras[0]),
                new Teacher("Чорней Руслан Костянтинович", cathedras[0]),
                new Teacher("Калиновська Оксана В'ячеславівна", cathedras[2]),
                new Teacher("CALinovska", cathedras[2]),
                new Teacher("ALinovska", cathedras[2]),
                new Teacher("Алиновська Оксана В'ячеславівна", cathedras[2]),
                new Teacher("ЛОЛ", cathedras[7]),
        };


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