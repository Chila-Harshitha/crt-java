import java.util.*;
class ArrayRotation2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int k=s.nextInt();
        for(int i=k;i<n;i++)
        {
        b[j]=a[i];
        j++;
    }
        for(int i=0;i<k;i++){
        b[j]=a[i];
        j++;
        }
        for(int i=0;i<n;i++)
        a[i]=b[i];
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}