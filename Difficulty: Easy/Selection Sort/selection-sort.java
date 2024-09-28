//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{
	int  select(int arr[], int i)
	{
	    int min=arr[0];
	    for(int j=0;j<=arr.length-2;j++)
	    {
	        min=arr[j];
	        for(int k=j;k<=arr.length-1;k++)
	        {
	            if(arr[k]<min)
	            min=arr[k];
	            
	        }
	    }
	    return min;
        // code here such that selectionSort() sorts arr[]
	}
	
	void selectionSort(int arr[], int n)
	{
         for(int i=0;i<=arr.length-2;i++)
        {
            int min=arr[i];
            for(int j=i;j<=arr.length-1;j++)
            {
            if(arr[j]<min) {
                min = arr[j];
                int temp;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            }
        }
}
}