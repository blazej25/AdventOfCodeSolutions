package Application;

import Solutions2024.Day1.Day1;
import Solutions2024.Solution;

import java.io.File;
import java.util.Scanner;

public class AOCApplication {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        System.out.println("Welcome to the Advent Of Code solutions application!");

        while (running) {
            communicate();

            System.out.println("Press q to quit.");
            running = !(scanner.next().equals("q"));
        }
    }

    private static void communicate() {
        Scanner scanner = new Scanner(System.in);
        int day;
        int part;

        System.out.println("Here are all available solutions:");
        listAllDirectories();
        System.out.println("View solution for day: ");
        day = scanner.nextInt();
        System.out.println("View solution for part: ");
        part = scanner.nextInt();

        runSolution(day, part);
    }

    private static void runSolution(int day, int part) {
        switch (day) {
            case 1:
                Solution solution = new Day1();
                if (part == 1) {
                    solution.firstPart();
                } else {
                    solution.secondPart();
                }
        }
    }

    private static void listAllDirectories() {
        File folder = new File("./src/Solutions2024");
        for (File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                System.out.println(fileEntry.getName());
            }
        }
    }
}
