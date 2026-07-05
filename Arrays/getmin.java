import java.util.*;
public  class getmin {
    Stack<Integer>st;
    int min;


    public void main() {
        push(10);
        push(7);
        push(6);
        push(2);
        push(9);
        push(5);
        int m=Minimum();
        System.out.println(m);

    }
    public getmin(){

        st=new Stack<>();
    }
    public void push(int val){
        if(st.isEmpty()){
            st.push(val);
            min=val;
        }
        else if(val>=min){
            st.push(val);
        }
        else{
            st.push(2*val-min);
            min=val;
        }
    }
    public int pop(){
        if(st.isEmpty()){
            return -1;
        }
        int top=st.peek();
        if(top<min){
            min=2*min-top;
        }
        return min;
    }
    public int Minimum(){
        return min;
    }
}
