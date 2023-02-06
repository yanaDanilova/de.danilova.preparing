package multithreading.pinpong;



public class Main3 {

    public static void main(String[] args) {
        Writer writer = new Writer("pong");

        Thread thread0 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++){
                    writer.write("ping");
                }
            }

        };

        Thread thread1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++){
                    writer.write("pong");
                }

            }

        };

        thread0.start();
        thread1.start();


    }

}

