package Collection.WrapperClass;

public class A1_Demo {
    public static void main(String[] args) {
        Integer i =  Integer.valueOf(10);
        Integer i2 = Integer.valueOf("123");
        System.out.println(i);
        System.out.println(i2);


        int obj1 = Integer.parseInt("878");
        boolean aTrue= Boolean.parseBoolean("true");

        Double d = 9.88;
        int i3 = d.intValue();

        System.out.println(i3);

        Integer k =66;
        String s = k.toString();
        System.out.println(s);

        Integer a =100;
        Integer b =100;
        System.out.println(a==b);
        // Note : -128 -- 127  cache

        Integer pa = 128;
        Integer pb = 128;
        System.out.println(pa.equals(pb)); // content compare
    }
}
