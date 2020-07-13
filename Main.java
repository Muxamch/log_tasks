public class Main {
    public static void main(String[] args) {
        double votesA = 5;
        double votesB = 5;
        double difference = Double.max(votesA,votesB) - Double.min(votesA,votesB);
        double result = 100 / (votesA + votesB) * difference;
        if (result == 50 || (votesA == votesB)) {
            System.out.printf("draw");
        } else {
            System.out.printf("%.4f", result);
        }
    }
}
