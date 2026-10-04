public class NumberProgram {

    public static void main(String[] args) {
        int[] values = {3, 7, 2, 9, 4};

        int result = findResult(values);

        System.out.println("Result: " + result);
    }

    public static int findResult(int[] values) {
        if (values.length == 0) {
            return Integer.MIN_VALUE;
        }

        int largest = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > largest) {
                largest = values[i];
            }
        }
        return largest;
    }
}
