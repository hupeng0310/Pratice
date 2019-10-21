package algorithm.sort;

public class BubbleSort<I extends Number> {
    public void bubbleSort(int[] arr,Sortable sortable){
        for(int i = 0;i < arr.length - 1;i++){
            for(int j = i + 1;j <arr.length;j++){
                if(sortable.compare(arr[i],arr[j])){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
