import java.util.StringTokenizer;

/*
Автор: Максим Семенюк
Опис класу: Клас, що представляє вчителя в університеті.
 */
public class Teacher {
    private String fullName;   // ПІБ вчителя
    private String faculty;     // Факультет, на якому працює вчитель
    private String department;  // Кафедра, на якій працює вчитель
    private int experience;     // Стаж в університеті

    /**
     * Пустий контруктор
     */
    public Teacher() {

    }
    /**
     * Конструктор класу Teacher.
     *
     * @param fullName    ПІБ вчителя.
     * @param faculty     Факультет, на якому працює вчитель.
     * @param department  Кафедра, на якій працює вчитель.
     * @param experience  Стаж в університеті.
     */
    public Teacher(String fullName, String faculty, String department, int experience) {
        this.fullName = fullName;
        this.faculty = faculty;
        this.department = department;
        this.experience = experience;
    }

    /**
     * Отримати ПІБ вчителя.
     *
     * @return ПІБ вчителя.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Встановити ПІБ вчителя.
     *
     * @param fullName Нове ПІБ вчителя.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Отримати факультет, на якому працює вчитель.
     *
     * @return Факультет вчителя.
     */
    public String getFaculty() {
        return faculty;
    }

    /**
     * Встановити факультет вчителя.
     *
     * @param faculty Новий факультет вчителя.
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    /**
     * Отримати кафедру, на якій працює вчитель.
     *
     * @return Кафедра вчителя.
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Встановити кафедру вчителя.
     *
     * @param department Нова кафедра вчителя.
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Отримати стаж в університеті.
     *
     * @return Стаж вчителя.
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Встановити стаж в університеті.
     *
     * @param experience Новий стаж вчителя.
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }
    /**
     *Встановити всю інформацію про певного вчителя з файлу зі стрічки
     *
     * @param s Інформація про певного вчителя
     */
    public void setTeacherFullInfo(String s){
        StringTokenizer tk=new StringTokenizer(s);
        for(int i=1; tk.hasMoreElements();i++){
            switch (i){
                case 1:
                    this.fullName= tk.nextToken();
                    break;
                case 2:
                    this.faculty= tk.nextToken();
                    break;
                case 3:
                    this.department= tk.nextToken();
                    break;
                default:
                    this.experience= Integer.parseInt(tk.nextToken());
            }
        }
    }

    /**
     * Повертає стрічку з повною інформацією про вчителя перед записом в файл
     *
     * @return Повна інформація про вчителя для файлу
     */
    public String getTeacherFullInfo(){
        return fullName+" "+faculty+" "+department+" "+experience;
    }
    /**
     *Отримати всю інформацію про вчителя у вигляді стрічки
     *
     * @return Стрічка з повною інформацією про вчителя
     */
    @Override
    public String toString() {
        return "Вчитель: " +
                "ПІБ: " + fullName +
                ", факультет: " + faculty +
                ", кафедра: " + department+
                ", стаж в університеті: "+experience+";";
    }
}
/* Тестовий клас для перевірки класу Teacher
class Test{
    public static void main(String[] args) {
            String s="Petro IPZ FI 35";
                Teacher th=new Teacher();
            th.setTeacherFullInfo(s);

        System.out.println(th);
        s=th.getTeacherFullInfo();
        System.out.println(s);
    }
}*/
