import java.util.*;
public class longestconsecutivesequence {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer>set=new HashSet<>();

        for(int num:arr){
            set.add(num);
        }
        int longest=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int current=num;
                int count=1;
                while(set.contains(current+1)){
                    current++;
                    count++;

                }
                longest=Math.max(longest,count);
            }
        }
        System.out.println(longest);

    }
}
