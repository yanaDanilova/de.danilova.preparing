package collections;

import java.util.ArrayList;
import java.util.List;

public class MyLinkedList<T> {

    int length;

    Node<T> first;
    Node<T> last;

    public int getLength() {
        return length;
    }

    public Node<T> getFirst() {
        return first;
    }

    public Node<T> getLast() {
        return last;
    }

    static class Node<T>{
        T item ;
        Node<T> prev;
        Node<T> next;

        public Node(T item) {
          this.item =item;

        }

        public T getItem() {
            return item;
        }

        public Node<T> getPrev() {
            return prev;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setItem(T item) {
            this.item = item;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    public void add(T item) {
        if(first == null){
            first = new Node<>(item);
            last = first;
            length++;
        }
        else {
            Node<T> newPrev = last;
            last= new Node<>(item);
            newPrev.setNext(last);
            last.setPrev(newPrev);
            length++;
        }
    }

    public void removeLast(){
       Node<T> newLast = last.getPrev();
       newLast.next = null;
       last = newLast;
       length--;
    }

    public ArrayList<T> getAllItems(){
        ArrayList<T> list = new ArrayList<>();
        Node<T> temp = first;
        while (temp.getNext()!=null){
            list.add((T) temp.item);
            Node<T> tNode = temp;
            temp = tNode.getNext();
            if(temp == getLast()){
                list.add(temp.item);
            }
        }
           return list;
    }


    @Override
    public String toString() {
        return "MyLinkedList{" +
                "length=" + length +
                ", first=" + first.item +
                ", last=" + last.item +
                '}';
    }
}
