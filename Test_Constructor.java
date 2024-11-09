public class Test_Constructor {
    public Test_Constructor(){
        System.out.println("Default constructor");
        System.out.println("Welcome");
    }
    public Test_Constructor(String name)
    {
        System.out.println("Parameterized constructor");
        System.out.println("Welcome to "+name);
    }
    public static void main(String args[]){
        Test_Constructor t1 = new Test_Constructor();
        Test_Constructor t2 = new Test_Constructor("Mahesh");
    }
}