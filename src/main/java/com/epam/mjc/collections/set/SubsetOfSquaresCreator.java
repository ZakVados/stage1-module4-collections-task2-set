package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> total = new TreeSet<>();
        for (Integer i : sourceList) total.add(i*i);
        return total.subSet(lowerBound, true, upperBound, true);
    }
}
