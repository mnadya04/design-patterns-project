package exam.university;

public class University {

    private static University instance;
    private final String name = "Пловдивски Университет";

    private University() {
        System.out.println("Университетът е отворен: " + name);
    }

    public static University getInstance() {
        if (instance == null) {
            instance = new University();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void conductExam(exam.student.Student student) {
        System.out.println("\nУниверситетът разпознава студента: " + student.getName());

        exam.task.Task task = exam.task.TaskFactory.createTask(student.getType());
        System.out.println("Получена задача: " + task.getDescription());

        student.solve(task);
    }
}
