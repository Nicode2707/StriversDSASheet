public class Reversenumber {

    public static int numberreverse(int n) {
        int revno = 0;
        while (n != 0) {
            int lastdigit = n % 10;
            n = n / 10;
            revno = (revno * 10) + lastdigit;
        }
        return revno;
    }

    public static void main(String[] args) {
        int n = 58964;
        System.out.println("Reversed Number: " + numberreverse(n));
    }
}
