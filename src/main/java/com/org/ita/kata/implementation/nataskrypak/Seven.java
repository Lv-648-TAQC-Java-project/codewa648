package com.org.ita.kata.implementation.nataskrypak;
import java.text.DecimalFormat;

public class Seven implements com.org.ita.kata.Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0.00;
        for (int i = 0; i < n; i++) {
            sum += (1 / (1 + (double)i * 3));
        }
        if (sum == 0) {
            return new DecimalFormat("#.0#").format(0);
        } else {
            return String.format("%.2f", sum);
        }
    }
    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }

}
