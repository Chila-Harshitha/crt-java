import java.util.*;
class ArrayRotation4{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int j=0;
        for(j=0;j<n;j++)
        a[j]=s.nextInt();
        int k=s.nextInt();
        int r;
        for(r=0;r<n-k;r++)
        {
       int t=a[n-1];
       for(j=n-1;j>0;j--){
           a[j]=a[j-1];
       }
       a[0]=t;
    }
        for(j=0;j<n;j++)
        System.out.print(a[j]+" ");
    }
}
