public class T9Arik extends Thread{
 public void run(){
  if(Thread.currentThread().isDaemon()){
   System.out.println("daemon thread");
  }
  else{
  System.out.println("user thread ");
 }
 }
 public static void main(String[] args){
  T9Arik t1=new T9Arik();
  T9Arik t2=new T9Arik();
  T9Arik t3=new T9Arik();

  t1.setDaemon(true);
 
  t1.start();
  t2.start();
  t3.start();
 }
}