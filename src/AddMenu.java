/**
 * The AddMenu class represents a menu for adding various entities such as faculties,
 * cathedras to faculties, students to groups, teachers to cathedras, and specialties to cathedras.
 */
public class AddMenu {
    public AddMenu() {
    }

    /**
     * Runs the add menu, allowing the user to choose actions for adding entities.
     */
    public static void run() {
        while (true) {
            char act = DataInput.getChar("Введіть номер дії, яку хочете виконати:\n" +
                    "1. Додати факультет\n" +
                    "2. Додати кафедру до факультета\n" +
                    "3. Додати студента до групи\n" +
                    "4. Додати викладача до кафедри\n" +
                    "5. Додати спеціальність до кафедри\n" +
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
                case '5':
                    addStudentGroup();
                    break;
                case 'b':
                    return;
                default:
                    System.out.println("Ви ввели невірну команду");
            }
        }
    }

    /**
     * Adds a new faculty to the database.
     */
    private static void addFaculty() {
        String facultyName = DataInput.getString("Введіть назву факультету:");
        Faculty faculty = new Faculty(facultyName);
        if (!ArrayManager.ifContains(DataBase.getInstance().getFaculties(), faculty)) {
            DataBase.getInstance().setFaculties(ArrayManager.addToAr(DataBase.getInstance().getFaculties(), faculty));
            System.out.println("Факультет успішно додано: " + facultyName);
        } else {
            System.out.println("Такий факультет вже є");
        }
    }

    /**
     * Adds a new cathedra to a specified faculty in the database.
     */
    private static void addCathedraToFaculty() {
        if (DataBase.getInstance().getFaculties().length != 0) {
            String cathedraName = DataInput.getString("Введіть назву кафедри:");
            String facultyName = DataInput.getString("Введіть назву факультету, до якого додається кафедра:");
            Cathedra cath = new Cathedra(cathedraName, new Faculty(facultyName));
            if (!ArrayManager.ifContains(DataBase.getInstance().getCathedras(), cath)) {
                while (!ArrayManager.ifContains(DataBase.getInstance().getFaculties(), new Faculty(facultyName))) {
                    char choice = DataInput.getChar("Щось не так. Введіть y, якщо хочете " +
                            "спробувати заново або b, щоб вийти");
                    while (choice != 'y' && choice != 'b')
                        choice = DataInput.getChar("Щось не так. Введіть y, якщо хочете " +
                                "спробувати заново або b, щоб вийти");
                    if (choice == 'b') break;
                    facultyName = DataInput.getString("Немає такого факультета:");
                }
                if(ArrayManager.ifContains(DataBase.getInstance().getFaculties(), new Faculty(facultyName))){
                    for( Faculty x:DataBase.getInstance().getFaculties()){
                        if(x.getFacName().equals(facultyName)) {
                            DataBase.getInstance().setCathedras(
                                    ArrayManager.addToAr(
                                            DataBase.getInstance().getCathedras(),
                                            new Cathedra(cathedraName, x)));
                        }
                    }

                }
            } else {
                System.out.println("Така кафедра вже існує");
            }

        } else {
            System.out.println("Немає факультетів для запису ");
        }
    }

    /**
     * Adds a new student to a specified cathedra and group in the database.
     */
    private static void addStudentToCathedra() {
        if (DataBase.getInstance().getGroups().length != 0) {
            String nsp = DataInput.getString("Введіть ПІБ студента");
            int course = DataInput.getInt("Введіть курс");
            while (course <= 0 || course > 5)
                course = DataInput.getInt("Курс має бути від 1 до 5");
            int groupNum = DataInput.getInt("Введіть номер спеціальності, на яку записуємо");
            String groupName = DataInput.getString("Введіть ім'я спеціальності");
            String cathedra = DataInput.getString("Введіть кафедру на якій спеціальність");
            String faculty = DataInput.getString("Введіть факультет, на якому кафедра");
            while (!ArrayManager.ifContains(DataBase.getInstance().getGroups(),
                    new Group(groupNum, groupName, new Cathedra(cathedra, new Faculty(faculty))))) {
                char choice = DataInput.getChar("Щось не так. Введіть y, якщо хочете " +
                        "спробувати заново або b, щоб вийти");
                while (choice != 'y' && choice != 'b')
                    choice = DataInput.getChar("Щось не так. Введіть y, якщо хочете " +
                            "спробувати заново або b, щоб вийти");
                if(choice == 'b') break;
                groupNum = DataInput.getInt("Введіть номер спеціальності, на яку записуємо");
                groupName = DataInput.getString("Введіть ім'я спеціальності");
                cathedra = DataInput.getString("Введіть кафедру на якій спеціальність");
                faculty = DataInput.getString("Введіть факультет, на якому кафедра");
            }
            for(Group x: DataBase.getInstance().getGroups()){
                if(x.equals( new Group(groupNum, groupName, new Cathedra(cathedra, new Faculty(faculty))))){
                    DataBase.getInstance().setStudents(ArrayManager.addToAr(DataBase.getInstance().getStudents(),
                            new Student(nsp, course, x)));
                }
            }

        } else {
            System.out.println("Немає ще спеціальностей для запису ");
        }
    }

