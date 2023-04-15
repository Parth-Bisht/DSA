public class Main {
    public static void main(String[] args) {
//        simplePattern(5);
//        increasingPattern(5);
        printNumbers(3);
    }

    public static void simplePattern(int n){
        for(int i=0;i<n;i++){
            String bag = "";
            for(int j=0;j<n;j++){
                bag += "* ";
            }
            System.out.println(bag);
        }
    }

    public static void increasingPattern(int n){
        for(int i=1;i<=n;i++){
            String bag = "";
            for(int j=1;j<=i;j++){
                bag += "* ";
            }
            System.out.println(bag);
        }
    }

    public static void printNumbers(int n){
        for(int i=1;i<=n*n;i=i+0){
            String bag = "";
            for(int j=1;j<=n;j++){
                bag += i+" ";
                i++;
            }
            System.out.println(bag);
        }
    }
}


