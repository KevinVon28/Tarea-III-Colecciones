import java.util.List;
import java.util.stream.Collectors;

public class StudentManagerImpl implements StudentManager {
    private GenericList<Student> studentList = new GenericList<>();

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void removeStudent(int id) throws StudentNotFoundException {
        Student student = findStudent(id);
        studentList.remove(student);
    }

    @Override
    public Student findStudent(int id) throws StudentNotFoundException {
        return studentList.getAll().stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException("Student with ID " + id + " not found."));
    }

    @Override
    public List<Student> getAllStudents() {
        return studentList.getAll();
    }

    // Filtrar estudiantes mayores de 21 años
    public List<Student> getStudentsAboveAge(int age) {
        return studentList.getAll().stream()
                .filter(student -> student.getAge() > age)
                .collect(Collectors.toList());
    }

    // Ordenar estudiantes por nombre
    public List<Student> sortStudentsByName() {
        return studentList.getAll().stream()
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .collect(Collectors.toList());
    }
}

