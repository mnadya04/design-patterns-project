package exam.decorator;

import exam.student.Student;
import exam.task.Task;

public class HyperFocusDecorator extends SuperpowerDecorator {

    public HyperFocusDecorator(Student wrapped) {
        super(wrapped);
    }

    @Override
    public void solve(Task task) {
        System.out.println("[Свръхконцентрация активирана!] " + getName() + " влиза в зоната!");
        super.solve(task);
        System.out.println("[Свръхконцентрация] Задачата е решена с невероятна прецизност!");
    }
}
