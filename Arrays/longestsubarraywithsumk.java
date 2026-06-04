import java.util.*;
public class longestsubarraywithsumk {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k1=sc.nextInt();

        int len=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k1){
                    len=Math.max(len,j-i+1);
                }
            }
        }
        System.out.println(len);
        //hashmap approach
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);

        int sum1 = 0;
        int count1 = 0;

        for(int num : arr){
            sum1 += num;

            if(map.containsKey(sum1 - k1)){
                count1 += map.get(sum1 - k1);
            }

            map.put(sum1, map.getOrDefault(sum1, 0) + 1);
        }

        System.out.println(count1);
        //two pointer approach
       int left=0;
       int right=0;
       int sum=arr[0];
       int len1=0;
        while(right<n){
            while(left<=right && sum>k1){
                sum-=arr[left];
                left++;
            }
            if(sum==k1){
                len1=Math.max(len1,right-left+1);
            }
            right++;
            if(right<n){
                sum=sum+arr[right];
            }
        }
        System.out.println(len1);
    }
}
