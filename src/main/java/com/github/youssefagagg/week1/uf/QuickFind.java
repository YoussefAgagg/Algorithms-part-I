package com.github.youssefagagg.week1.uf;

public class QuickFind implements UnionFind {
    private final int[] uf;
    private int count;

    public QuickFind(int n) {
        count = n;
        uf = new int[n];
        for (int i = 0; i < n; i++) {
            uf[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        // Put p and q into the same component.
        int pID = uf[p];
        int qID = uf[q];
        // Nothing to do if p and q are already
        if (pID == qID) return;
        // Rename p’s component to q’s name.
        for (int i = 0; i < uf.length; i++) if (uf[i] == pID) uf[i] = qID;
        count--;

    }

    @Override
    public boolean connected(int p, int q) {
        return uf[p] == uf[q];
    }

    @Override
    public int count() {
        return count;
    }
}
