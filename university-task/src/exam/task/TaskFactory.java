package exam.task;

import exam.student.StudentType;

public class TaskFactory {

    public static Task createTask(StudentType type) {
        return switch (type) {
            case WUNDERKIND  -> new FunTask();
            case FITNESS_FAN -> new ConfusingTask();
            case LUCKY_ONE   -> new EasyTask();
        };
    }
}
