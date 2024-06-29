import java.util.*;
class ArrayRotation3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int j=0;
        for(j=0;j<n;j++)
        a[j]=s.nextInt();
        int k=s.nextInt();
        int r;
        for(r=0;r<k;r++)
        {
       int t=a[0];
       for(j=0;j<n-1;j++){
           a[j]=a[j+1];
       }
       a[j]=t;
    }
        for(j=0;j<n;j++)
        System.out.print(a[j]+" ");
    }
}
