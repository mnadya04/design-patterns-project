package exam.student;

import exam.task.Task;

public interface Student {
    String getName();
    StudentType getType();
    void arriveAtUniversity();   // Strategy се извиква тук
    void solve(Task task);
}
