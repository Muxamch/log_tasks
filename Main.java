public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double votesB = scan.nextDouble();
        double votesA = scan.nextDouble();

        double difference = Double.max(votesA, votesB) - Double.min(votesA, votesB);
        double result = 100 / (votesA + votesB) * difference;
        if (result == 50 || (votesA == votesB)) {
            System.out.printf("draw");
        } else if (votesA > votesB) {
            System.out.printf("A %.4f%%", result);
        } else {
            System.out.printf("B %.4f%%", result);
        }
    }
}
