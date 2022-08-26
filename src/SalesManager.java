public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = sales[0];
        for (int sale : sales) {
             if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    int avg;
    public int avg() {
        int sum=0;
        int sMinMax=min()+max();
        for (int i =0; i<sales.length; i++) {
            sum+=sales[i];
            }
        avg=sum-sMinMax;
        return avg;
    }

}