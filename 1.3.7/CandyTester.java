//Sophia Liao

public class CandyTester {
    public static void main(String[] args) {

        Candy candy1 = new Candy("Gummy Bear", 8, false);
        Candy candy2 = new Candy("Dark Chocolate", 3, true);
        Candy candy3 = new Candy("Gummy Bear", 8, false);

        // Prediction: false
        System.out.println("candy1 == candy3: " + (candy1 == candy3));

        // Prediction: true
        System.out.println("candy1.equals(candy3): " + candy1.equals(candy3));

        // Prediction: false
        System.out.println("candy1 == candy2: " + (candy1 == candy2));

        // Prediction: false
        System.out.println("candy1.equals(candy2): " + candy1.equals(candy2));

        candy3.setName("Sour Worm");
        candy3.setSweetnessLevel(10);
        candy3.setIsPoisonous(true);

        Candy candy4 = candy3;

        Candy candy5 = null;

        // Prediction: true
        System.out.println("candy4 == candy3: " + (candy4 == candy3));

        // Prediction: true
        System.out.println("candy4.equals(candy3): " + candy4.equals(candy3));

        // Prediction: false
        System.out.println("candy4 == candy1: " + (candy4 == candy1));

        // Prediction: false
        System.out.println("candy4.equals(candy1): " + candy4.equals(candy1));

        // Prediction: false
        System.out.println("candy5 == candy1: " + (candy5 == candy1));

        // Prediction: false
        System.out.println("candy5.equals(candy1): " + candy5.equals(candy1));
    }
}