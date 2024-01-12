package binarySearch2;

public class mountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,6,8,12,23,5,2};
		
		int ans = peakIndex(arr,0,arr.length-1);
		
		System.out.println(ans);
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

}
