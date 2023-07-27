import java.util.*;
public class Largest {
    public static void main(String[] args) {
        //to find the largest number among three numbers
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a :");
        int a=input.nextInt();
        System.out.println("Enter b :");
        int b=input.nextInt();
        System.out.println("Enter c :");
        int c=input.nextInt();
        if(a>b && a>c){
            System.out.println(a + " is the largest number.");
        }
        else if(b>a && b>c){
            System.out.println(b + " is the largest number.");
        }
        else{
            System.out.println(c + " is the largest number.");
        }
    }

}
