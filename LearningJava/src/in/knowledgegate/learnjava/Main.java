package in.knowledgegate.learnjava;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread Id:" + Thread.currentThread().getId());
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New Thread:" + Thread.currentThread().getId());
            }
        }).start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Exception came in threading");
        }
        System.out.println("Main ends");
    }
}