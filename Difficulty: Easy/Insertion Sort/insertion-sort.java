//{ Driver Code Starts
import java.util.*;
import java.lang.Math;

class Sorting
{
	
	static void printArray(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
		System.out.print(arr[i]+" ");
	    System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
		
			for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
			
			 new Solution().insertionSort(a,n);
			 printArray(a,n);
			
		t--;
		
System.out.println("~");
}
		
	}
}
// } Driver Code Ends


class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      sort(arr,0,0);
  }
        static void sort(int a[],int i,int  j)
    {
        if(i>=a.length)
        {
            return;
        }
        if(j==0)
        {
            sort(a,i+1,i+1);
            return;
        }
        if(a[j]<a[j-1])
        {
            int temp;
            temp=a[j];
            a[j]=a[j-1];
            a[j-1]=temp;
            sort(a,i,j-1);
        }
        else
        {
            sort(a,i,j-1);
        }

        /*for(int i=0;i<a.length;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(a[j]<a[j-1])
                {
                    int temp;
                    temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }*/
    
  }
}