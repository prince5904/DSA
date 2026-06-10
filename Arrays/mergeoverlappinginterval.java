import java.util.*;
public class mergeoverlappinginterval {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Arrays.sort(arr,(a,b)-> a[0]-b[0]);
        List<int[]>ans=new ArrayList<>();
        int start=arr[0][0];
        int end=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<=end){
                end=Math.max(end,arr[i][1]);
            }else{
                ans.add(new int[]{start,end});
                start=arr[i][0];
                end=arr[i][1];
            }
        }
        ans.add(new int[]{start,end});
        for(int[] interval : ans){
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
