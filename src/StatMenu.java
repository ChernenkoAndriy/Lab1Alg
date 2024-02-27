import java.util.Arrays;

public class StatMenu {
    public StatMenu() {
    }

    public static void run() {
        while (true) {
            int act = DataInput.getInt("Введіть номер дії, яку хочете виконати:\n" +
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
                case 1:
                    if (DataBase.getInstance().getStudents().length != 0) {
                        System.out.println(Arrays.toString(studentsBycourses(DataBase.getInstance().getStudents())));
                    } else {
                        System.out.println("Немає студентів");
                    }
                    break;
                case 2:
                    String faculty = DataInput.getString("Введіть назву факультета");
                    Faculty fac = new Faculty(faculty);
                    if (ArrayManager.ifContains(DataBase.getInstance().getFaculties(), fac)){
                    Student[] students = new Student[0];
                    for (Student stud : DataBase.getInstance().getStudents()) {
                        if (stud.getGroup().getCathedra().getFaculty().equals(fac))
                            students = ArrayManager.addToAr(students, stud);
                     }
                    if(students.length!=0){
                        System.out.println(Arrays.toString(humanByNames(students)));
                    }else{
                        System.out.println("Немає студентів на факультеті");
                    }
                    } else {
                    System.out.println("Немає такого факультета");
                }
                break;
                case 3:
                     faculty = DataInput.getString("Введіть назву факультета");
                     fac = new Faculty(faculty);
                    if (ArrayManager.ifContains(DataBase.getInstance().getFaculties(), fac)){
                        Teacher[] teachers = new Teacher[0];
                        for (Teacher teach : DataBase.getInstance().getTeachers()) {
                            if (teach.getCathedra().getFaculty().equals(fac))
                                teachers = ArrayManager.addToAr(teachers, teach);
                        }
                        if(teachers.length!=0){
                            System.out.println(Arrays.toString(humanByNames(teachers)));
                        }else{
                            System.out.println("Немає студентів на факультеті");
                        }
                    } else {
                        System.out.println("Немає такого факультета");
                    }
                    break;
                case 4:
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
                            System.out.println(Arrays.toString(studentsBycourses(array)));
                        } else {
                            System.out.println("Немає студентів");
                        }
                    } else {
                        System.out.println("Немає такої");
                    }

                    // виведення всіх студентів кафедри впорядкованих за курсами
                    break;
                case 5:
                    cathedraName = DataInput.getString("Ввеліть назву кафедри, яку шукаємо");
                    faculty = DataInput.getString("Введіть назву факультета, до якого належить кафедра");
                    cath = new Cathedra(cathedraName, new Faculty(faculty));
                    if (ArrayManager.ifContains(DataBase.getInstance().getCathedras(), cath)) {
                        Student[] array = new Student[0];
                        for (Student student : DataBase.getInstance().getStudents()) {
                            if (student.getGroup().getCathedra().equals(cath))
                               array = ArrayManager.addToAr(array, student);
                        }
                        if (array.length != 0) {
                            System.out.println(Arrays.toString(humanByNames(array)));
                        } else {
                            System.out.println("Немає студентів");
                        }
                    } else {
                        System.out.println("Немає такої");
                    }
                    // виведення всіх студентів кафедри впорядкованих за алфавітом
                    break;
                case 6:
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
                            System.out.println(Arrays.toString(humanByNames(array)));
                        } else {
                            System.out.println("Немає викладачів");
                        }
                    } else {
                        System.out.println("Немає такої");
                    }
                    // виведення всіх викладачів кафедри впорядкованих за алфавітом
                    break;
                case 7:
                    
                    // виведення всіх студентів кафедри вказаного курсу
                    break;
                case 8:
                    // виведення всіх студентів кафедри вказаного курсу впорядкованих за алфавітом
                    break;
                case 9:
                    // виведення всіх студентів кафедри вказаного курсу впорядкованих за алфавітом
                    break;
                case 10:
                    // виведення всіх студентів кафедри вказаного курсу впорядкованих за алфавітом
                    break;
                case 11:
                    // виведення всіх студентів кафедри вказаного курсу впорядкованих за алфавітом
                    break;
                case 'b':
                    return;
                default:
                    System.out.println("Ви ввели невірну команду");
            }
        }
    }

    private static Student[] studentsBycourses(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].compareTo(students[i]) == -1) {
                Student a = students[i];
                students[i] = students[i + 1];
                students[i + 1] = a;
            }
        }
        return students;

    }

    private static Human[] humanByNames(Human[] human) {
        Arrays.sort(human);
        return human;
    }
}
