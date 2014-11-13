package variables;
class InstanceVariablesDefaultValues{
    int var1;
    byte var2;
    short var3;
    long var4;
    float var5;
    double var6;
    char var7;
    boolean var8;

    public static void main(String...args){
        InstanceVariablesDefaultValues object = new InstanceVariablesDefaultValues();
        System.out.println("int default=" + object.var1);
        System.out.println("byte default=" + object.var2);
        System.out.println("short default=" + object.var3);
        System.out.println("long default=" + object.var4);
        System.out.println("float default=" + object.var5);
        System.out.println("double default=" + object.var6);
        System.out.println("char default=" + String.format("\\u%04x", (int)object.var7));
        System.out.println("boolean default=" + object.var8);
    }
}

