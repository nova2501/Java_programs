package java_programs;

public class product_of_array_except_itself {
        public static int[] product(int[] arr)
        {
            int n=arr.length;
            int res[]=new int[n];
            int left[]= new int[n];
            int right[]=new int[n];
            left[0] = 1;
            right[n-1]=1;
            for(int i=1;i<n;i++)
            {
                left[i]=left[i-1]*arr[i-1];
                System.out.println(left[i]);
            }

            for(int i=n-2;i>=0;i--)
            {
                right[i]=right[i+1]*arr[i+1];
            }
            for(int i=0;i<n;i++)
            {
                res[i]=left[i]*right[i];
            }
            return  res;
        }
        public static void main(String[] args) {
            int a[]={2,4,5,1,6};
            int[] result=product(a);
            for(int i=0;i<a.length;i++)
            {
                System.out.println(result[i]);
            }
        }
    }


