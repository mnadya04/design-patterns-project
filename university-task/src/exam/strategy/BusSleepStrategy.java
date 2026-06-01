package exam.strategy;

public class BusSleepStrategy implements ArrivalStrategy {
    @Override
    public void arrive(String studentName) {
        System.out.println(studentName + " пристига след спане в автобуса! poor him");
    }
}
