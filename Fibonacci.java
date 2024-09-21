public class fibonacci {

    public static int fibonacc(int n) {
        if (n <= 1) {
            return n;
        }
        int fibn1 = fibonacc(n - 1);
        int fibn2 = fibonacc(n - 2);
        return fibn1 + fibn2;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(fibonacc(n));
    }
}
