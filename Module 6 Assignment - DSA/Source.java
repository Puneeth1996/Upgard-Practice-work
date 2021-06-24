import java.util.*;

public class Source {

    public static int median(int ar1[], int ar2[], int n)
    {  
        int i = 0; 
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
    
        for (count = 0; count <= n; count++)
        {
            if (i == n)
            {
                m1 = m2;
                m2 = ar2[0];
                break;
            }
            else if (j == n)
            {
                m1 = m2;
                m2 = ar1[0];
                break;
            }
            if (ar1[i] <= ar2[j])
            {  
                m1 = m2; 
                m2 = ar1[i];
                i++;
            }
            else
            {
                m1 = m2; 
                m2 = ar2[j];
                j++;
            }
        }
    
        return (m1 + m2)/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr1[i] = sc.nextInt();
        }
        
        for(int i = 0 ; i < n ; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println(median(arr1, arr2, n));
        sc.close();
    }
}