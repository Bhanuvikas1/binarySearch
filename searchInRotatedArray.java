public class searchInRotatedArray {
    public static void main(String[] args) {
    int[] arr = {4,5,6,7,0,1,2};

    System.out.println(pivot(arr));

    System.out.println(search(arr,4));
    }

    static int search(int[] arr,int target)
    {
        int pivots = pivot(arr);

        if (pivots==-1)
        {
            return binarySearch(arr,target,0,arr.length-1);
        }
        if (arr[pivots]==target)
        {
            return pivots;
        }
        if (target>arr[0])
        {
            return binarySearch(arr,target,0,pivots-1);
        }

        return binarySearch(arr,target,pivots+1,arr.length-1);

    }

    static int pivot(int[]arr)
    {
        int start =0;
        int end = arr.length-1;

        while (start<=end)
        {
            int mid = (start+end)/2;
            if (mid<end&&arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if (mid>start&&arr[mid]<arr[mid-1])
            {
                return mid;
            }
            if (arr[mid]<=arr[start])
            {
                end = mid-1;
            }
            else {
                start = mid+1;
            }

        }
        return -1;
    }

    static int binarySearch(int[] arr,int target, int start, int end)
    {
        while (start<=end)
        {
            int mid = (start+end)/2;

            if (arr[mid]==target)
            {
                return mid;
            }
            else if (target<arr[mid])
            {
                end = mid-1;
            }
            else if (target>arr[mid])
            {
                start = mid+1;
            }
        }
        return -1;
    }
}
