public class T3Arik extends Thread 
{
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        T3Arik t1=new T3Arik();
        T3Arik t2=new T3Arik();

        t1.run();
        t2.run();
    }    
}
