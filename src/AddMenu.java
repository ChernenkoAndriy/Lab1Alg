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

    private static void addFaculty() {
        String facultyName = DataInput.getString("Введіть назву факультету:");
        Faculty faculty = new Faculty(facultyName);
        DataBase.getInstance().setFaculties(ArrayManager.addToAr(DataBase.getInstance().getFaculties(), faculty));
        System.out.println("Факультет успішно додано: " + facultyName);
    }

    private static void addCathedraToFaculty() {
        if (DataBase.getInstance().getFaculties().length !=0) {
            String cathedraName = DataInput.getString("Введіть назву кафедри:");
            String facultyName = DataInput.getString("Введіть назву факультету, до якого додається кафедра:");
            while (!ArrayManager.ifContains(DataBase.getInstance().getFaculties(), new Faculty(facultyName))) {
                char choice = DataInput.getChar("Щось не так. Введіть y, якщо хочете " +
                        "спробувати заново або b, щоб вийти");
                while (choice != 'y' && choice != 'b')
                    choice = DataInput.getChar("Щось не так. Введіть y, якщо хочете " +
                            "спробувати заново або b, щоб вийти");
                if(choice == 'b') break;
                facultyName = DataInput.getString("Введіть назву факультету, до якого додається кафедра:");
            }
           DataBase.getInstance().setCathedras(
                   ArrayManager.addToAr(
                           DataBase.getInstance().getCathedras(),
                           new Cathedra(cathedraName, new Faculty(facultyName))));

        }else {
            System.out.println("Немає факультетів для запису ");
        }
    }

    private static void addStudentToCathedra() {
       if(DataBase.getInstance().getGroups().length!=0){
           String nsp = DataInput.getString("Введіть ПІБ студента");
           int course = DataInput.getInt("Введіть курс");
           while (course<=0 || course>5)
               course = DataInput.getInt("Курс має бути від 1 до 5");
           int groupNum = DataInput.getInt("Введіть номер групи, на яку записуємо");
           String groupName = DataInput.getString("Введіть ім'я спеціальності");
           String cathedra = DataInput.getString("Введіть кафедру на якій спеціальність");
           String faculty = DataInput.getString("Введіть факультет, на якому кафедра");
           while(!ArrayManager.ifContains(DataBase.getInstance().getGroups(),
                   new Group(groupNum, groupName, new Cathedra(cathedra, new Faculty(faculty))))){
               char choice = DataInput.getChar("Щось не так. Введіть y, якщо хочете " +
                       "спробувати заново або b, щоб вийти");
               while (choice != 'y' && choice != 'b')
                   choice = DataInput.getChar("Щось не так. Введіть y, якщо хочете " +
                           "спробувати заново або b, щоб вийти");
               if(choice == 'b') break;
               groupNum = DataInput.getInt("Введіть номер групи, на яку записуємо");
               groupName = DataInput.getString("Введіть ім'я спеціальності");
               cathedra = DataInput.getString("Введіть кафедру на якій спеціальність");
               faculty = DataInput.getString("Введіть факультет, на якому кафедра");
           }
           DataBase.getInstance().setStudents(ArrayManager.addToAr(DataBase.getInstance().getStudents(),
                   new Student(nsp, course, new Group(groupNum, groupName, new Cathedra(cathedra, new Faculty(faculty))))));
       }else {
           System.out.println("Немає ще спеціальностей для запису ");
       }
    }

    private static void addTeacherToCathedra() {
        if(DataBase.getInstance().getCathedras().length!=0){
            String nsp = DataInput.getString("Введіть ПІБ викладача");
            String cathedra = DataInput.getString("Введіть кафедру на яку запишемо викладача");
            String faculty = DataInput.getString("Введіть факультет, на якому кафедра");
            while(!ArrayManager.ifContains(DataBase.getInstance().getCathedras(),
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
            DataBase.getInstance().setTeachers(ArrayManager.addToAr(DataBase.getInstance().getTeachers(), new Teacher(nsp,
                    new Cathedra(cathedra, new Faculty(faculty)))));
        }else {
            System.out.println("Немає ще кафедр для запису");
        }
    }

    private static void addStudentGroup() {
        if(DataBase.getInstance().getCathedras().length!=0){
            int groupNum = DataInput.getInt("Введіть номер групи");
            String groupName = DataInput.getString("Введіть ім'я групи");
            String cathedra = DataInput.getString("Введіть кафедру на якій група");
            String faculty = DataInput.getString("Введіть факультет, на якому кафедра");
            while(!ArrayManager.ifContains(DataBase.getInstance().getCathedras(),
                    new Cathedra(cathedra, new Faculty(faculty)))) {
                char choice = DataInput.getChar("Щось не так. Введіть y, якщо хочете " +
                        "спробувати заново або b, щоб вийти");
                while (choice != 'y' && choice != 'b')
                    choice = DataInput.getChar("Щось не так. Введіть y, якщо хочете " +
                            "спробувати заново або b, щоб вийти");
                if(choice == 'b') break;
                cathedra = DataInput.getString("Введіть кафедру на якій група");
                faculty = DataInput.getString("Введіть факультет, на якому кафедра");
            }
            DataBase.getInstance().setGroups(ArrayManager.addToAr(DataBase.getInstance().getGroups(),
                    new Group(groupNum, groupName, new Cathedra(cathedra, new Faculty(faculty)))));
        }else{
            System.out.println("Немає ще кафедр для запису");
        }
    }
}