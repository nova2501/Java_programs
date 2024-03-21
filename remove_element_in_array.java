package java_programs;

public class remove_element_in_array {

        public static void main(String[] args) {
            int arr[] = {2, 4, 5, 1, 5, 6, 7, 8, 9};
            int n = arr.length;
            int count=0;
            int rmv = 5;
            int j = 0;

            for (int i = 0; i  <n; i++) {
                if (arr[i] == rmv)
                {
                    count++;
                }
            }
            int size=n-count;
            int[] arr2=new int[size];
            for (int i = 0; i < n; i++) {
                if (arr[i] != rmv)
                {
                    arr2[j]=arr[i];
                    j++;
                }
            }
            System.out.println("After remove 5 the balance elements");
            for(int i=0;i<arr2.length;i++)
            {
                System.out.print(" "+arr2[i]);
            }
        }
    }


