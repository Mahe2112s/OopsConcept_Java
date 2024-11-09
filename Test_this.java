//this is an implicit,dynamic,generic object to store address, which is in the currently executing object.
///It is used to differentiate local variable with member variable, if both of these
/// variable having same name. We have to place "this" keywork before the member variable name.
/// 
class Human
{
    private int age;
    private String name;
    public int getAge(){
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
        //this represents present object.
    }
    public String getName(){
        return name;
    }
    public void setName(String name,Human obj){
        Human obj1 = obj;
        obj1.name = name;
        //instance variable = local variable.
        //we can use this which represents present object or we can pass present object to specify instance variable.
    }
}
public class Test_this {
    public static void main(String args[])
    {
        Human obj = new Human();
        obj.setAge(21);
        obj.setName("Mahesh",obj);

        System.out.print("Name: "+obj.getName()+" "+"Age: "+obj.getAge());
        
    }
}
