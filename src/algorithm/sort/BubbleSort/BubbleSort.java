package algorithm.sort.BubbleSort;

import algorithm.sort.Sortable;

public class BubbleSort<T> {

    public void bubbleSort(T[] arr, Sortable sortable){
        for(int i = 0;i < arr.length - 1;i++){
            for(int j = i + 1;j <arr.length;j++){
                if(sortable.compare(arr[i],arr[j])){
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
