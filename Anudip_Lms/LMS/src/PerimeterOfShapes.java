public class PerimeterOfShapes {
    public static void main(String []args){
        Perimeter obj=new Perimeter();
        System.out.println(obj.peri(4)+ " is the perimeter of Square.");
        System.out.println(obj.peri(4,2)+ " is the perimeter of rectangle.");
        System.out.println(obj.peri(4.2f)+ " is the perimeter of circle.");
    }
}
class Perimeter{
    int square;
    int rectangle;
    float circle;
    int peri(int side){
         square=4*side;
         return square;
    }
    int peri(int l,int b){
        rectangle=2*(l+b);
        return rectangle;
    }
    float peri(float r){
        circle=2 * (22/7) * r;
        return circle;
    }
}
