public class T10Arik extends Thread{
 public void run(){
  for(int i=1;i<=3;i++){
   try{
    Thread.sleep(500);
   }catch(Exception e){System.out.println(e);}
  System.out.println(i);
  }
 }
public static void main(String args[]){
 T10Arik t1=new T10Arik();
 T10Arik t2=new T10Arik();
 T10Arik t3=new T10Arik();
 t1.start();
 t2.start();
 t3.start();
 }
}