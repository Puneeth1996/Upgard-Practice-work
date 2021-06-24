import java.util.*;

public class Source {

    public static void printElementInAllRows( int mat[][], int row, int col )
    {   
        int[] arr = new int[row];
        int count  = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        for (int j = 0; j < col; j++)
            mp.put(mat[0][j],1);
        for (int i = 1; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                if (mp.get(mat[i][j]) != null && mp.get(mat[i][j]) == i)
                {
                    mp.put(mat[i][j], i + 1);
                    if (i == row - 1){
                        count++;
                        arr[count] = mat[i][j];
                    }
                }
            }
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            if(arr[i]>0){
                System.out.print(arr[i] + " ");
            }            
        }

    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        int matrix[][] = new int[row][col];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        printElementInAllRows(matrix, row, col);
        sc.close();
    }
}