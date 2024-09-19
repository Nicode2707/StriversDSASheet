public class Digitalcount {

    public static int countDigit(int n)
    {
    
        if (n == 0)
            return 1;

        int count = 0;
        while (n != 0) {
            
            n = n / 10;
    
            ++count;
        }
        return count;
    }
    public static void main(String[] args)
    {
        int n = 58964;
        System.out.println("Number of digits: "+ countDigit(n));
    }
}
