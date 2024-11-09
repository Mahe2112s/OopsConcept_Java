//<class-name> object = new <class-name>();
class Sample
{
    void wish(){
        System.out.println("Hava a nice day");
    }
    void test(){
        wish();
    }
    public static void main(String args[]){
        Sample s = new Sample();
        s.wish();
        s.test();
    }
}