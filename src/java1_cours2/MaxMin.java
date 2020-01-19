
public class MaxMin {
    public static void main(String[] args) {
        int[] arr = { 9, 5, 3, 2, 11, 4, 5, 11, 3, 8, 9, 7};
        int[] arrmi = new int[1];
        int[] arrma= new int[1];
        for (int i = 0; i < arr.length; i++) {
      if (arr[i] <= arr[arr.length - 1]) {
                arrmi[0] = arr[i];
            } else {
                arrma[0] = arr[i];    
            }       
        }
       for (int i = 0; i < arr.length; i++) {
        if (arrmi[0] >= arr[i])  {
            arrmi[0] = arr[i];
        }   
        if (arrma[0] <= arr[i])  {
            arrma[0] = arr[i];
        }  
       }
       System.out.println(arrma[0]);
     System.out.println(arrmi[0]);          
    }
}
