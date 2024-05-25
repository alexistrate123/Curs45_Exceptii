public class Exemplu2 {
    public static void main(String[] args) {

        String text = null;
        System.out.println(text);
        try {
            System.out.println(text.toLowerCase());
        } catch (NullPointerException eroareaMea) {
            System.out.println("Nu exista text la care sa aplicam metoda.");
        }

        System.out.println("I am still running");
    }
}
