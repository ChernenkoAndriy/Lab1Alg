/*
Цей клас (AddMenu) представляє меню додавання,
де користувач може вибрати опції для додавання нових факультетів, кафедр до факультета,
а також додавання нових студентів/викладачів до кафедри.
 */
public class AddMenu {
    public AddMenu() {
    }

    public static void run() {
        while (true) {
            char act = DataInput.getChar("Введіть номер дії, яку хочете виконати:\n" +
                    "1. Додати факультет\n" +
                    "2. Додати кафедру до факультета\n" +
                    "3. Додати студента до кафедри\n" +
                    "4. Додати викладача до кафедри\n" +
                    "b. Повернутися до головного меню");

            switch (act) {
                case '1':
                    addFaculty();
                    break;
                case '2':
                    addCathedraToFaculty();
                    break;
                case '3':
                    addStudentToCathedra();
                    break;
                case '4':
                    addTeacherToCathedra();
                    break;
                case 'b':
                    return;
                default:
                    System.out.println("Ви ввели невірну команду");
            }
        }
    }

    private static void addFaculty() {
        String facultyName = DataInput.getString("Введіть назву факультету:");
        Faculty faculty = new Faculty(facultyName);
        DataBase.getInstance().addFaculty(faculty);
        System.out.println("Факультет успішно додано: " + facultyName);
    }

    private static void addCathedraToFaculty() {
        String cathedraName = DataInput.getString("Введіть назву кафедри:");
        String facultyName = DataInput.getString("Введіть назву факультету, до якого додається кафедра:");
        Faculty[] faculties = DataBase.getInstance().getFaculties();
        Faculty faculty = null;
        for (Faculty f : faculties) {
            if (f.getFacName().equals(facultyName)) {
                faculty = f;
                break;
            }
        }
        if (faculty == null) {
            System.out.println("Факультет з назвою " + facultyName + " не знайдено.");
            return;
        }
        Cathedra cathedra = new Cathedra(cathedraName, faculty);
        DataBase.getInstance().addCathedra(cathedra);
        System.out.println("Кафедру успішно додано до факультету: " + cathedraName + " -> " + facultyName);
    }

    private static void addStudentToCathedra() {
        String studentName = DataInput.getString("Введіть ПІБ студента:");
        int course = DataInput.getInt("Введіть курс студента:");
        String groupName = DataInput.getString("Введіть назву групи студента:");
        String cathedraName = DataInput.getString("Введіть назву кафедри, до якої додається студент:");
        Cathedra[] cathedras = DataBase.getInstance().getCathedras();
        Cathedra cathedra = null;
        for (Cathedra c : cathedras) {
            if (c.getCathName().equals(cathedraName)) {
                cathedra = c;
                break;
            }
        }
        if (cathedra == null) {
            System.out.println("Кафедру з назвою " + cathedraName + " не знайдено.");
            return;
        }
        // Знайти групу за назвою
        Group[] groups = DataBase.getInstance().getGroups();
        Group group = null;
        for (Group g : groups) {
            if (g.getGroupName().equals(groupName) && g.getCathedra().equals(cathedra)) {
                group = g;
                break;
            }
        }
        if (group == null) {
            System.out.println("Групу з назвою " + groupName + " не знайдено для кафедри " + cathedraName);
            return;
        }
        Student student = new Student(studentName, course, group);
        DataBase.getInstance().addStudent(student);
        System.out.println("Студента успішно додано до кафедри: " + studentName + " -> " + cathedraName);
    }

    private static void addTeacherToCathedra() {
        String teacherName = DataInput.getString("Введіть ПІБ викладача:");
        String cathedraName = DataInput.getString("Введіть назву кафедри, до якої додається викладач:");
        Cathedra[] cathedras = DataBase.getInstance().getCathedras();
        Cathedra cathedra = null;
        for (Cathedra c : cathedras) {
            if (c.getCathName().equals(cathedraName)) {
                cathedra = c;
                break;
            }
        }
        if (cathedra == null) {
            System.out.println("Кафедру з назвою " + cathedraName + " не знайдено.");
            return;
        }
        Teacher teacher = new Teacher(teacherName);
        teacher.setCathedra(cathedra);
        DataBase.getInstance().addTeacher(teacher);
        System.out.println("Викладача успішно додано до кафедри: " + teacherName + " -> " + cathedraName);
    }
}
