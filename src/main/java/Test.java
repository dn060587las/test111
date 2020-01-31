
public class Test {
    static enum Test2 {A,B,C;}

    public static void main(String[] args) throws Exception {
       Test2 a = null;
       if (a == Test2.A) {
           System.out.println("11111");
       } else {
           System.out.println("22222");
       }
    }
}

