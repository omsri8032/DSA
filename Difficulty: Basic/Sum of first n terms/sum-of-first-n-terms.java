//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.sumOfSeries(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
     long sum=0;
     long result;
    long sumOfSeries(long n) {
       long result=r(1,n);
       return result;
    }
    long r(long  i,long N)
    {
        if(i>N)
        return sum;
        sum=sum+(i*i*i);
        r(i+1,N);
        return sum;
        
    }
}
