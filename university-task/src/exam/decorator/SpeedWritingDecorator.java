package exam.decorator;

import exam.student.Student;
import exam.task.Task;

public class SpeedWritingDecorator extends SuperpowerDecorator {

    public SpeedWritingDecorator(Student wrapped) {
        super(wrapped);
    }

    @Override
    public void solve(Task task) {
        System.out.println("[Бързопис активиран!] " + getName() + " пише със скоростта на светлината!");
        super.solve(task);
        System.out.println("[Бързопис] Готово за 3 секунди!");
    }
}
