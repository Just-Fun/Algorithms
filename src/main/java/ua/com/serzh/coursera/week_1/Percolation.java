package ua.com.serzh.coursera.week_1;/*import edu.princeton.cs.algs4.WeightedQuickUnionUF;

import java.lang.Math;*/

public class Percolation {
    int N;
    String[] grid;
    int top;
    int bottom;
    WeightedQuickUnionUF wqu, wqu2;
    int[] openSites;
    int sizeOfOpenSites;

    Percolation(int N) {
        this.N = N;
        wqu = new WeightedQuickUnionUF((N * N) + 2);
        wqu2 = new WeightedQuickUnionUF((N * N) + 1);
        top = N * N;
        bottom = N * N + 1;
        grid = new String[N * N];
        openSites = new int[N * N];
        sizeOfOpenSites = 0;
        for (int i = 0; i < N * N; i++) {
            grid[i] = "blocked";
        }
        for (int i = 0; i < N; i++) {
            wqu.union(top, pos(0, i));
            wqu2.union(top, pos(0, i));
            wqu.union(bottom, pos(N - 1, i));
        }
    }

    int pos(int row, int col) {
        return (row * N) + col;
    }

    int size() {
        return N * N;
    }

}