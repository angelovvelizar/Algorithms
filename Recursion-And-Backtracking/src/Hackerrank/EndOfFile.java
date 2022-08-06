package Hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> lines = new ArrayList<>();

        boolean isLastLine = false;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.equals("")) {
                break;
            }
            lines.add(line);
        }

        for (int i = 0; i < lines.size(); i++) {
            System.out.printf("%d %s%n", i + 1, lines.get(i));
        }
    }
}
