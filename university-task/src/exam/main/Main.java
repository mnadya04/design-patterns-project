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


        Student vancho = new ConcreteStudent("Ванчо (Вундеркинд)",
                StudentType.WUNDERKIND,
                new RunningWithJumpsStrategy());
        vancho = new HyperFocusDecorator(vancho);

        vancho.arriveAtUniversity();
        uni.conductExam(vancho);
        System.out.println("=".repeat(30));

        Student bobi = new ConcreteStudent("Боби - fitness lover",
                StudentType.FITNESS_FAN,
                new TeleportationStrategy());
        bobi = new SpeedWritingDecorator(bobi);

        bobi.arriveAtUniversity();
        uni.conductExam(bobi);
        System.out.println("=".repeat(30));

        Student peyo = new ConcreteStudent("Пейо - Калитко",
                StudentType.LUCKY_ONE,
                new BusSleepStrategy());
        peyo = new TelepathyDecorator(peyo);

        peyo.arriveAtUniversity();
        uni.conductExam(peyo);
        System.out.println("=".repeat(30));

        
    }
}
