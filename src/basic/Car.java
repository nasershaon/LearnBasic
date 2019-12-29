package basic;

public class Car {
    public String myCar(){
        String color= "Black";
        String mark="Toyota";
        String model="Camry";
        int year=2014;
        String tlcCar=color + mark + model+year;


        System.out.println("My TLC Car is "+ tlcCar );
        return tlcCar;
    }
//    public String doSummation(String num1,int num2){
//        String color=num1;
//        int year=num2;
//        String=myCar()
   // }
    public static void main(String[] args) {
        Car carObj= new Car();
        carObj.myCar();
        //System.out.println("My TLC Car is "+ carObj.myCar());





    }
}

