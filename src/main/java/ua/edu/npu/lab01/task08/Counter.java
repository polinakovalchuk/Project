package ua.edu.npu.lab01.task08;

import java.util.ArrayList;

public class Counter {
    ArrayList<String> countingWords = new ArrayList<>();
    ArrayList<Integer> counting = new ArrayList<>();
    public void counting (String[] arr) {
        int tempIndex;
        int temp;
        int j = 0;
        while(j < arr.length) {
            if(countingWords.contains(arr[j])){
                tempIndex = countingWords.indexOf(arr[j]);
                temp = counting.get(tempIndex);
                counting.set(tempIndex, temp+1);
            }
            else {
                countingWords.add(arr[j]);
                counting.add(1);
            }
            j++;
        }
    }

    public void Out () {
        for(int i = 0; i< countingWords.size(); i++) {
            System.out.println(countingWords.get(i) + " = " + counting.get(i));
        }
    }
}
