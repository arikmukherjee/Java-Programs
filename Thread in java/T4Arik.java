public class T4Arik extends Thread 
{
    public void run()
    {
        int i;
        for(i=1;i<5;i++)
        {
            try {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) {
                System.out.println("caught "+e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        T4Arik t1=new T4Arik();
        T4Arik t2=new T4Arik();

        t1.start();
        t2.start();
    }
}
