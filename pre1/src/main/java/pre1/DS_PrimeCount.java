package pre1;
import java.util.*;
public class DS_PrimeCount {
    public  void mainF4() {
        int []arr;
        boolean flag;
        System.out.println("Enter the size of an array:");
        Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         arr=new int[n];
        System.out.println("Enter the elements of array of size: "+ n );
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int count=0;
        for (int i=0;i< arr.length;i++)
        {
            int x=arr[i];
            flag=true;
            if (x==1){
                continue;
            }
            for (int j=2;j<x/2;j++)
            {
                if (x%j==0){
                    flag=false;
                    break;
                }

            }
            if(flag)
            {
                count++;
                System.out.print(" "+ x);

            }

        }
        System.out.println(" The number of prime numbers is :"+count);
    }
}
