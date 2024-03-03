import java.util.Arrays;

/**
 * The StatMenu class represents a menu for performing various actions related to university data.
 */
public class StatMenu {

    /**
     * Constructs a new StatMenu instance.
     */
    public StatMenu() {
    }

    /**
     * Runs the main loop of the statistics menu.
     */
    public static void run() {
        while (true) {
            String act = DataInput.getString("Введіть номер дії, яку хочете виконати:\n" +
                    "1. Вивести всіх студентів впорядкованих за курсами\n" +
                    "2. Вивести всіх студентів факультета впорядкованих за алфавітом\n" +
                    "3. Вивести всіх викладачів факультета впорядкованих за алфавітом\n" +
                    "4. Вивести всіх студентів кафедри впорядкованих за курсами\n" +
                    "5. Вивести всіх студентів кафедри впорядкованих за алфавітом\n" +
                    "6. Вивести всіх викладачів кафедри впорядкованих за алфавітом\n" +
                    "7. Вивести всіх студентів кафедри вказаного курсу\n" +
                    "8. Вивести всіх студентів кафедри вказаного курсу впорядкованих за алфавітом\n" +
                    "9. Вивести студента за ПІБ\n" +
                    "10. Вивести викладача за ПІБ \n" +
                    "11. Вивести студента за спеціальністю\n" +
                    "b. Повернутися до головного меню");

            switch (act) {
                case "1":
                    if (DataBase.getInstance().getStudents().length != 0) {
                        ArrayManager.print(studentsBycourses(DataBase.getInstance().getStudents()));
                    } else {
                        System.out.println("Немає студентів");
                    }
                    break;
                case "2":
                    String faculty = DataInput.getString("Введіть назву факультета");
                    Faculty fac = new Faculty(faculty);
                    if (ArrayManager.ifContains(DataBase.getInstance().getFaculties(), fac)){
                    Student[] students = new Student[0];
                    for (Student stud : DataBase.getInstance().getStudents()) {
                        if (stud.getGroup().getCathedra().getFaculty().equals(fac))
                            students = ArrayManager.addToAr(students, stud);
                     }
                    if(students.length!=0){
                  ArrayManager.print(humanByNames(students));
                    }else{
                        System.out.println("Немає студентів на факультеті");
                    }
                    } else {
                    System.out.println("Немає такого факультета");
                }
                break;
                case "3":
                     faculty = DataInput.getString("Введіть назву факультета");
                     fac = new Faculty(faculty);
                    if (ArrayManager.ifContains(DataBase.getInstance().getFaculties(), fac)){
                        Teacher[] teachers = new Teacher[0];
                        for (Teacher teach : DataBase.getInstance().getTeachers()) {
                            if (teach.getCathedra().getFaculty().equals(fac))
                                teachers = ArrayManager.addToAr(teachers, teach);
                        }
                        if(teachers.length!=0){
                            ArrayManager.print(humanByNames(teachers));
                        }else{
                            System.out.println("Немає викладачів на факультеті");
                        }
                    } else {
                        System.out.println("Немає такого факультета");
                    }
                    break;
                case "4":
                    String cathedraName = DataInput.getString("Введіть назву кафедри, яку шукаємо");
                    faculty = DataInput.getString("Введіть назву факультета, до якого належить кафедра");
                    Cathedra cath = new Cathedra(cathedraName, new Faculty(faculty));
                    if (ArrayManager.ifContains(DataBase.getInstance().getCathedras(), cath)) {
                        Student[] array = new Student[0];
                        for (Student student : DataBase.getInstance().getStudents()) {
                            if (student.getGroup().getCathedra().equals(cath))
                                array = ArrayManager.addToAr(array, student);
                        }
                        if (array.length != 0) {
                            ArrayManager.print(studentsBycourses(array));
                        } else {
                            System.out.println("Немає студентів");
                        }
                    } else {
                        System.out.println("Немає такої");
                    }
                    // виведення всіх студентів кафедри впорядкованих за курсами
                    break;
                case "5":
                    cathedraName = DataInput.getString("Ввеліть назву кафедри, яку шукаємо");
                    faculty = DataInput.getString("Введіть назву факультета, до якого належить кафедра");
                    cath = new Cathedra(cathedraName, new Faculty(faculty));
                    if (ArrayManager.ifContains(DataBase.getInstance().getCathedras(), cath)) {
                        Teacher[] array = new  Teacher[0];
                        for ( Teacher teacher : DataBase.getInstance().getTeachers()) {
                            if (teacher.getCathedra().equals(cath))
                               array = ArrayManager.addToAr(array, teacher);
                        }
                        if (array.length != 0) {
                            ArrayManager.print(humanByNames(array));
                        } else {
                            System.out.println("Немає студентів");
                        }
                    } else {
                        System.out.println("Немає такої");
                    }
                    // виведення всіх студентів кафедри впорядкованих за алфавітом
                    break;
                case "6":
                    cathedraName = DataInput.getString("Ввеліть назву кафедри, яку шукаємо");
                    faculty = DataInput.getString("Введіть назву факультета, до якого належить кафедра");
                    cath = new Cathedra(cathedraName, new Faculty(faculty));
                    if (ArrayManager.ifContains(DataBase.getInstance().getCathedras(), cath)) {
                        Teacher[] array = new Teacher[0];
                        for (Teacher teacher : DataBase.getInstance().getTeachers()) {
                            if (teacher.getCathedra().equals(cath))
                                array = ArrayManager.addToAr(array, teacher);
                        }
                        if (array.length != 0) {
                            ArrayManager.print(humanByNames(array));
                        } else {
                            System.out.println("Немає викладачів");
                        }
                    } else {
                        System.out.println("Немає такої");
                    }
                    // виведення всіх викладачів кафедри впорядкованих за алфавітом
                    break;
                case "7":
                    cathedraName = DataInput.getString("Ввеліть назву кафедри, яку шукаємо");
                    faculty = DataInput.getString("Введіть назву факультета, до якого належить кафедра");
                    int course = DataInput.getInt("Введіть курс");
                    cath = new Cathedra(cathedraName, new Faculty(faculty));
                    if (ArrayManager.ifContains(DataBase.getInstance().getCathedras(), cath)) {
                        Student[] array = new Student[0];
                        for (Student stud : DataBase.getInstance().getStudents()) {
                            if (stud.getGroup().getCathedra().equals(cath)&& stud.getCourse()==course)
                                array = ArrayManager.addToAr(array, stud);
                        }
                        if (array.length != 0) {
                            ArrayManager.print(array);
                        } else {
                            System.out.println("Немає студентів такого курсу на такій кафедрі");
                        }
                    } else {
                        System.out.println("Немає такої");
                    }
                    // виведення всіх студентів кафедри вказаного курсу
                    break;
                case "8":
                    cathedraName = DataInput.getString("Ввеліть назву кафедри, яку шукаємо");
                    faculty = DataInput.getString("Введіть назву факультета, до якого належить кафедра");
                     course = DataInput.getInt("Введіть курс");
                    cath = new Cathedra(cathedraName, new Faculty(faculty));
                    if (ArrayManager.ifContains(DataBase.getInstance().getCathedras(), cath)) {
                        Student[] array = new Student[0];
                        for (Student stud : DataBase.getInstance().getStudents()) {
                            if (stud.getGroup().getCathedra().equals(cath)&& stud.getCourse()==course)
                                array = ArrayManager.addToAr(array, stud);
                        }
                        if (array.length != 0) {
                            ArrayManager.print(humanByNames(array));
                        } else {
                            System.out.println("Немає студентів");
                        }
                    } else {
                        System.out.println("Немає такої");
                    }
                    // виведення всіх студентів кафедри вказаного курсу впорядкованих за алфавітом
                    break;
                case "9":
                   String nsp = DataInput.getString("Введіть ПІБ");
                    int counter = 0;
                   for (Student student : DataBase.getInstance().getStudents()) {
                       if (student.getNsp().equals(nsp)) {
                           System.out.println(student);
                           ++counter;
                       }
                   }
                   if(counter==0)
                       System.out.println("Немає студентів з таким прізвищем");
                    break;
                case "10":
                    nsp = DataInput.getString("Введіть ПІБ");
                    counter = 0;
                    for (Teacher teacher : DataBase.getInstance().getTeachers()) {
                        if (teacher.getNsp().equals(nsp)) {
                            System.out.println(teacher);
                            ++counter;
                        }
                    }
                    if(counter==0)System.out.println("Немає викладачів з таким прізвищем");
                    break;
                case "11":
                   String groupName = DataInput.getString("Введіть назву спеціальності");
                   int groupNum = DataInput.getInt("Введіть її номер");
                   String cathname = DataInput.getString("Введіть назву кафедри, до якої належить спеціальність");
                   String facName = DataInput.getString("Введіть назву факультета");
                   Group group = new Group(groupNum, groupName, new Cathedra(cathname, new Faculty(facName)));
                   if (ArrayManager.ifContains(DataBase.getInstance().getGroups(), group)) {
                       Student[] array = new Student[0];
                       for (Student stud : DataBase.getInstance().getStudents()) {
                           if (stud.getGroup().equals(group))
                               array = ArrayManager.addToAr(array, stud);
                       }
                       if(array.length!=0){
                           ArrayManager.print(array);
                       }else{
                           System.out.println("Немає студентів на групі");
                       }
                   }else{
                       System.out.println("Немає такої групи");
                   }
                    break;
                case "b":
                    return;
                default:
                    System.out.println("Ви ввели невірну команду");
            }
        }
    }

    /**
     * Sorts an array of students based on their courses.
     *
     * @param students The array of students to be sorted.
     * @return The sorted array of students.
     */
    private static Student[] studentsBycourses(Student[] students) {
        int n = students.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].getCourse() < students[j + 1].getCourse()) {
                    // Обмін елементів, якщо потрібно
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        return students;
    }

    /**
     * Displays humans (students or teachers) ordered alphabetically by names.
     *
     * @param human The array of humans.
     * @return Sorted array of humans.
     */
    private static Human[] humanByNames(Human[] human) {
        Arrays.sort(human);
        return human;
    }
}
