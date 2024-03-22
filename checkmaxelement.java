package java_programs;

public class checkmaxelement {
        public static int Checkelement(int arr[])
        {
            int n=arr.length;
            for(int i=0;i<n;i++)
            {
                int count=0;
                for(int j=0;j<n;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                    }
                    if(count>(n/2))
                    {
                        return arr[i];
                    }
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            int arr[]={1,1,2,2,1,2,2,};
            int result=Checkelement(arr);
            System.out.println(result);


        }
    }


