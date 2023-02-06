package multithreading.counter;

public class Main4 {

    public static void main(String[] args) {
        Counter counter = new Counter();

        for(int i= 0; i< 5; i++){
            new Thread(counter::increment).start();
            new Thread(counter::decrement).start();
        }

    }




}
