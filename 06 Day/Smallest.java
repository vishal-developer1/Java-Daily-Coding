public class Smallest {
    public static void main(String[] args) {

        int a = 25, b = 10, c = 5;

        if (a < b && a < c) {
            System.out.println("Smallest number = " + a);
        } else if (b < a && b < c) {
            System.out.println("Smallest number = " + b);
        } else {
            System.out.println("Smallest number = " + c);
        }

    }
}
