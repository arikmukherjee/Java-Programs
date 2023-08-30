public class T8Arik extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.print(Thread.currentThread().getName() + " ");
            System.out.println("running thread priority is:" + Thread.currentThread().getPriority());

            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        T8Arik t1 = new T8Arik();
        T8Arik t2 = new T8Arik();
        T8Arik t3 = new T8Arik();

        System.out.println("Name of t1:" + t1.getName());
        System.out.println("Name of t2:" + t2.getName());
        System.out.println("Name of t1:" + t3.getName());
        System.out.println("id of t1:" + t1.getId());
        System.out.println("id of t1:" + t2.getId());
        System.out.println("id of t1:" + t3.getId());
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }
}