package Solutions2024.Day1;
import InputUtils.GetInput;
import Solutions2024.Solution;

import java.util.*;

public class Day1 implements Solution {

    @Override
    public void firstPart() {
        Scanner input = GetInput.getInputAsScanner("resources/inputs/day1/part1.txt");
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        long ans = 0;

        while (input.hasNextLine()) {
            leftList.add(input.nextInt());
            rightList.add(input.nextInt());
        }

        leftList = leftList.stream().sorted().toList();
        rightList = rightList.stream().sorted().toList();

        for (int i = 0; i <= leftList.size() - 1; i++) {
            ans += Math.abs(leftList.get(i) - rightList.get(i));
        }

        System.out.println("Total distance between lists: " + ans);
    }

    @Override
    public void secondPart() {
        Scanner input = GetInput.getInputAsScanner("resources/inputs/day1/part2.txt");
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        long ans = 0;

        while (input.hasNextLine()) {
            leftList.add(input.nextInt());
            rightList.add(input.nextInt());
        }

        List<Long> answerList = leftList.stream().distinct().
                map(x -> rightList.stream().filter(y -> Objects.equals(y, x)).count() * x).toList();

        for (Long answer : answerList) {
            ans += answer;
        }

        System.out.println("Similarity score of these lists: " + ans);
    }

}
