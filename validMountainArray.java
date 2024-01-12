package binarySearch2;

public class validMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr = {0,1,2,3,4,3,4,1,0};
		
		boolean ans = validMountainArray(arr);
		System.out.println(ans);

	}
	
	 public static boolean validMountainArray(int[] arr) {
		 if(arr.length<3)
		 {
			 return false;
		 }
		 int i =0;
		 while(i<arr.length-1&&arr[i]<arr[i+1])
		 {
			 i++;
		 }
		 if(i==0||i==arr.length-1)
		 {
			 return false;
		 }
		 while(i<arr.length-1&&arr[i]>arr[i+1])
		 {
			 i++;
		 }
		 
		 if(i==arr.length-1) {
			 return true;
		 }
		 return false;
	 }
}
