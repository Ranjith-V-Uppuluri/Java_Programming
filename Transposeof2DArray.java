import java.util.*;

public class Transposeof2DArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row,col;
        System.out.println("Enter the numbers of rows");
        row=sc.nextInt();
        System.out.println("Enter the numbers of columns");
        col=sc.nextInt();
        int num[][]=new int[row][col];
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                num[i][j]=sc.nextInt();
            }
        }

        System.out.println("The entered matrix");
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(num[i][j]+" ");
            }

            System.out.println();
        }
        
        if(row==col){

        System.out.println("The Transpose matrix is:");
        for (int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(num[j][i]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Transpose not possible");
        }
        
    }
    
}
