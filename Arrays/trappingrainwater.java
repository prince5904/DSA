import java.util.*;
public class trappingrainwater {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=n-1;
        int leftmax=0;
        int rightmax=0;
        int water=0;
        while(left<=right){
            if(arr[left]<=arr[right]){
                if(arr[left]>=leftmax){
                    leftmax=arr[left];
                }else{
                    water+=leftmax-arr[left];
                }
                left++;
            }else{
                if(arr[right]<=arr[left]){
                    if(arr[right]>=rightmax){
                        rightmax=arr[right];
                    }else{
                        water+=rightmax-arr[right];
                    }
                }
                right--;
            }
        }
        System.out.println(water);
    }
}
