//5. isAlive() and join()
class CreateOne implements Runnable {
    String name;
    Thread t;

    CreateOne(String s) {
        name = s;
        t = new Thread(this, name);
        System.out.println("First thread " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("caught");
        }
        System.out.println(name + "exiting");
    }
}

class CreateTwo implements Runnable {
    String name;

    Thread t;

    CreateTwo(String s) {
        name = s;
        t = new Thread(this, name);
        System.out.println("First thread " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + " : " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("caught");
        }
        System.out.println(name + "exiting");
    }
}

class T5Demo {
    public static void main(String args[]) {
        CreateOne ob1 = new CreateOne("One");
        CreateTwo ob2 = new CreateTwo("Two");
        System.out.println("First thread is alive or not ---" + ob1.t.isAlive());
        System.out.println("Second thread is alive or not ---" + ob2.t.isAlive());
        // wait for the threads to finish
        try {
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
        }
        System.out.println("First thread is alive or not ---" + ob1.t.isAlive());
        System.out.println("Second thread is alive or not ---" + ob2.t.isAlive());
        System.out.println("exiting main");
    }
}