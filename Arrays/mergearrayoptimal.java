import java.util.Scanner;

public class mergearrayoptimal {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        int len=n+m;
        int gap=(len/2)+(len%2);
        while(gap>0){
            int left=0;
            int right=left+gap;
            while(right<len){
                if(left<n && right<m){
                    if(arr1[left]>arr1[right]){
                        int temp=arr1[left];
                        arr1[left]=arr1[right];
                        arr1[right]=temp;
                    }

                } else if (left>=n && right>=m) {
                    if(arr2[left-n]>arr2[right-m]){
                        int temp=arr2[left-n];
                        arr2[left-n]=arr2[right-m];
                        arr2[right-m]=temp;
                    }
                }
                else{
                    if(arr1[left]>arr2[right-m]){
                        int temp=arr1[left];
                        arr1[left]=arr2[right-m];
                        arr2[right-m]=temp;
                    }
                }
                left++;
                right++;
            }
            if(gap==1){
                break;
            }
            gap=(gap/2)+(gap%2);
        }
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<m;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
