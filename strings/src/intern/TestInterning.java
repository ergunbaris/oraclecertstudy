package intern;

public class TestInterning{
    public static void main(String ... args){
        String lo = "lo";
        String hello = "hel" + lo; // as newly created
        String hello2 = "hello";
        String hello3 = new String("hello");
        String hello4 = "hel" +"lo"; // interned
        System.out.println(hello==hello2); // should be false not interned newly created
        System.out.println(hello==hello3); // should be false not interned
        System.out.println(hello2==hello4); // should be true both interned
    }
}
