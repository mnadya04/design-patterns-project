package exam.strategy;

public class RunningWithJumpsStrategy implements ArrivalStrategy {
    @Override
    public void arrive(String studentName) {
        System.out.println(studentName + " пристига с тичане с подскачане!");
    }
}
