package recursionAndcombinatorialExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Cinema {

    public static String[] seats;
    public static String[] combinations;
    public static List<String> friends;

    public static boolean[] used;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        friends = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());
        seats = new String[friends.size()];

        String command = sc.nextLine();

        while (!command.equals("generate")) {
            String[] commandsPart = command.split(" - ");
            String name = commandsPart[0];
            int place = Integer.parseInt(commandsPart[1]) - 1;

            seats[place] = name;
            friends.remove(name);

            command = sc.nextLine();
        }

        combinations = new String[friends.size()];
        used = new boolean[friends.size()];
        permute(0);


    }

    private static void permute(int index) {
        if(index == combinations.length){
            print();
            return;
        }

        for (int i = 0; i < friends.size(); i++) {
            if(!used[i]){
                used[i] = true;
                combinations[index] = friends.get(i);
                permute(index + 1);
                used[i] = false;
            }

        }
    }

    private static void print() {

        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (String seat : seats) {
            if (seat != null) {
                sb.append(seat).append(" ");
            } else {
                sb.append(combinations[index++]).append(" ");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }


}
