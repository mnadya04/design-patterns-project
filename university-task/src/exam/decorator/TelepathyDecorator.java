package exam.decorator;

import exam.student.Student;
import exam.task.Task;

public class TelepathyDecorator extends SuperpowerDecorator {

    public TelepathyDecorator(Student wrapped) {
        super(wrapped);
    }

    @Override
    public void solve(Task task) {
        System.out.println("[Телепатия активирана!] " + getName() + " чете мислите на преподавателя!");
        super.solve(task);
        System.out.println("[Телепатия] Отговорите бяха „телепатично точни!");
    }
}
