package recursionAndBacktracking;

import java.util.Scanner;

public class RecursiveFigureDrawing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        drawFigure(number);
    }

    private static void drawFigure(int number) {

        if(number == 0){
            return;
        }
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();

        drawFigure(number - 1);

        for (int i = 0; i < number; i++) {
            System.out.print("#");
        }
        System.out.println();

    }


    //--without recursion --

    /*private static void drawFigure(int number) {
        drawTop(number);
        drawBottom(number);
    }

    private static void drawBottom(int number) {
        int startingNumber = 1;
        while(startingNumber <= number){
            for (int i = 0; i < startingNumber ; i++) {
                System.out.print("#");
            }
            System.out.println();
            startingNumber++;
        }
    }

    private static void drawTop(int number) {
        while(number > 0){
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
            System.out.println();
            number--;
        }
    }*/
}
