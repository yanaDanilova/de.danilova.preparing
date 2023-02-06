package collections;

import java.util.ArrayList;

public class Main2 {

    public static <T> void main(String[] args) {

        MyArrayList<String> arrayList = new MyArrayList<>(5);
        arrayList.addOne("A");
        arrayList.addOne("B");
        arrayList.addOne("C");
        arrayList.addOne("D");
        arrayList.addOne("E");
        arrayList.addOne("F");
        arrayList.addOne("G");
        arrayList.addOne("H");
        arrayList.addOne("I");

        System.out.println(arrayList);
        System.out.println(arrayList.getElementByIndex(3));
        arrayList.deleteElementByIndex(3);
        System.out.println(arrayList);


        MyLinkedList<String> linkedList = new MyLinkedList<>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");

        System.out.println(linkedList);
        ArrayList<String> stringList = linkedList.getAllItems();
        for(String item: stringList){
            System.out.print(item+" ");
        }
        System.out.println();
        linkedList.removeLast();
        System.out.println(linkedList);

        ArrayList<String> stringList2 = linkedList.getAllItems();
        for(String item: stringList2){
            System.out.print(item+" ");
        }




    }
}
