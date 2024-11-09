//A class can contain more than one constructor and all these constructors
//having the same name but different arguments and hence these constructors are considerd as overloaded constructors.

public class Overload_Constructors {

    int x;
    public Overload_Constructors(){
        System.out.println("Default Constructor");
        x = 1;
    }
    public Overload_Constructors(int k){
        System.out.println("Parameterized constructor");
        x = k;
    }
    public Overload_Constructors(Overload_Constructors o){
        x = o.x;
        System.out.println("Copy Constructor");
    }
    void show(){
        System.out.println(x);
    }
    public static void main(String args[]){
        Overload_Constructors O1 = new Overload_Constructors();
        Overload_Constructors O2 = new Overload_Constructors(10);
        Overload_Constructors O3 = new Overload_Constructors(O1);
        O1.show();
        O2.show();
        O3.show();
    }

}

/*
 * Default Constructor
    Parameterized constructor
    Copy Constructor
    1
    10
    1
 */