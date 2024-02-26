
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
    public void addStudent(Student student) {
        Student[] newStudents = new Student[students.length + 1];
        System.arraycopy(students, 0, newStudents, 0, students.length);
        newStudents[students.length] = student;
        students = newStudents;
    }

    public void addTeacher(Teacher teacher) {
        Teacher[] newTeachers = new Teacher[teachers.length + 1];
        System.arraycopy(teachers, 0, newTeachers, 0, teachers.length);
        newTeachers[teachers.length] = teacher;
        teachers = newTeachers;
    }

    public void addFaculty(Faculty faculty) {
        Faculty[] newFaculties = new Faculty[faculties.length + 1];
        System.arraycopy(faculties, 0, newFaculties, 0, faculties.length);
        newFaculties[faculties.length] = faculty;
        faculties = newFaculties;
    }

    public void addCathedra(Cathedra cathedra) {
        Cathedra[] newCathedras = new Cathedra[cathedras.length + 1];
        System.arraycopy(cathedras, 0, newCathedras, 0, cathedras.length);
        newCathedras[cathedras.length] = cathedra;
        cathedras = newCathedras;
    }

    public void addGroup(Group group) {
        Group[] newGroups = new Group[groups.length + 1];
        System.arraycopy(groups, 0, newGroups, 0, groups.length);
        newGroups[groups.length] = group;
        groups = newGroups;
    }
}