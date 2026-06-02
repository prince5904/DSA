import java.util.*;
public class rightrotatearray {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        d=d%n;
        int temp[]=new int[d];
        for(int i=n-d;i<n;i++){
            temp[i-(n-d)]=arr[i];
        }
        for(int i=n-d-1;i>=0;i--){
            arr[d+i]=arr[i];
        }
        for(int i=0;i<d;i++){
            arr[i]=temp[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
