package basic;

import java.util.Scanner;

public class UseScanner{
    public static void main(String[]args){

        Scanner yourId= new Scanner(System.in);
        System.out.println("Enter your ID");
        int id= yourId.nextInt();
        System.out.println("Enter your id: "+id);

        Scanner yourName= new Scanner(System.in);
        System.out.println("Enter your name");
        String name=yourName.nextLine();
        System.out.println("HI "+name);
        if (id==99){
            System.out.println("Welcome to Jungal");
        }else
            System.out.println("Please input correct id ");


    }

}