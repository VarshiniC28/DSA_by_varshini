package stack.problems;

import java.util.List;

public class GameOfStacks {

    // -------------------- ENTRY METHOD (HackerRank Signature) --------------------
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        return helper(maxSum, a, b, 0, 0);
    }

    // -------------------- RECURSIVE HELPER --------------------
    private static int helper(int maxSum,
                              List<Integer> a,
                              List<Integer> b,
                              int sum,
                              int count) {

        // FIX 1: If sum exceeds maxSum, last move was invalid
        if (sum > maxSum) {
            return count - 1; // rollback last count
        }

        int maxCount = count;

        // FIX 2: Try taking from stack A if not empty
        if (!a.isEmpty()) {
            maxCount = Math.max(
                maxCount,
                helper(
                    maxSum,
                    a.subList(1, a.size()), // simulate pop from A
                    b,
                    sum + a.get(0),
                    count + 1
                )
            );
        }

        // FIX 3: Try taking from stack B if not empty
        if (!b.isEmpty()) {
            maxCount = Math.max(
                maxCount,
                helper(
                    maxSum,
                    a,
                    b.subList(1, b.size()), // simulate pop from B
                    sum + b.get(0),
                    count + 1
                )
            );
        }

        return maxCount;
    }

    // -------------------- OPTIONAL TEST --------------------
    public static void main(String[] args) {
        // Leave empty — HackerRank handles input/output
    }
}
