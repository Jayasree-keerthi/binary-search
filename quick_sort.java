import java.util.*;
import java.io.*;
public class void mian(String args[])
{
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=s.nextInt();
    }
    int low=1;
    int high=n-1;
    int result=quick_sort(a,target,low,high);
    for(int i=0;i<n;i++)
    {
        System.out.print("Sorted array is:"+a[i]+" ");
    }
}
static int quick_sort(int a[],int target,int left,int right)
{
    int pivot=a[0];
    int l=left;
    int r=gight;
    while(left<right)
    {
        if(pivot>left)
        {
            int temp=pivot;
            pivot=a[l];
            a[l]=temp;
        }
        pivot=a[left];
        l++;
        if(pivot>right)
        {
            int temp1=pivot;
            pivot=a[r];
            a[r]=temp1;
        }
        pivot=a[right];
        r--;
    }
    return quick_sort(a,target,l,r);
}
