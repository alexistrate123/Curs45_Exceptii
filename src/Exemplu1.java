public class Exemplu1 {
    public static void main(String[] args) {

        String[] masini = {"Mercedes", "Opel", "Audi", "Honda", "Suzuki"};

        System.out.println(masini[2]);
        try {
            System.out.println(masini[5]);
        } catch (ArrayIndexOutOfBoundsException eroareaMea) {
            System.out.println("Ai incercat sa accesezi un element din afara Array-ului.");
        }


        for (int i = 0; i <= 10 ; i++) {
            System.out.println("I love Java");
        }


    }
}
