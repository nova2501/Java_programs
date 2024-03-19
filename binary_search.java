package java_programs;

public class binary_search {
        public static int binarysearch(int arr[], int low, int max, int x) {
            while (low <= max) {
                int mid = (low + max) / 2;
                if (x == arr[mid])
                    return mid;
                if (x < arr[mid])
                    max = mid - 1;
                else
                    low = mid + 1;
            }
            return -1;

        }

        public static void main(String[] args) {
            int arr[] = {2, 4, 5, 1, 6, 7, 8, 9, 3};
            int n = arr.length;
            int x = 7;
            int result = binarysearch(arr, 0, n - 1, x);
            if (result == -1) {
                System.out.println("Not found");
            } else {
                System.out.println("The index of search element present is = " + result);
            }
        }
    }


