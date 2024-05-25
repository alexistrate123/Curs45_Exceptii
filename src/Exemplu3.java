public class Exemplu3 {
    public static void main(String[] args) {

        int number1 = 123;
        int number2 = 0;

        try {
            System.out.println(number1 / number2);
        } catch (ArithmeticException eroareaMea) {
            System.out.println("Orice numar impartit la 0 este egeal cu 0.");
        }

        System.out.println("I`m still alive.");


    }
}
