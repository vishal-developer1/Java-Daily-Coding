public class Greatest {
    public static void main(String[] args) {

        int a = 10, b = 25, c = 15;

        if (a > b && a > c) {
            System.out.println("Greatest number = " + a);
        } else if (b > a && b > c) {
            System.out.println("Greatest number = " + b);
        } else {
            System.out.println("Greatest number = " + c);
        }
    }
}