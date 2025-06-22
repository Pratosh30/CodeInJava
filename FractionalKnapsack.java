import java.util.Arrays;

public class FractionalKnapsack {
    // Items with their weights and values
    private static class Item {
        int weight, value;

        Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }

    // Function to solve the Fractional Knapsack Problem
    private static double fractionalKnapsack(int W, Item[] items) {
        int n = items.length;
        // Create a 2D array to store the solution to subproblems
        double[][] K = new double[n + 1][W + 1];

        // Build the solution in bottom-up manner
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (items[i - 1].weight <= w)
                    K[i][w] = Math.max(items[i - 1].value + K[i - 1][w - items[i - 1].weight], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }

        // Return the maximum value
        return K[n][W];
    }

    public static void main(String[] args) {
        Item[] items = { new Item(10, 60), new Item(20, 100), new Item(30, 120) };
        int W = 50;
        System.out.println("Maximum value that can be obtained: " + fractionalKnapsack(W, items));
    }
}