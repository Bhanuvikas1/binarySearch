package binarySearch;

import java.util.Arrays;

public class firstAndLastOccurance {

	public static void main(String[] args) {
		
		int[] nums = {2,2,4,4,7,7,7,9,9};
		int target = 22;
		
		int[] result = valueRange(nums,target);
		
		int[] ans1 = valueRange(nums,target);
		System.out.println(Arrays.toString(ans1));
			
	}
	
	public static int[] valueRange(int[]nums,int target)
	{
		int[] ans = {-1,-1};
		int start = check(nums,target,true);
		int end = check(nums,target,false);
		
		ans[0] = start;
		ans[1]= end;
		
		return ans;
	}
	
	static int check(int[]nums,int target,boolean isstart)
	{
		int ans = -1;
		int start =0;
		int end = nums.length-1;
		while(start<=end)
		{
			int mid = (start + end)/2;
			
			if(target<nums[mid])
			{
				end = mid-1;
			}
			else if(target>nums[mid])
			{
				start = mid+1;
			}
			else {
				ans = mid;
				if(isstart)
				{
					end = mid-1;
				}
				else {
					start = mid+1;
				}	
			}
		}		
		return ans;
	}

}
