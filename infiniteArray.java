package binarySearch2;

public class infiniteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr = {2,3,5,6,34,45,66,77,88,99};
		int target = 3;
		
		System.out.println(findIndex(arr,target));

	}
	
	
	static int findIndex(int[]nums,int target)
	{
		int start =0;
		int end = 1;
		
		while(target>nums[end])
		{
			int temp = end+1;
			end = end+(end-start+1)*2;
			start=temp;
		}
		return searchInfinite(nums,start,end,target);
	}
	
	static int searchInfinite(int[]arr,int start,int end,int target)
	{
		if(start>end)
		{
			return -1;
		}
		int mid = (start+end)/2;
		if(target==arr[mid])
		{
			return mid;
		}
		else if(target<arr[mid])
		{
			return searchInfinite(arr,start,mid-1,target);
		}
		return searchInfinite(arr,mid+1,end,target);
	}

}
