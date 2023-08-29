//6. Priority
class ThreadPrio implements Runnable {
    Thread t;

    ThreadPrio() {
        t = new Thread(this, "hello thread");
        System.out.println(t);
        t.start();
    }

    public void run() {
        System.out.println("hello thread started---");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println(t);
    }
}

class T6Demo {
    public static void main(String args[])

    {
        ThreadPrio ob1 = new ThreadPrio();
        System.out.println("main thread " + Thread.currentThread());
        ob1.t.setPriority(4);
    }
}
