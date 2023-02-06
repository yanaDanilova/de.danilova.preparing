package multithreading.pinpong;

public class Writer {

    private String current;

    public Writer(String current) {
        this.current = current;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public synchronized void write(String value){
        if(current.equals(value)){
            try {
                wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else{
            current= value;
            System.out.println(current + Thread.currentThread().getName());
            notifyAll();
        }

    }


}
