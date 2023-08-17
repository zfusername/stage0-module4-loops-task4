package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("Number to skip is bigger than the last");
            return;
        }
        if (lastInRow < 0) {
            System.out.println("Last number in row is negative");
            return;
        }

        int skippedSum = 0;
        int countedSum = 0;

        for (int i = 1; i <= lastInRow; i++) {
            if (i % numberToSkip == 0) {
                skippedSum += i;
            } else {
                countedSum += i;
            }
        }

        System.out.println("Skipped sum is " + skippedSum);
        System.out.println("Counted sum is " + countedSum);
    }
}
