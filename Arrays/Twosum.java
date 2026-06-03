import java.util.*;
public class Twosum {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        int target=sc.nextInt();
        List<List<Integer>>temp=new ArrayList<>();
        while(left<right){
            if(arr[left]+arr[right]>target){
                right--;
            } else if (arr[left]+arr[right]<target) {
                left++;

            }else{
                List<Integer>list=Arrays.asList(arr[left],arr[right]);
                temp.add(list);
                left++;
                right--;
            }
        }
        for(List<Integer>list1:temp){
            System.out.println(list1);
        }

    }
}
