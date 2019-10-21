package algorithm.sort;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{2,3,4,5,1};
        BubbleSort bubbleSort = new BubbleSort();
        Sortable<Integer> sortable = (Integer t1,Integer t2) -> t1 > t2?true:false;
        bubbleSort.bubbleSort(arr,sortable);
        System.out.println(Arrays.toString(arr));
    }
}
