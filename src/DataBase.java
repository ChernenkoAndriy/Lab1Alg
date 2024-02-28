
public class DataBase {
    private Student[] students;
    private Teacher[] teachers;
    private Faculty[] faculties;
    private Cathedra[] cathedras;
    private Group[] groups;

    public static DataBase getInstance() {
        if (instance == null) {
            instance = new DataBase();
        }
        return instance;
    }

    private static DataBase instance;

    private DataBase() {
        /*
        students = new Student[0];
        teachers = new Teacher[0];
        faculties = new Faculty[0];
        cathedras = new Cathedra[0];
        groups = new Group[0];
         */
        students = new Student[]{
                new Student("Черненко Андрій Юрійович", 4,  new Group("ІПЗ", new Cathedra("ІТ" ,new Faculty("ФІ")))),
                new Student("Семенюк Максим Семенович", 4,  new Group("ІПЗ", new Cathedra("ІТ" ,new Faculty("ФІ")))),
                new Student("Гринь Марія null", 2,  new Group("ІПЗ", new Cathedra("ІТ" ,new Faculty("ФІ")))),
                new Student("Морміль Максим null", 2,  new Group("ІПЗ", new Cathedra("ІТ" ,new Faculty("ФІ")))),
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
    }
    public Student[] getStudents() {
        return students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public Faculty[] getFaculties() {
        return faculties;
    }

    public Cathedra[] getCathedras() {
        return cathedras;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public void setFaculties(Faculty[] faculties) {
        this.faculties = faculties;
    }

    public void setCathedras(Cathedra[] cathedras) {
        this.cathedras = cathedras;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }
}