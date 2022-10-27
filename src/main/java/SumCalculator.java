public class SumCalculator {
    public int calc(int n) {
        if (n == 0) {
            throw new IllegalArgumentException("Input should be > 0");
        }

        int result = 0;

        for(int i = 0; i <= n; i++) {
            result += i;
        }

        return result;
    }
}
