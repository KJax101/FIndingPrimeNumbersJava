package Q9Prime100;

import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner prime = new Scanner(System.in);
        int n = 100;
       
        for(int i=2; i<=n; i++) 
        //initialization with i = 2
        {
            int flag = 1;
            for(int j=2;j<=i/2;j++)  
         //Dividing the number by half check if it divisible
            {
                if(i%j==0) 
         // If the number is divisible by other number -> Not a prime Number
                {
                    flag = 0;
                    break;
                }

            }
            if(flag==1) // 
           //If the number is not divisible by any other numbers but only by itself and 1 -> prime no
            {
                System.out.print(i+" ");
            }
        }
    }
}

