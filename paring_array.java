package java_programs;

public class paring_array {
        public static void main(String[] args) {
            int arr[]={2,4,9,8,10};
            int n=arr.length;
            int max=0;
            for(int i=0;i<n;i++)
            {
                System.out.print(" "+arr[+i]);
            }
            System.out.println();
            for(int i=0;i<n-1;i++) {
                for (int j = i + 1; j < n; j++) {
                    if (i != j) {
                        System.out.print("(" + arr[i] + "," + arr[j] + ")");
                        int mul = arr[i] * arr[j];
                        if (max < mul)
                            max = mul;
                    }
                    System.out.println();
                }
            }
            System.out.println("\nthe maximum number is given array:"+max);
            for(int i=0;i<n-1;i++) {
                for (int j = i + 1; j < n; j++) {
                    if (i != j) {
                        int mul = arr[i] * arr[j];
                        if (max ==mul)
                            System.out.print("The product of two integers is (" + arr[i] + "," + arr[j] + ")");
                    }
                }
            }
        }
    }


