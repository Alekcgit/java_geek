package java1_cours2;
// Задание 4
public class Arr4 {
    public static void main(String[] args) {
        int counter=0;
        int[][] table=new int[4][4];
        for (int i=0; i < 4; i++)  {
          for (int j=0; j < 4; j++)  {
               if (i==j || j==3-i)  {
          table[i][j]=1;
 System.out.print(table[i][j]+" ");
          } else {
           table[i][j]=counter;
            System.out.print(table[i][j]+" ");
                }
            }
System.out.println();
}
    }
}