public class T7Arik extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.print(Thread.currentThread().getName() + " ");
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        T7Arik t1 = new T7Arik();
        T7Arik t2 = new T7Arik();
        T7Arik t3 = new T7Arik();

        System.out.println("Name of t1:" + t1.getName());
        System.out.println("Name of t2:" + t2.getName());
        System.out.println("Name of t1:" + t3.getName());
        System.out.println("id of t1:" + t1.getId());
        System.out.println("id of t1:" + t2.getId());
        System.out.println("id of t1:" + t3.getId());
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        t1.setName("dj thread");
        System.out.println("Name of t1:" + t1.getName());

        t2.start();
        t3.start();

    }
}