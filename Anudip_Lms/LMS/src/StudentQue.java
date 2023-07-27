public class StudentQue {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.display("August",22);
    }
}
class Student{
    String name;
    int roll_no;
    void display(String name,int roll_no){
        this.name=name;
        this.roll_no=roll_no;
        System.out.println("The name of the student is " + name + " and roll no is "+roll_no);
    }
}