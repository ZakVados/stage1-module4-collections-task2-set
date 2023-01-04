package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> res = new HashSet<>();
        for (Integer i : sourceList) {
            if ((i % 2) == 0) {
                do {
                    res.add(i);
                    i = i / 2;

                } while (i % 2 == 0);
                res.add(i);
            } else {
                res.add(i);
                res.add(i * 2);
            }
        }
        return res;
    }

}
