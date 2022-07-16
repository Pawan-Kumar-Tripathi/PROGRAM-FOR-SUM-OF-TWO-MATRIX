import java.io.*;
import java.util.*;
class sumof2matrix
    {
        public void main()
        {
            int i ,j;
            Scanner sc = new Scanner(System.in);
            System.out.println(" please enter the value of 1st row");
            int m = sc.nextInt();
            System.out.println(" please enter the value of 1st coloumn");
            int n = sc.nextInt();
            
            int a[][] = new int [m][n];
            int b[][] = new int [m][n];
            int c[][] = new int [m][n];
            System.out.println("enter the element in the first matrix");
            for( i =0;i<m;i++)
            {
                for( j =0;j<n;j++)
                {
                    a[i][j] =  sc.nextInt();
                }
            }
            System.out.println("enter the element in the second matrix");
            for( i = 0;i<m;i++ )
            {
                for( j = 0 ; j<n; j++)
                {
                    b[i][j] = sc.nextInt();
                }
            }
            for( i = 0;i<m;i++ )
            {
                for( j = 0 ; j<n; j++)
                {
                    c[i][j] = a[i][j]+b[i][j];
                    System.out.print(c[i][j] + "  ");
                }
                System.out.println(" ");
            }
        }
    }
            
