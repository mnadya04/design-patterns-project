package exam.strategy;

public class TeleportationStrategy implements ArrivalStrategy {
    @Override
    public void arrive(String studentName) {
        System.out.println(studentName + " пристига чрез телепортация!");
    }
}
