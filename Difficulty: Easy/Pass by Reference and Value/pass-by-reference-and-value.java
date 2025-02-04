//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            Solution obj = new Solution();
            int ans[] = obj.passedBy(n, m);

            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int[] passedBy(int a, int b) {
         int[] ans= new int[2];
        ans[0]=passbyvalue(a);
        passbyreference(ans,b);
        return ans;
    }
    static int passbyvalue(int x){
        return x+1;
    }
    static void passbyreference(int[] arr, int val){
        arr[1]=val+2;
    }
}
