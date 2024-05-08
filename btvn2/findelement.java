import java.util.Scanner;

public class findelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter element"+(i+1));
            a[i]=sc.nextInt();
        }
        boolean flag=false;
        System.out.println("enter element to find");
        int x=sc.nextInt();
        for(int j=0;j<a.length;j++)
        {
            if(a[j]==x)
            {
               flag=true;
               break;
            }

        }
        if(flag)
        {
            System.out.println("element found");

        }
        else {
            System.out.println("element not found");
        }
    }
}
