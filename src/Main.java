public class Main {
    public static void main(String[] args) {
        StudentManagerImpl manager = new StudentManagerImpl();

        // Agregar estudiantes
        manager.addStudent(new Student(1, "Angie", 22));
        manager.addStudent(new Student(2, "Kevin", 20));
        manager.addStudent(new Student(3, "Henry", 23));

        // Mostrar todos los estudiantes
        System.out.println("Lista completa de estudiantes:");
        manager.getAllStudents().forEach(System.out::println);

        // Filtrar estudiantes mayores de 21 años
        System.out.println("\nEstudiantes mayores de 21 años:");
        manager.getStudentsAboveAge(21).forEach(System.out::println);

        // Ordenar estudiantes por nombre
        System.out.println("\nEstudiantes ordenados por nombre:");
        manager.sortStudentsByName().forEach(System.out::println);

        // Buscar un estudiante
        try {
            System.out.println("\nBuscando estudiante con ID 1:");
            System.out.println(manager.findStudent(1));
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Eliminar un estudiante
        try {
            manager.removeStudent(2);
            System.out.println("\nLista después de eliminar al estudiante con ID 2:");
            manager.getAllStudents().forEach(System.out::println);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
