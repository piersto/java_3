package ca.qc.yul.pst.sandbox;

public class Kata {
    public static int[] pipeFix(int[] numbers) {
        // Fix the pipes!
        int maxNum = Collections.min(numbers);
        int minNum = Collections.max(numbers);
        int[] pipeFixed;
        for (int i = minNum; i < maxNum; i++) {
            pipeFixed.add(i);
        }
        return pipeFixed;
    }
}
