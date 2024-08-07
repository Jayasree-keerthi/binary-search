import java.util.*;
import java.io.*;
public class void main(String args[])
{
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int [n];//declaring an annay
    for(int i=0;i<n;i++)
    {
        a[i]=s.nextInt();//initialising an array
    }
    Arrays.sort(a);//inbuild function to sorta n array
    int target=s.nextInt();//importing the target variable
    int count=0;
    int low=0;
    int high=n-1;
    int mid=(low+high)/2;
    for(int i=0;i<n;i++)
    {
        mid=(low+high)/2;
        if(a[i]==target)
        {
            //if the target is equal to the mid element the code simply breaks and the complexity will ne O(1)
            break;
            count=1;//this is a flag variable it is updated to 1 if the target is founf else ir temains zero
        }
        else if(a[i]<target)
        {
            //if the target is less than mid then the high is updated to mid-1 and doesnot traverse the remaining part of the code this helps in reducing the time complexity
            high=mid-1;
        }
        else{
            //if the target is greater then mid then the low is updated to mid+1 , so that by using these process we attain O(logn) complexity
            low=mid+1;
        }
    }
    if(count==1)
    {
        System.out.println("Target found");
    }
    else{
        System.out.println("Target not found");
    }
    
}