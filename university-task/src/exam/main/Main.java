package exam.main;

import exam.decorator.HyperFocusDecorator;
import exam.decorator.SpeedWritingDecorator;
import exam.decorator.TelepathyDecorator;
import exam.strategy.BusSleepStrategy;
import exam.strategy.RunningWithJumpsStrategy;
import exam.strategy.TeleportationStrategy;
import exam.student.ConcreteStudent;
import exam.student.Student;
import exam.student.StudentType;
import exam.university.University;

public class Main {

    public static void main(String[] args) {

        University uni = University.getInstance();
        University uni2 = University.getInstance();

        System.out.println("Един и същи университет: " + (uni == uni2));
        System.out.println("=".repeat(55));

    }
}
