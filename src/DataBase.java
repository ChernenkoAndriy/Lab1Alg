
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
        students = new Student[0];
        teachers = new Teacher[0];
        faculties = new Faculty[0];
        cathedras = new Cathedra[0];
        groups = new Group[0];
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
}

