/*
 *Автор: Максим Семенюк
 *Опис класу: Клас, що представляє учня в університеті.
 */

import java.util.StringTokenizer;

public class Student {
    // Поля класу
    private String fullName;   // ПІБ студента
    private int group;       // Група студента
    private int course;         // Курс студента
    private String specialty;   // Спеціальність студента
    private String faculty;     // Факультет студента
    private String department;  // Кафедра студента

    /**
     * Пустий конструктор
     */
    public Student() {

    }


    /**
     * Конструктор класу Student
     *
     * @param fullName   Прізвище,ім'я,по батькові
     * @param group      Група
     * @param course     Курс
     * @param specialty  Спеціальність
     * @param faculty    Факультет
     * @param department Кафедра
     */
    public Student(String fullName, int group, int course, String specialty, String faculty, String department) {
        this.fullName = fullName;
        this.group = group;
        this.course = course;
        this.specialty = specialty;
        this.faculty = faculty;
        this.department = department;
    }


    /**
     * Повернути ПІБ студента
     *
     * @return повертає ПІБ студента
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Встановити новий ПІБ студента
     *
     * @param fullName Новий ПІБ студента
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Повернути номер групи
     *
     * @return Номер групи
     */
    public int getGroup() {
        return group;
    }

    /**
     * Встановити новий номер групи
     *
     * @param group Новий номер групи
     */
    public void setGroup(int group) {
        this.group = group;
    }

    /**
     * Повернути номер курсу
     *
     * @return Номер курсу
     */
    public int getCourse() {
        return course;
    }

    /**
     * Встановити новий номер курсу
     *
     * @param course Новий номер курсу
     */
    public void setCourse(int course) {
        this.course = course;
    }

    /**
     * Повернути назву спеціальності
     *
     * @return Назва спеціальності
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * Встановити нову назву спеціальності
     *
     * @param specialty Нова назва спеціальності
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * Повернути назву факультету
     *
     * @return Назва факультету
     */
    public String getFaculty() {
        return faculty;
    }

    /**
     * Встановити нову назву факультету
     *
     * @param faculty Нова назва факультету
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    /**
     * Повернути назву кафедри
     *
     * @return Назва кафедри
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Встановити нову назву кафедри
     *
     * @param department Нова назва кафедри
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Встановити всю інформацію про студента зі стрічки з файлу
     *
     * @param s Інформація про певного студента
     */
    public void setStudentFullInfo(String s) {
        StringTokenizer tk = new StringTokenizer(s);
        for (int i = 1; tk.hasMoreElements(); i++) {
            switch (i) {
                case 1:
                    this.fullName = tk.nextToken();
                    break;
                case 2:

                    this.group = Integer.parseInt(tk.nextToken());
                    ;
                    break;
                case 3:
                    this.course = Integer.parseInt(tk.nextToken());
                    ;
                    break;

                case 4:
                    this.specialty = tk.nextToken();
                    break;
                case 5:
                    this.faculty = tk.nextToken();
                    break;
                default:
                    this.department = tk.nextToken();

            }
        }
    }

    /**
     * Повертає стрічку з повною інформацією про студента перед записом в файл
     *
     * @return Повна інформація про студента
     */
    public String getStudentFullInfo() {
        return fullName + " " + group + " " + course + " " + specialty + " " + faculty + " " + department;
    }

    /**
     * Повертає повну інформацію про студента у вигляді стрічки
     *
     * @return Стрічка з повною інформацією про студента
     */
    @Override
    public String toString() {
        return "Студент: " +
                "ПІБ: " + fullName +
                ", група: " + group +
                ", курс: " + course +
                ", спеціальність: " + specialty +
                ", факультет: " + faculty +
                ", кафедра: " + department + ";";
    }
}
/* Тестовий клас для перевірки класу Student
class Test{
    public static void main(String[] args) {
            String s="Petro 2 4 IPZ FI Dep";
            Student st=new Student();
            st.setStudentFullInfo(s);
        System.out.println(st);
        s=st.getStudentFullInfo();
        System.out.println(s);
    }
}*/

