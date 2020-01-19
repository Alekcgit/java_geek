import java.util.Arrays;

public class Arr1 {
    public static void main(String[] args) {
        int[] arr= {1,0,0,1,0,1,1,0,0,0,1,1,0,1,1,1};
        System.out.println("\nЗадание 1\narr.length: "+arr.length);
        for (int i=0; i<arr.length; i++){
           switch (arr[i]) {
               case 0:
                   arr[i]=1;
                   break;
               default:
                   arr[i]=0;
           }
            System.out.print(arr[i]+" ");
    }
        System.out.println("\n\nЗадание 2");
    int[] arr0=new int[8];
    for (int i=0; i < 8; i++)  {
        arr0[i]=i*3;
        System.out.println("arr0["+i+"]="+arr0[i]);
    }

    int[] nums= {1,5,3,2,11,4,5,2,4,8,9,1};
    int[] nums1= {1,5,3,2,11,4,5,2,4,8,9,1};
    System.out.println("\n\nЗадание 3\nnums.length: "+nums.length);
    for (int i=0; i<nums.length; i++){
        System.out.println("\nnums["+i+"]="+nums[i]);
        if(nums[i]<6) {
           nums[i]=nums[i]*2;
        }
        System.out.println("nums["+i+"]="+nums[i]);
    }
     System.out.println(Arrays.toString(nums1));
     System.out.println(Arrays.toString(nums));   
}
}
