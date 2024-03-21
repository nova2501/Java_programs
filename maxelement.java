package java_programs;

public class maxelement {
        public static void main(String[] args) {
            int arr[] = {2, 4, 6, 8, 10};
            int n = arr.length;
            int max=0;


            for (int i = 0; i < n; i++) {

                for (int j = i; j < n; j++) {
                    int sum=0;
                    for (int k = i; k <= j; k++) {
                        sum+=arr[k];
                    }
                    System.out.print(sum + " ");
                    System.out.println();
                    if(max<sum)
                    {
                        max=sum;
                    }

                }

                System.out.println();
            }
            System.out.println("The max num is"+max);

        }
    }


