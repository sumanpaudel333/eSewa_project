import java.sql.SQLOutput;

class Main{

    final int a = 1;
    static int b = 312;

    final static int c = 53;

    void me(){
        System.out.println(a);
        b = 3;
    }
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(Main.b);
        m.me();
        System.out.println(Main.b);
        System.out.println(Main.c);
    }


}