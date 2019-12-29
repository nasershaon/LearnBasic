package basic;

public class MyClass {
  /*public static void main (String[]args){
      double x= 10.0190988987665544;
      double y= 10.0190987654568987;
      double z= 10.09898786767888990;
      System.out.println(Math.max(x,z));
  }*/
  //Switch Case
    /*public static void main (String [] args){

      int menu=5;

      switch (menu){
          case 1:
              System.out.println("Appetizer");
              break;
          case 2:
              System.out.println("Drinks");
              break;
          case 3:
              System.out.println("main course");
              break;
          case 4:
              System.out.println("Water");
              break;
          case 5:
              System.out.println("desert");
              break;
          case 6:
              System.out.println("Pay check");
              break;
          case 7:
              System.out.println("add tips");
              break;
          case 8:
              System.out.println("invalid entry");
              break;
  }

 }*/ //Do while
  /*public static void main(String[] args) {
      int i=0;
      do {
          System.out.println(i);
          i++;
      } while (i<9);

  }*/
  /*public static void main(String[] args) {
      int i = 0;
      while (i < 3) {
          System.out.println(i);
          i++;
      }
      System.out.println(c);
  }
  public static void main(String [] args){
     // for (int i=0;i<10;i++ ){
      for (int i=0;i<=10; i=i+2){
          System.out.println(i);

  }*/
  public static void main(String[] args) {
      MyClass.number();
      for (int i = 0; i < 10; i++) {
          if (i == 4) {

              continue
                      ;
          }
          System.out.println(i);
      }
  }
      //String[] car={"Toyota","BMW","Volvo","ford","Invalid"};
      //System.out.println(car.length);

      public static void number(){
      //for (int i= 40; i<=60; i++){
       //   System.out.println("number is "+i);
          int time = 20;
          String result =
                  (time < 22) ?  "Good day." : "Good evening.";
          System.out.println(result); //}


  }


}

