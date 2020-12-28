package pl.java.innerclass;

public class StaticPair {
    public int x;

    public static class FindPair {
        private final double low;
        private final double high;


        public FindPair(double low, double high) {
            this.low = low;
            this.high = high;
        }

        public double getLow() {
            return low;
        }

        public double getHigh() {
            return high;
        }
    }

    public static FindPair find(double[] values) {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        for (double value : values) {
            if (value < min)
                min = value;
            if (value > max)
                max = value;
        }
        return new FindPair(min, max);
    }
}
