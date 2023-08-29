public class NestedTry {
    public static void main(String[] args) {
       try {
        int a = args.length;
        int b = 34/a;
        System.out.println("1st try block");
        try {
          if (a==1){
            b=34/(a-1);
          } 
          System.out.println("2nd try block"); 
          try {
            if (a==2){
             int c[]={1};
              c[99] = 89;
            }
            System.out.println("3rd try block");
          } 
          catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("caught 1 "+e);
          }
        } 
        catch (ArithmeticException e) {
           System.out.println("caught 2 "+e); 
        }
       } 
       catch (Exception e) {
        System.out.println("caught 3 "+e);
       }
       System.out.println("after try catch");
    }
}
