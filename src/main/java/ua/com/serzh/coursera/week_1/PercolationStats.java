package ua.com.serzh.coursera.week_1;
/*import edu.princeton.cs.introcs.StdRandom;
import edu.princeton.cs.introcs.StdStats;*/

public class PercolationStats {
/*
    int N, T;
    double u, sigma;
    double confidenceLow, confidenceHigh;
    double[] percData;
    Percolation perc;
    int[] order;
    int numberOfSites;
    double percentage;

    public PercolationStats(int N, int T) {
        if (N <= 0 || T <= 0) throw new java.lang.IllegalArgumentException("N and T should be integers bigger than 0");
        this.N = N;
        this.T = T;
        percData = new double[T];
        perc = new Percolation(N);
        order = new int[N * N];
        numberOfSites = 0;
        for (int i = 0; i < N * N; i++) {
            order[i] = i;
        }
        for (int i = 0; i < T; i++) {
            StdRandom.shuffle(order);
            numberOfSites = 0;
            perc = new Percolation(N);
            for (int j = 0; j < N * N && !perc.percolates(); j++) {
                perc.open(order[j] / N, order[j] % N);
                numberOfSites++;
            }
            percentage = (double) numberOfSites / (double) (N * N);
            percData[i] = percentage;
        }
    }

    public double mean() {
        u = StdStats.mean(percData);
        return u;
    }

    public double stddev() {
        sigma = StdStats.stddev(percData);
        return sigma;
    }

    public double confidenceLow() {
        confidenceLow = u - (1.96 * sigma) / (Math.sqrt(T));
        return confidenceLow;
    }

    public double confidenceHigh() {
        confidenceHigh = u + (1.96 * sigma) / (Math.sqrt(T));
        return confidenceHigh;
    }

    public static void main(String[] args) {
        PercolationStats ps = new PercolationStats(10, 50);
        System.out.println("mean = " + ps.mean());
        System.out.println("standard deviation = " + ps.stddev());
        System.out.println("percolation threshold: " + "[" + ps.confidenceLow() + ", " + ps.confidenceHigh() + "]");
    }
}


    int numberOfOpenSites() {
        int n = 0;
        for (int i = 0; i < size(); i++) {
            if (grid[i].equals("open")) n++;
        }
        return n;
    }

    boolean percolates() {
        return wqu.connected(top, bottom);
    }

    public static void main(String[] args) {
    }
*/

}