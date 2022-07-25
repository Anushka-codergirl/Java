public class editdistance {
	public static int editM(String s , String t) {
		int m = s.length();
		int n = t.length();
		int storage[][]= new int[m+1][n+1];
		for(int i=0;i<=m;i++) {
			for(int j=0;j<=n;j++) {
				storage[i][j]=-1;
			}
		}
		return editM(s,t,storage);
		
	}
	
	private static int editM(String s, String t, int[][] storage) {
		int m = s.length();
		int n = t.length();
		if(storage[m][n]!=-1) {
			return storage[m][n];
		}
		if(m==0) {
			storage[m][n]= n;
			return storage[m][n];
		}
		if(n==0) {
			storage[m][n]=m;
			return storage[m][n];
		}
		if(s.charAt(0)==t.charAt(0)) {
			storage[m][n] = editM(s.substring(1),t.substring(1),storage);
		}
		else {
			//insert
			int op1 = editM(s,t.substring(1),storage);
			//delete
			int op2 = editM(s.substring(1),t,storage);
			//substituite
			int op3=editM(s.substring(1),t.substring(1),storage);
			
			storage[m][n]= 1+Math.min(op1,Math.min(op2, op3));
		}
		return storage[m][n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "adef";
		String t = "gbde";
		int res=  editM(s,t);
		System.out.print(res);
	}

}
