package addition.functionlity;

public class Addition {
    public void add_Nos_int() {
        int no1 = 10;
        int no2 = 20;
        System.out.println("Addition of no1 and no2 is" + (no1 + no2));
    }

    public void add_Nos_float() {
        float no1 = 1.4f;
        float no2 = 2.2f;
        System.out.println("addition of no1 and no2 is" + (no1 + no2));
    }

    public void add_Nos_double() {
        double no1 = 15.42;
        double no2 = 165.4;
        System.out.println("addition of no1 and no2 is" + (no1 + no2));

    }

    public void add_Nos_long() {
        long no1 = 46841246;
        long no2 = 4861853;
        System.out.println("addition of no1 and no2 is" + (no1 + no2));
    }
    public static void main(String[] args){
        Addition demo =new Addition();
        demo.add_Nos_int();
        demo.add_Nos_float();
        demo.add_Nos_double();
        demo.add_Nos_long();
    }

    }
