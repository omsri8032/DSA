//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            new Solution().mergeSort(arr, 0, arr.length - 1);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            System.out.println();

            // System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {

    void mergeSort(int arr[], int l, int r) {
         mergesort(arr,0,arr.length-1);
    }
     static void mergesort(int a[],int low,int high)
    {
        if(low>=high)
            return;
        int mid=(high+low)/2;
        mergesort(a,low,mid);
        mergesort(a,mid+1,high);
        merge(a,low,mid,high);

    }
     static void merge(int a[],int low,int mid,int high)
    {
        ArrayList<Integer> l=new ArrayList<Integer>();
     int left=low;
     int right=mid+1;
     while (left<=mid&&right<=high)
     {
         if(a[left]<=a[right]) {
             l.add(a[left]);
             left++;
         }
         else {
             l.add(a[right]);
             right++;
         }
     }
     while(left<=mid) {
         l.add(a[left]);
         left++;
     }
     while (right<=high)
     {
         l.add(a[right]);
         right++;
     }
        for(int i=low;i<=high;i++)
        {
            a[i]= l.get(i - low);
        }


    }
}
