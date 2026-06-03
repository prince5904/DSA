import java.util.*;
public class missingnumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        int expectedsum=n*(n+1)/2;
        int actualsum=0;
        for(int i=0;i<n-1;i++){
            actualsum+=arr[i];
        }
        System.out.println(expectedsum-actualsum);
    }
}
