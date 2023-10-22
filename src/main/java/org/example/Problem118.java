package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));
        while(result.size() != numRows) {
            int currentRow = result.size() + 1;
            result.add(generateRow(currentRow, result.get(currentRow - 2)));
        }
        return result;
    }

    private List<Integer> generateRow(int row, List<Integer> prevRow) {
        List<Integer> result = new ArrayList<>();

        //start with 1 always
        result.add(1);

        for(int i = 1; i < row - 1; i++) {
            result.add(prevRow.get(i) + prevRow.get(i - 1));
        }

        //end with 1 always
        result.add(1);

        return result;
    }
}
