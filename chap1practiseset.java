package com.company;
    import java.lang.foreign.SymbolLookup;
    import java.util.Scanner;
    public class Main {
        public static void main(String[] args){
    //         question 1
          int a = 4;
          int b = 6;
          int c = 7;
          int sum =a+b+c;
            System.out.println(sum);
      //       question 2
       float subject1= 45;
       float subject2= 76;
       float subject3= 84;
       float cgpa=(subject1+subject2+subject3)/30;
            System.out.println(cgpa);
         //    question 3
            System.out.println("what is your name");
            Scanner sc =new Scanner(System.in);
            String name= sc.next();
            System.out.println("Hello "+name+" have a good day");
          //   question 5
            System.out.println("Enter the number");
              Scanner sc =new Scanner(System.in);
            System.out.println(sc.hasNextInt());
        }
    }
