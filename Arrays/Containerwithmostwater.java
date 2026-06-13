import java.util.*;
public class Containerwithmostwater {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=n-1;
        int maxwater=0;
        while(left<right){
            int width=right-left;
            int currarea=Math.min(arr[left],arr[right])*width;
            maxwater=Math.max(maxwater,currarea);
            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(maxwater);
    }
}
