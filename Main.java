public class Main {
    public static void main(String[] args) {
        double votesA = 1548;
        double votesB = 733;
        double difference = Double.max(votesA,votesB) - Double.min(votesA,votesB);
        double result = 100 / (votesA + votesB) * difference;
        System.out.printf("%.4f",result);
    }
}
