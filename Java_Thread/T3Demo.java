//3. Creating thread by extending Thread class
class MyNewThread extends Thread {
    MyNewThread() {
        // creating new thread
        super("Demo thread");
        System.out.println("child thread " + this);
        start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("child thread " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("child interrupted ");
        }
        System.out.println("exiting child thread----");
    }
}

class T3Demo {
    public static void main(String args[]) {

        new MyNewThread();
        try {
            for (int i = 90; i < 95; i++) {
                System.out.println("main thread " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("main interrupted ");
        }
        System.out.println("exiting main thread----");
    }
}