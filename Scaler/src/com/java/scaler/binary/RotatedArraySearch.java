package com.java.scaler.binary;

public class RotatedArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = new int[] {1, 7, 67, 133, 178 };
		int B = 1;
		
		System.out.println("Value -"+search(A, B));
	}

	static int search(final int[] A, int B) {
		
		int pivot = 0;
		int n = A.length;
		
		int start = 0;
		int end = n-1;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(mid==0 && end==1) {
				pivot = 1;
				break;
			}
			if(A[mid] < A[mid-1]) {
				pivot = mid;
				break;
			}else if( (A[mid] > A[start]) && (A[mid] > A[end])){
				start = mid + 1;
			}else {
				end = mid-1;
			}
		}
		
		if(A[0]<A[n-1])
			pivot = 0;
		
		System.out.println("Pivot Position -"+pivot);
		
		if(B == A[pivot])
			return pivot;
		else if (B <= A[n-1]) {
			// search in right side
			start = pivot+1;
			end  = n-1;
		}else if (B >= A[0]) {
			// search in left side
			start = 0;
			end = pivot-1;
		}else
			return -1;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(A[mid]==B)
				return mid;
			else if(A[mid]>B) {
				end = mid - 1;
			}else {
				start = mid +1;
			}
		}
		
		return -1;
    }
}
