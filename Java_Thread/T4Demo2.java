class Multi implements Runnable {
    String name;
    Thread t;

    Multi(String s) {
        name = s;
        t = new Thread(this, name);
        System.out.println("new thread " + t);
        t.start();

    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "interrupted");
        }
        System.out.println(name + "exiting");
    }
}

class T4Demo2 {
    public static void main(String args[]) {
        new Multi("one");
        new Multi("two");
        new Multi("three");
        try {
            // wait for the other thread
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted ");
        }
        System.out.println("exiting main thread ");
    }
}