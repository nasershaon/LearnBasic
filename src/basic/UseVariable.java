package basic;

public class UseVariable {
    //Variable
    //Global Variable//Reference variable;
    //Local Variable
        static String stName="Fahim";//Declare Variable

    //Global Variable
    static String name="shaon";//Declare and initialized value
    int number=123;//golbal

    public static void display(){
        int tvSize=65;//local variable;
        name="Naser";
        stName="Shaon";
        System.out.println(stName);
     }

    public static void main(String[] args) {
        System.out.println("name is"+ stName);
        //basic.UseVariable obj= new basic.UseVariable ();
        //obj.display();
    }
}
