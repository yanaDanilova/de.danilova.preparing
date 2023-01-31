package collections;

import java.util.Arrays;

public class MyArrayList<T> {
    private T [] arr;
    private int countElement = 0;

    public MyArrayList(int capacity) {
        arr = (T[]) new Object[capacity];

    }

    public void addOne(T element){
        if (countElement < arr.length) {
            arr[countElement] = element;
            countElement++;
        }
        else{
            T [] tempArr = arr;
            arr = (T[]) new Object[tempArr.length*2];
            countElement =0;

            for (int i = 0; i< tempArr.length;i++){
                arr[i] =tempArr[i];
                countElement++;
            }

            arr[countElement++] = element;
        }
    }


    public T getElementByIndex(int index){
        return arr[index];
    }

    public void deleteElementByIndex(int index){
        for (int i = index; i < arr.length-1; i++){
            arr[i]= arr[i+1];
        }

    }
    @Override
    public String toString() {
        return "MyArrayList{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
