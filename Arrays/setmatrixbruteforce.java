import java.util.*;
public class setmatrixbruteforce {
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
        int n1=arr.length;
        int m1=arr[0].length;
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                if(arr[i][j]==0){
                    for(int k=0;k<n1;k++){
                        if(arr[i][k]!=0){
                            arr[i][k]=-1;
                        }
                    }
                    for(int k=0;k<m1;k++){
                        if(arr[k][j]!=0){
                            arr[k][j]=-1;
                        }
                    }
                }
            }
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }
        for(int[] interval : arr){
            System.out.println("[" + interval[0] + ", " + interval[1] + "," + interval[2]+ "]");
        }
    }
}
