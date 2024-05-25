public class Exemplu5 {
    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 0;

        try {
            System.out.println(number1 / number2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("I am still running.");
    }
}
