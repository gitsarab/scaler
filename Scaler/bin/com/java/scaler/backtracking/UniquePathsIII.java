package com.java.scaler.backtracking;

public class UniquePathsIII {

	 int ans = 0;
	public  void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] A = new int[3][4];
		A[0][0] = 1;
		A[0][1] = 0;
		A[0][2] = 0;
		A[0][3] = 0;
		
		A[1][0] = 0;
		A[1][1] = 0;
		A[1][2] = 0;
		A[1][3] = 0;
		
		A[2][0] = 0;
		A[2][1] = 0;
		A[2][2] = 2;
		A[2][3] = -1;
		/*int[][] A = new int[2][2];
		
		A[0][0] = 1;
		A[0][1] = 0;
		A[1][0] = 2;
		A[1][1] = 0;*/
		/*A[1][0] = 2;
		A[1][1] = 0;
		A[1][2] = 0;*/
		
		System.out.println("Unique Paths-"+solve(A));
	}

	 public int solve(int[][] A) {
	        
	        int zerocount = 0;
	        int m = A.length;
	        int n = A[0].length;
	        
	        int sRow = 0, sCol = 0;
	        for(int i=0;i<A.length;i++){
	            for(int j=0;j<A[i].length;j++){
	                if(A[i][j] == 0)
	                    zerocount++;
	                if(A[i][j]==1){
	                    sRow = i;
	                    sCol = j;
	                }
	            }
	        }
	        
	       // int ans = 0;
	        //uniquePaths(A, zerocount, sRow, sCol,ans);
	        uniquePaths(A, zerocount, sRow, sCol);
	        
	        
	        return ans;
	    }
	    
	     private void uniquePaths(int[][] A, int zerocount, int row, int col){
	        if(row < 0 || col < 0 ||  row >= A.length || col >= A[0].length || A[row][col] == 3  || A[row][col] == -1 )
	        	return;
	        if(A[row][col]==2) {
	        	if(zerocount==0)
	        		ans++;
	        	return;
	        }
	        	
	       // if( A[row][col]==0) {
	        	A[row][col]=3;
	        	zerocount--;
	       // }
	        /*uniquePaths(A,zerocount,row,col+1,ans);
	        uniquePaths(A,zerocount,row+1,col,ans);
	        uniquePaths(A,zerocount,row,col-1,ans);
	        uniquePaths(A,zerocount,row-1,col,ans);*/
	        
	        uniquePaths(A,zerocount,row,col+1);
	        uniquePaths(A,zerocount,row+1,col);
	        uniquePaths(A,zerocount,row,col-1);
	        uniquePaths(A,zerocount,row-1,col);
	        
	        
	       /* if(row==eRow && col == eCol) {
	        	 A[row][col]=2;
	        }else if (row==bRow && col == bCol)
	        	 A[row][col]=-1;
	        else
	        	A[row][col]=0;*/
	     //   if( A[row][col]==3) {
	        	A[row][col]=0;
	        	zerocount++;
	     //   }
	        
	    }
	    
}
