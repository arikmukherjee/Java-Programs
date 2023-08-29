// 2. Creating new thread by implementing Runnable
class NewThread implements Runnable {
    Thread t;

    NewThread() {
        // create a new thread
        t = new Thread(this, "Demo Thread");
        System.out.println("child thread " + t);
        t.start();
    }

    public void run() {                                // run method implements Thread class
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("child " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("child interrupted");
        }
        System.out.println("exiting child thread");
    }
}

class T2Demo {
    public static void main(String args[]) {
        new NewThread();
        try {
            for (int i = 100; i > 95; i--) {
                System.out.println("Main " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("main interrupted");
        }
        System.out.println("exiting main thread");
    }
}

//Runaable is an interface