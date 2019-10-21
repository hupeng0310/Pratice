package algorithm.sort;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,5,1};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr,(Object a,Object b) -> (int)a > (int)b?true:false);
        System.out.println(Arrays.toString(arr));
    }
}
