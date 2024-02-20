/**
 * Цей клас (EditMenu) представляє меню редагування, де користувач може вибрати опції для створення,
 * видалення або редагування факультетів, кафедр факультета,
 * а також додавання, видалення або редагування студентів/викладачів до кафедри.
*/
public class EditMenu {
    private static Student[] students =DataBase.getInstance().getStudents();
    private static Teacher[] teachers= DataBase.getInstance().getTeachers();
    private static Faculty[] faculties=DataBase.getInstance().getFaculties();
    private static Cathedra[] cathedras=DataBase.getInstance().getCathedras();
    private static Group[] groups= DataBase.getInstance().getGroups();
    /**
     * Конструктор класу EditMenu.
     */
    public EditMenu() {

    }
    /**
     * Метод, який запускає головне меню редагування.
     */
    public static void run() {
        while (true) {
            String act = DataInput.getString("Введіть номер дії, яку хочете виконати:\n" +
                    "1. Видалити факультет\n" +
                    "2. Редагувати факультет\n" +
                    "3. Видалити кафедру факультета\n" +
                    "4. Редагувати кафедру факультета\n" +
                    "5. Видалити студента кафедри\n"+
                    "6. Редагувати студента кафедри\n" +
                    "7. Видалити викладача кафедри\n"+
                    "8. Редагувати викладача кафедри\n" +
                    "b. Повернутися до головного меню");

            switch (act) {
                case "1":
                    deleteFaculty();
                    break;
                case "2":
                    renameFactulty();
                    break;
                case "3":
                    delCathedraInFac();
                    break;
                case "4":
                    renameCathedraInFac();
                    break;
                case "5":
                    delStudentInCath();
                    break;
                case "6":
                    editStudentInCath();
                    break;
                case "7":
                    delTeacherInCath();
                    break;
                case "8":
                    editTeacherInCath();
                    break;
                case "b":
                    return;
                default:
                    System.out.println("Ви ввели невірну команду");
            }
        }
    }
    /**
     * Метод для редагування вчителя в кафедрі.
     */
    private static void editTeacherInCath() {
        String cathName= DataInput.getString("Введіть назву кафедри.");
        Cathedra[] cathArray=DataBase.getInstance().getCathedras();
        if(ArrayManager.ifContains(cathArray, cathName)){
            String nsp=DataInput.getString("Введіть ПІБ студента");
            for(int i=0;i< teachers.length;i++){
                if(teachers[i].getNsp().equals(nsp)){
                    editTeacher(teachers[i]);
                    break;
                }
                if(i+1== teachers.length){
                    System.out.println("Вчителя з таким іменем не існує");
                }
            }
        }
        else{
            System.out.println("Кафедри з такою назвою не існує");
        }
    }
    /**
     * Метод для редагування вчителя.
     */
    private static void editTeacher(Teacher teacher) {
        int answr=DataInput.getInt("\n"+
                "1.Змінити ПІБ.\n"+
                "2.Змінити кафедру.\n"+
                "3. Закінчити редагування студента і повернутися назад.");
        switch (answr){
            case 1:
                String newName= DataInput.getString("Введіть новий ПІБ");
                teacher.setNsp(newName);
                break;
            case 2:
                String newCathedra= DataInput.getString("Введіть нову назву кафедри");
                teacher.getCathedra().setCathName(newCathedra);

                break;
            case 3:
                return;
            default:
                System.out.println("Ви ввели невірну команду");

        }
    }
    /**
     * Метод для видалення вчителя з кафедри.
     */
    private static void delTeacherInCath() {
        String cathName= DataInput.getString("Введіть назву кафедри.");
        Cathedra[] cathArray=DataBase.getInstance().getCathedras();
        if(ArrayManager.ifContains(cathArray, cathName)){
            String nsp=DataInput.getString("Введіть ПІБ вчителя");
            for(int i=0;i< teachers.length;i++){
                if(teachers[i].getNsp().equals(nsp)){
                    ArrayManager.delFromArr(teachers,i);
                    break;
                }
                if(i+1== teachers.length){
                    System.out.println("Вчителя з таким іменем не існує");
                }
            }
        }
        else{
            System.out.println("Кафедри з такою назвою не існує");
        }
    }
    /**
     * Метод для редагування студента в кафедрі.
     */
    private static void editStudentInCath() {
        String cathName= DataInput.getString("Введіть назву кафедри.");
        Cathedra[] cathArray=DataBase.getInstance().getCathedras();
        if(ArrayManager.ifContains(cathArray, cathName)){
            String nsp=DataInput.getString("Введіть ПІБ студента");
            for(int i=0;i< students.length;i++){
                if(students[i].getNsp().equals(nsp)){
                    editStudent(students[i]);
                    break;
                }
                if(i+1== students.length){
                    System.out.println("Учня з таким іменем не існує");
                }
            }
        }
        else{
            System.out.println("Кафедри з такою назвою не існує");
        }
    }
    /**
     * Метод для редагування студента.
     */
    private static void editStudent(Student student) {
        int answr=DataInput.getInt("\n"+
                "1.Змінити ПІБ.\n"+
                "2.Змінити курс.\n"+
                "3.Змінити спеціальність.\n"+
                "4. Закінчити редагування студента і повернутися назад.");
        switch (answr){
            case 1:
                String newName= DataInput.getString("Введіть новий ПІБ");
                student.setNsp(newName);
                break;
            case 2:
                int newCourse=DataInput.getInt("Ведіть новий номер курсу");
                student.setCourse(newCourse);
                break;
            case 3:
                String newGroupName= DataInput.getString("Введіть нову спеціальність");
                student.getGroup().setGroupName(newGroupName);
                break;
            case 4:
                return;
            default:
                System.out.println("Ви ввели невірну команду");

        }
    }
    /**
     * Метод для видалення студента з кафедри.
     */
    private static void delStudentInCath() {
        String cathName= DataInput.getString("Введіть назву кафедри.");
        Cathedra[] cathArray=DataBase.getInstance().getCathedras();
        if(ArrayManager.ifContains(cathArray, cathName)){
            String nsp=DataInput.getString("Введіть ПІБ студента");
            for(int i=0;i< students.length;i++){
                if(students[i].getNsp().equals(nsp)){
                    ArrayManager.delFromArr(students,i);
                    break;
                }
                if(i+1== students.length){
                    System.out.println("Учня з таким іменем не існує");
                }
            }
        }
        else{
            System.out.println("Кафедри з такою назвою не існує");
        }
    }
    /**
     * Метод для перейменування кафедри в межах факультету.
     */
    private static void renameCathedraInFac() {
        String facCathDel = DataInput.getString("Введіть назву факультету. ");
        Faculty searchFac=new Faculty(facCathDel);
        if (ArrayManager.ifContains(DataBase.getInstance().getFaculties(), searchFac)) {
            String cathName= DataInput.getString("Введіть назву кафедри.");
            Cathedra searchCath= new Cathedra(cathName,searchFac);
            if(ArrayManager.ifContains(cathedras, searchCath)){
                String newCathName= DataInput.getString("Введіть нову назву кафедри. ");
                searchCath.setCathName(newCathName);
                // перевірка чи є вже нова назва кафедри в списках
                if(!ArrayManager.ifContains(cathedras, searchCath)){
                    for (Cathedra cath : cathedras) {
                        if (cath.getCathName().equals(cathName)) {
                            cath.setCathName(newCathName);
                            break;
                        }
                    }
                    System.out.println("Succ. Кафедру перейменовано");
                }
                else{
                    System.out.println("Кафедра з такою назвою вже існує");
                }
            }
            else{
                System.out.println("Кафедри з такою назвою не існує");
            }
        } else {
            System.out.println("Факультету з такою назвою не існує");
        }
    }
    /**
     * Метод для видалення кафедри в межах факультету.
     */
    private static void delCathedraInFac() {
        String facCathDel = DataInput.getString("Введіть назву факультету. ");
        Faculty searchFac=new Faculty(facCathDel);
        if (ArrayManager.ifContains(faculties, searchFac)) {
            String cathDel = DataInput.getString("Введіть назву кафедри. Все, що пов'язате з цією кафедрою буде видалене!!! ");
            Cathedra searchCath=new Cathedra(cathDel,searchFac);
            if(ArrayManager.ifContains(cathedras, searchCath)){
                for(int i=0;i< cathedras.length;i++){
                    if(cathedras[i].getCathName().equals(cathDel)){
                        delAllteachers(cathDel);
                        deleteGroup(cathDel);
                        ArrayManager.delFromArr(cathedras,i);
                        break;
                    }
                }
                System.out.println("Succ. Кафедру видалено");
            }
            else{
                System.out.println("Кафедри з такою назвою не існує");
            }

        } else {
            System.out.println("Факультету з такою назвою не існує");
        }
    }
    private static void delAllCathedras(String facName) {
        for(int i=0;i< cathedras.length; i++){
            if(cathedras[i].getFaculty().getFacName().equals(facName)){
                delAllteachers(cathedras[i].getCathName());
                deleteGroup(cathedras[i].getCathName());
                i--;
            }
        }
    }
    /**
     * Метод для перейменування факультету.
     */
    private static void renameFactulty() {
        String s = DataInput.getString("Введіть назву факультету. Який треба змінити ");
        Faculty searchFac=new Faculty(s);
        if (ArrayManager.ifContains(faculties, searchFac)) {
            String newFacName = DataInput.getString("Введіть нову назву факультету. ");
            searchFac.setFacName(newFacName);
            if(!ArrayManager.ifContains(faculties, searchFac)) {
                for (Faculty fac : faculties) {
                    if (fac.getFacName().equals(s)) {
                        fac.setFacName(newFacName);
                        break;
                    }
                }
                System.out.println("Succ. Факультет перейменовано");
            }
            else {
                System.out.println("Факультет з такою назвою вже існує");
            }
        } else {
            System.out.println("Факультету з такою назвою не існує");
        }
    }
    /**
     * Метод для видалення факультету.
     */
    private static void deleteFaculty() {

        String s = DataInput.getString("Введіть назву факультету. Все, що пов'язате з цим факультетом буде видалене!!! ");
        Faculty searchFac=new Faculty(s);
        if (ArrayManager.ifContains(DataBase.getInstance().getFaculties(), searchFac)) {
            //видалення кафедр
            delAllCathedras(s);
            System.out.println("Succ.Факультет видалено");
        } else {
            System.out.println("Факультету з такою назвою не існує");
        }
    }
    /**
     * Метод для видалення всіх вчителів в кафедрі.
     */
    private static void  delAllteachers(String cathName){
        //видалення вчителів
        for (int j = 0; j < teachers.length; j++) {
            if (teachers[j].getCathedra().getCathName().equals(cathName)) {
                ArrayManager.delFromArr(DataBase.getInstance().getTeachers(), j);
                j--;
            }
        }
    }
    /**
     * Метод для видалення всіх спеціальностей та всіх учнів в кафедрі.
     */
    private static void deleteGroup(String cathName) {
        //видалення груп/спеціальностей+ студентів
        for (int j = 0; j < groups.length; j++) {
            if (groups[j].getCathedra().getCathName().equals(cathName)) {
                String groupName = DataBase.getInstance().getGroups()[j].getGroupName();
                // видалення студентів
                for (int k = 0; k < students.length; k++) {
                    if (students[k].getGroup().getGroupName().equals(groupName)) {
                        ArrayManager.delFromArr(students, k);
                        k--;
                    }
                }
                ArrayManager.delFromArr(groups, j);
                j--;
            }
        }
    }

}
