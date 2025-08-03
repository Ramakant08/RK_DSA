package RkDSA.KC.Searching;

public class FindingTargetInRotatedArray {

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(findTheTargetElement(arr, target));
    }

    public static int findTheTargetElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int peakelement = findPeakElement(arr, start, end);
        if (target == arr[peakelement]) {
            return arr[peakelement];
        }
        if (target >= arr[start]) {
            end = peakelement - 1;
            return search(arr, target, start, end);
        } else {
            start = peakelement + 1;
            return search(arr, target, start, end);
        }

    }


    //for non duplicate element array
    public static int findPeakElement(int[] arr, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }


    public static int findPeakElementInDuplicateElementArray(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            //if the elements at the mid, start and end are same then skip the duplicates
            if (arr[start] == arr[end] && arr[start] == arr[mid]) {
                //check if start is not the pivot or peak
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                //check if end is not the pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            //left side is sorted so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
