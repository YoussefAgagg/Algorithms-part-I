package com.github.youssefagagg.week1.uf;

public interface UnionFind {


    /**
     * add connection between p and q
     *
     * @param p
     * @param q
     */
    void union(int p, int q);

    /**
     * @param p
     * @param q
     * @return true if p and q are in the same component
     */
    boolean connected(int p, int q);

    /**
     * @return number of components
     */
    int count();
}
