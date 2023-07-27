import java.util.*;
public class CommandLineArgument {
    public static void main(String[]args){
    if(args[0].charAt(0)=='A' && args[0].charAt(1)=='F'){
        if(args[0].length()==6)
        {
            System.out.println("Accessed");
        }
        else {
            System.out.println("Length is not correct");
        }
    }
    else{
        System.out.println("Access Denied \n ID should be start with A and F");
    }
    }

}
