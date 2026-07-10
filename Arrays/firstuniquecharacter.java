import java.util.*;
public class firstuniquecharacter {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(frc(str));
    }
    public static int frc(String str){
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
