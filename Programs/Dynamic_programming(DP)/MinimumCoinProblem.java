
import java.util.*;

public class MinimumCoinProblem {
static int dp[][];


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int cost=sc.nextInt();
		int n=sc.nextInt();
		int coins[]= new int[n];
		for(int i=0;i<n;i++) {
			coins[i]=sc.nextInt();
		}
		dp= new int[n+1][cost+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=cost;j++) {
				dp[i][j]=-1;
			}
		}

	int ans=minCost(coins,cost,coins.length);
		if(ans<Integer.MAX_VALUE-10)   //to check its not close to infinte.
			System.out.println(ans);
		else {
			System.out.println(-1);
		}
		//System.out.println(Integer.MAX_VALUE);
	

	}
	static int minCost(int a[],int cost,int n) {
		if(dp[n][cost]!=-1) {
			return dp[n][cost];
		}
		if(cost==0) return dp[n][cost]=0;
       
		if(n==0 && cost!=0)return dp[n][cost]=Integer.MAX_VALUE-1;
		
	
		if(a[n-1]<=cost) {
			 dp[n][cost]= Math.min(minCost(a,cost-a[n-1],n)+1, minCost(a,cost,n-1));
       
		}else {
		 dp[n][cost]=minCost(a,cost,n-1);
           
		}
		return dp[n][cost];
//        if(dp[n][cost]==Integer.MAX_VALUE) {
//			return dp[n][cost]=-1;
//		}
//		else {
//			return dp[n][cost];
//		}
		}
		
		
	}


