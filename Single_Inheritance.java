package Inheritance;
class Calc{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
}
class Advcalc extends Calc{
    public int mul(int a,int b)
    {
        return a*b;
    }
    public int div(int a,int b){
        return a>b ? (a/b) : (b/a);
    }
}
public class Single_Inheritance{

    public static void main(String args[]){
        Advcalc adv = new Advcalc();
        int a = adv.add(1,2);
        int b = adv.sub(10,5);
        int c = adv.mul(10, 2);
        int d = adv.div(5,10);
        System.out.println("Addition: " + a);
        System.out.println("Subtraction: " + b);
        System.out.println("Multiplication: " + c);
        System.out.println("Division: " + d);

    }
   

}
