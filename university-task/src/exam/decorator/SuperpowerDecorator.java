package exam.decorator;

import exam.student.Student;
import exam.student.StudentType;
import exam.task.Task;

public abstract class SuperpowerDecorator implements Student {

    protected final Student wrapped;

    public SuperpowerDecorator(Student wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getName() { return wrapped.getName(); }

    @Override
    public StudentType getType() { return wrapped.getType(); }

    @Override
    public void arriveAtUniversity() { wrapped.arriveAtUniversity(); }

    @Override
    public void solve(Task task) { wrapped.solve(task); }
}
