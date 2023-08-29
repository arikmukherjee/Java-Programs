interface A {
    public void input();
}

interface B extends A {
    void output();
}

interface c extends A {
    void output();
}

class cl1 implements B {
    int a, b;

    public void input() {
        a = 3;
        b = 7;
    }

    public void output() {
        int min;
        min = a + b;
        System.out.println(min);
    }
}

class cl2 implements c {
    int a, b;

    public void input() {
        a = 4;
        b = 8;
    }

    public void output() {
        int min;
        min = a - b;
        System.out.println(min);
    }
}

public class Interface4 {
    public static void main(String args[]) {

        cl1 ob1 = new cl1();
        ob1.input();
        ob1.output();

        cl2 ob2 = new cl2();
        ob2.input();
        ob2.output();
    }
}