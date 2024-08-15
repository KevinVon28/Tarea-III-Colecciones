import java.util.List;

public interface StudentManager {
    void addStudent(Student student);
    void removeStudent(int id) throws StudentNotFoundException;
    Student findStudent(int id) throws StudentNotFoundException;
    List<Student> getAllStudents();
}

