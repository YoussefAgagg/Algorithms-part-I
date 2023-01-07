package com.github.youssefagagg.week1.uf;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UnionFindTest {

    @Test
    void quickFindTest() {
        var unionFind = new QuickFind(10);
        assertThat(unionFind.connected(0, 1)).isFalse();
        assertThat(unionFind.count()).isEqualTo(10);
        unionFind.union(0, 1);
        unionFind.union(0, 3);
        assertThat(unionFind.connected(1, 3)).isTrue();

    }

}