import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        long result = getFactorial(number);
        System.out.println(result);
    }

    private static long getFactorial(int number) {
        if(number == 0){
            return 1;
        }

        return number * getFactorial(number - 1);
    }
}
