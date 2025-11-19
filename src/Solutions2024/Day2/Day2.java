package Solutions2024.Day2;

import InputUtils.GetInput;
import Solutions2024.Solution;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Day2 implements Solution {

    @Override
    public void firstPart() {
        Scanner input = GetInput.getInputAsScanner("resources/inputs/day2/part1.txt");
        long total = 0;

        while  (input.hasNextLine()) {
            String l = input.nextLine();
            Scanner line = new Scanner(l);

            List<Integer> list = new ArrayList<>();

            while(line.hasNextInt()) {
                list.add(line.nextInt());
            }

            List<Integer> increasing = list.stream().sorted().toList();
            List<Integer> decreasing = list.stream().sorted(Comparator.reverseOrder()).toList();
            boolean diffCorrect = true;

            for (int i = 1 ; i < list.size(); i++) {
                int diff = Math.abs(list.get(i) - list.get(i-1));

                if (diff < 1 || diff > 3) {
                    diffCorrect = false;
                }
            }

            if (!list.equals(decreasing) && !list.equals(increasing)) {
                continue;
            }

            if (!diffCorrect) {
                continue;
            }

            total++;
        }

        System.out.println("Number of safe reports: " + total);
    }

    @Override
    public void secondPart() {

    }
}
