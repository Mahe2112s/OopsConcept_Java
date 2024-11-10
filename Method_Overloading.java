//If a class have mulitple methods with same name but with 
//different parameters list, it is known as Method overloading.

public class Method_Overloading {

    public void methodOne()
    {
        System.out.println("No arguement method");
    }
    public void methodOne(int i)
    {
        System.out.println(i+" int-arg method");
    }
    public void methodOne(double d)
    {
        System.out.println(d+" double-arg method");
    }
    public static void main(String args[])
    {
        Method_Overloading MO = new Method_Overloading();
        MO.methodOne();
        MO.methodOne(10);
        MO.methodOne(10.5);
    }
}