public class StringBufferPrg {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("ab");
        System.out.println(s.length());
        System.out.println(s.capacity());
        s.append("xyz");
        System.out.println(s.length());
        System.out.println(s.capacity());
        s.append("abcdefg");
        System.out.println(s.length());
        System.out.println(s.capacity());
        s.append("1234567");
        System.out.println(s.length());
        System.out.println(s.capacity());
    }
}
