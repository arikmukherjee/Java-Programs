public class StrConcat
{
    public static void main(String[] args) {
        String s1="Sun";
        String s2="day";
        String s3=s1+s2;
        System.out.println(s3);  // here + is concatination operator.
        System.out.println(s1.concat(s2)); // use of .concat()
    }
}