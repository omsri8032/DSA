//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> f=new ArrayList<>();
        array(f,n);
        return f;


    }
    static void array(ArrayList<Long> f,long n)
    {
        long facto;

        for(long i=1;i<=n;i++) {
            if(fact(i)<=n)
            {
                facto=fact(i);
                f.add(facto);
            }
            else
            {
                break;
            }

        }
    }
            static long fact ( long n){
            if (n == 1) {
                return 1;
            }
            else
            {
                return n * fact(n - 1);
            }
    }
}
    
