package binarySearch;

public class ceilOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,3,4,7,9,12,34,65,89};
		
		int target =233;
		int ans = ceil(arr,0,arr.length-1,target);
		
		System.out.println(ans);

	}
	
	static int ceil(int[]arr,int start,int end,int target)
	{
		
		int mid = (start+end)/2;
		if(target==arr[mid])
		{
			return arr[mid];
		}
		else if(start>end)
		{
			return arr[start];
		}
		else if(target<arr[mid])
		{
			return ceil(arr,start,mid-1,target);
		}
		return ceil(arr,mid+1,end,target);
		
	}

}
