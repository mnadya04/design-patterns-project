package exam.student;

import exam.strategy.ArrivalStrategy;
import exam.task.Task;

public class ConcreteStudent implements Student {

    private final String name;
    private final StudentType type;
    private final ArrivalStrategy arrivalStrategy;

    public ConcreteStudent(String name, StudentType type, ArrivalStrategy arrivalStrategy) {
        this.name = name;
        this.type = type;
        this.arrivalStrategy = arrivalStrategy;
    }

    @Override
    public String getName() { return name; }

    @Override
    public StudentType getType() { return type; }

    @Override
    public void arriveAtUniversity() {
        arrivalStrategy.arrive(name);
    }

    @Override
    public void solve(Task task) {
        System.out.println(name + " решава задачата нормално.");
    }
}
