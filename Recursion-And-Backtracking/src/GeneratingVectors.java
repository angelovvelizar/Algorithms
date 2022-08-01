import java.util.Scanner;

public class GeneratingVectors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        Integer[] bits = new Integer[number];

        fillVector(bits, 0);
    }

    private static void fillVector(Integer[] bits, int index) {
        if(index >= bits.length){
            print(bits);
            return;
        }

        for (int i = 0; i <=1 ; i++) {
            bits[index] = i;
            fillVector(bits, index + 1);
        }

    }

    private static void print(Integer[] bits) {
        for (Integer bit : bits) {
            System.out.print(bit);
        }
        System.out.println();
    }


}
