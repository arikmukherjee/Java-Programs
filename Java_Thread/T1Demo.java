// 1. Dealing with main
class T1Demo {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        System.out.println("current " + t);
        System.out.println(t.getName());
        t.setName("MyMain");
        System.out.println("current now " + t);
        System.out.println(t.getName());
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } 
        catch (InterruptedException e) {
            System.out.println("caught");
        }
    }
}