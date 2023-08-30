public class T2Arik implements Runnable
{
   public void run()
   {
      System.out.println("Thread is running");
   }
   public static void main(String[] args) {
      T2Arik ob=new T2Arik();
      Thread t1=new Thread(ob);
      t1.start();
   }   
}
