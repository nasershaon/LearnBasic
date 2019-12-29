package basic;

public class UseMethod {
    //Mtrhord
    //Return Type
    //non-Return Method
    //Method name = verb+Noun
    //AccessModifire Return type methodName(){body}<<<syntax>>>

    /*public double doSummation(){
        int number1=50;
        int number2=70;
        int summation = number1+number2;
        System.out.println("summation if number is " + summation);
        return summation;
    }*/
    //Parameterized return method

    public double doSummation(int num1, int num2){
        int number1=num1;
        int number2=num2;
        int summation = number1 + number2;
        System.out.println("summation if number is " + summation);
        return summation;
    }

    public static void main(String[] args) {
        //object
        //className objectName=new constructorOfClass();<<<<syntax>>>>
    UseMethod obj= new UseMethod();

   // obj.doSummation();
    obj.doSummation(10,5555);
        //System.out.println("summation if number is " + obj.doSummation());
       // int summation;
        //System.out.println(obj.doSummation());
    }
}
