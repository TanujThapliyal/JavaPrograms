import java.util.*;
public class ShowroomQue {
    public static void main(String []args){
        ShowRoom obj=new ShowRoom();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
class ShowRoom{
    String name;
    long mobno;
    double cost,amount;
    double dis;

    ShowRoom(){
    }
    void input(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Customer name:");
        name=input.nextLine();
        System.out.println("Enter mobile number:");
        mobno=input.nextLong();
        System.out.println("Enter Cost :");
        cost=input.nextDouble();
    }
    void calculate(){
        if(cost<=10000){
            dis=0.05*cost;
            amount=cost-dis;
        }
        else if(cost>10000 && cost<=20000){
            dis=0.1*cost;
            amount=cost-dis;
        }
        else if(cost>20000 && cost<=35000){
            dis=0.15*cost;
            amount=cost-dis;
        }
        else{
            dis=0.2*cost;
            amount=cost-dis;
        }
    }
    void display(){
        System.out.println("Customer's name -> "+name);
        System.out.println("Customer's mobile number -> "+mobno);
        System.out.println("Amount to be paid after discount -> "+amount);
    }
}
