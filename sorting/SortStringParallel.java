package sorting;

import java.util.Arrays;

public class SortStringParallel {


    public static void main(String[] args) {
        String[] provinces = {"Province1","Province3","Province5","Province2","Province6","Province7","Province8","Province9","Province4"};
        Arrays.parallelSort(provinces);
        for(int arrayPosition=0; arrayPosition < provinces.length; arrayPosition++){
            System.out.println(provinces[arrayPosition]);
        }
        System.out.println("Sorted!");
    }
}
