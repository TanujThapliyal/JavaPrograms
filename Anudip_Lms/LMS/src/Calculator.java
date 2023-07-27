import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        String ch;
        do{
            Scanner input=new Scanner(System.in);
            System.out.print("Enter num 1 :");
            int num1=input.nextInt();
            System.out.print("Enter num 2 :");
            int num2=input.nextInt();
            System.out.print("Enter the operation you want to perform :");
            char op=input.next().charAt(0);
            switch(op){
                case'+'-> System.out.println(num1+num2);
                case'-'-> System.out.println(num1-num2);
                case'/'-> System.out.println(num1/num2);
                case'%'-> System.out.println(num1%num2);
                case'*'-> System.out.println(num1*num2);
                default -> System.out.println("Enter the valid character....");
            }
            System.out.println("You want to continue : y or n?");
            ch=input.next();
        }while(ch.equals("yes"));
    }
}
