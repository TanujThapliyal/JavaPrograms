import java.util.Arrays;

public class ProductOfArraysExceptItself {
    public static void main(String[]args){
        int[] nums={1,2,3,4};
        ProductOfArraysExceptItself method=new ProductOfArraysExceptItself();
        int [] result=method.product(nums);
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }

    public int[] product(int[] nums){
        int [] result=new int[nums.length];

        Arrays.fill(result,1);

        int pre=1,post=1;

        for(int i=0;i< nums.length;i++){
            result[i]=pre;
            pre=pre*nums[i];
        }

        for(int i= nums.length-1;i>=0;i--){
            result[i]=result[i]*post;
            post=post*nums[i];
        }
        return result;
    }
}