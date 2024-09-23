public class power {
  
    public static int powers(int x,int n){
        if(n==0){
            return 1;
        }
        return x * powers(x, n-1);
    }

    public static void main(String[] args) {
        int x =2;
        int n =3;
        System.out.println(powers(x, n)); 
    }
}
