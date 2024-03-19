package java_programs;

public class first_occurence {

        public static int occurence(int arr[],int n,int x)
        {
            int count=0;

            for(int i=0;i<n-1;i++)
            {
                if(arr[i]==x)
                    count++;
            }
            return count;
        }

        public static void main(String[] args) {
            int arr[]={1,2,4,2,3,2,4,2,7,6};
            int n=arr.length;
            int x=2;
            int result=occurence(arr,n,x);
            System.out.println(result);

        }
    }


