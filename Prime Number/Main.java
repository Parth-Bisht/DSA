public class Main {
    public static void main(String[] args) {
        int num = 7;
        System.out.println(isPrime(num));
    }
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