    /**
     * Adds a new teacher to a specified cathedra in the database.
     */
    private static void addTeacherToCathedra() {
        if (DataBase.getInstance().getCathedras().length != 0) {
            String nsp = DataInput.getString("Введіть ПІБ викладача");
            String cathedra = DataInput.getString("Введіть кафедру на яку запишемо викладача");
            String faculty = DataInput.getString("Введіть факультет, на якому кафедра");
            while (!ArrayManager.ifContains(DataBase.getInstance().getCathedras(),
                    new Cathedra(cathedra, new Faculty(faculty)))) {
                char choice = DataInput.getChar("Щось не так. Введіть y, якщо хочете " +
                        "спробувати заново або b, щоб вийти");
                while (choice != 'y' && choice != 'b')
                    choice = DataInput.getChar("Щось не так. Введіть y, якщо хочете " +
                            "спробувати заново або b, щоб вийти");
                if(choice == 'b') break;
                cathedra = DataInput.getString("Введіть кафедру на яку запишемо викладача");
                faculty = DataInput.getString("Введіть факультет, на якому кафедра");
            }
            for(Cathedra x:DataBase.getInstance().getCathedras()){
                if(x.equals(new Cathedra(cathedra, new Faculty(faculty)))){
                    DataBase.getInstance().setTeachers(ArrayManager.addToAr(DataBase.getInstance().getTeachers(), new Teacher(nsp,
                            x)));
                }
            }

        } else {
            System.out.println("Немає ще кафедр для запису");
        }
    }

    /**
     * Adds a new student group to a specified cathedra in the database.
     */
    private static void addStudentGroup() {
        if (DataBase.getInstance().getCathedras().length != 0) {
            int groupNum = DataInput.getInt("Введіть номер спеціальності");
            String groupName = DataInput.getString("Введіть ім'я спеціальності");
            String cathedra = DataInput.getString("Введіть кафедру на якій спеціальность");
            String faculty = DataInput.getString("Введіть факультет, на якому кафедра");
            Group group = new Group(groupNum, groupName, new Cathedra(cathedra, new Faculty(faculty)));
            if (!ArrayManager.ifContains(DataBase.getInstance().getGroups(), group)) {
                while (!ArrayManager.ifContains(DataBase.getInstance().getCathedras(),
                        new Cathedra(cathedra, new Faculty(faculty)))) {
                    char choice = DataInput.getChar("Щось не так. Введіть y, якщо хочете " +
                            "спробувати заново або b, щоб вийти");
                    while (choice != 'y' && choice != 'b')
                        choice = DataInput.getChar("Щось не так. Введіть y, якщо хочете " +
                                "спробувати заново або b, щоб вийти");
                    if(choice == 'b') break;
                    cathedra = DataInput.getString("Введіть кафедру на якій спеціальность");
                    faculty = DataInput.getString("Введіть факультет, на якому кафедра");
                }
                if(ArrayManager.ifContains(DataBase.getInstance().getFaculties(), new Faculty(faculty))){
                    for( Faculty x:DataBase.getInstance().getFaculties()){
                        if(x.getFacName().equals(faculty)) {
                            for(Cathedra y:DataBase.getInstance().getCathedras()){
                                if(y.getCathName().equals(cathedra)){
                                    DataBase.getInstance().setGroups(ArrayManager.addToAr(DataBase.getInstance().getGroups(),
                                            new Group(groupNum, groupName, y)));
                                }
                            }
                        }
                    }

                }

            } else {
                System.out.println("Така спеціальність вже є");
            }
        } else {
            System.out.println("Немає ще кафедр для запису");
        }
    }
}