public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = sales[0];
        for (long sale : sales) {
             if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    long avg;
    public long avg() {
        long sum=0;
        long sMinMax=min()+max();
        for (int i =0; i<sales.length; i++) {
            sum+=sales[i];
            }
        avg=sum-sMinMax;
        return avg;
    }

}