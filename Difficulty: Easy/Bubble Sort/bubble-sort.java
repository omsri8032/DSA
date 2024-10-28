//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        sort(arr,0,0);
    }
    static void sort(int a[],int i,int j)
    {
        if(i>a.length-1)
            return;
        if(j>=a.length-i-1)
        {
            sort(a,i+1,0);
        }
else{
        if(a[j]>a[j+1])
        {
            int temp;
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
            sort(a,i,j+1);
        }
         else
        {
            sort(a,i,j+1);
        }
    }
}
}


//{ Driver Code Starts.

class Sorting
{
    //method to print the Elements of the array
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		while(t>0)
		{
		    //taking total elements
			int n = sc.nextInt();
			
			//creating a new array of length n
			int arr[] = new int[n];
			
			//inserting elements to the array
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt(); 
			}
			
			
			//calling bubbleSort() method
			new Solution().bubbleSort(arr,n);
			
			//calling printArray() method
			printArray(arr);
			
		t--;	
		
System.out.println("~");
}
	}

}
// } Driver Code Ends