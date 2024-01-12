package binarySearch2;

public class searchInMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,3,4,6,4,3,2};
		
		int target = 3;
		
//		int ans = binarySearch(arr,target,0,arr.length-1);
//		
//		System.out.println(ans);
		int ans1 = check(arr,target);
		System.out.println(ans1);
		
//		int ans = peakIndex(arr,0,arr.length-1);
//		System.out.println(ans);

	}
	
	static int check(int[]arr,int target)
	{
		
		int peak = peakIndex(arr,0,arr.length-1);
		
		int firstTry = binarySearch(arr,target,peak+1,arr.length-1);
		if(firstTry!=-1)
		{
			return firstTry;
		}
		return binarySearch(arr,target,0,peak);
	}
	
	static int peakIndex(int[]arr,int start,int end)
	{
		while(start<end)
		{
			int mid = (start+end)/2;
			
			if(arr[mid]>arr[mid+1])
			{
				end = mid;
			}
			else if(arr[mid]<arr[mid+1]) {
				start = mid+1;
			}
		}
		
		return end;
	}
	
	static int binarySearch(int[]arr,int target,int start,int end)
	{
		boolean isAscending = arr[start]<arr[end];
		
		while(start<=end)
		{
			int mid =(start+end)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			if(isAscending)
			{
				if(target<arr[mid])
				{
					end = mid-1;
				}
				else
				{
					start = mid+1;
				}
			}
			else {
				if(target<arr[mid])
				{
					start = mid+1;
				}
				else {
					end = mid-1;
				}
			}
		}
		return -1;
	}
}
