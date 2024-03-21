package java_programs;

public class mergesort {

        public static void main(String[] args) {
            int arr[] = {4, 5, 7, 8, 9};
            int arr1[] = {1, 2, 3, 7, 10};
            int k = 0;
            int a = arr.length;
            int b = arr1.length;
            int c = a + b;
            int[] arr2 = new int[c];

            for (int i = 0; i < a; ) {
                for (int j = 0; j < b; )
                {
                    if (i < a && j < b)
                    {
                        if(arr[i]!=arr1[j])
                        {
                            if (arr[i] < arr1[j])
                            {
                                arr2[k++] = arr[i++];
                            }
                            else
                            {
                                arr2[k++] = arr1[j++];
                            }
                        }
                        else
                        {
                            arr2[k++]=arr[i++];
                            j++;
                        }

                    }
                    else if (i < a)
                    {
                        arr2[k++] = arr[i++];

                    }
                    else if (j < b) {
                        arr2[k++] = arr1[j++];
                    }
                }
            }

            // Print the merged array
            for (int s = 0; s < k; s++) {
                System.out.print(" " + arr2[s]);
            }
        }
    }



