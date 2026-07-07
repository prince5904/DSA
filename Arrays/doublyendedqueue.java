import java.util.*;
public class doublyendedqueue {
    int arr[];
    int front;
    int rear;
    int size;
    public  void main() {
        pushfront(7);
        pushfront(8);
        poprear();
        pushrear(6);
        pushrear(4);

        int f=front();
        System.out.println(f);
        display();
    }
    public doublyendedqueue(){
        size=6;
        arr=new int[size];
        front=-1;
        rear=-1;
    }
    public void pushfront(int val){
        if(front==0 && rear==size-1 ||front==rear+1){
            return;
        }
        else if(front==-1){
            front=rear=0;
        }
        else if(front==0 && rear!=size-1){
            front=size-1;
        }
        else{
            front--;
        }
        arr[front]=val;
    }
    public void pushrear(int val){
        if(front==0 && rear==size-1 || front==rear+1){
            return;
        }
        else if(front==-1){
            front=rear=0;
        }
        else if(rear==size-1 && front!=0){
            rear=0;
        }
        else{
            rear++;
        }
        arr[rear]=val;
    }
    public int popfront(){
        if(front==-1){
            return -1;
        }
        int ans=arr[front];
        arr[front]=-1;
        if(front==rear){
            front=rear=-1;
        }
        else if(front==size-1){
            front=0;
        }
        else{
            front++;
        }
        return ans;
    }
    public int poprear() {
        if (front == -1) {
            return -1;
        }
        int ans = arr[rear];
        arr[rear] = -1;
        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear--;
        }
        return ans;
    }
    public int front(){
        if(front==-1){
            return -1;
        }
        return arr[front];
    }
    public int rear(){
        if(rear==-1){
            return -1;
        }
        return arr[rear];
    }
    boolean isEmpty(){
        if(front==-1){
            return true;
        }
        return false;
    }
    public void display() {
        if (front == -1) {
            System.out.println("Deque is empty");
            return;
        }

        int i = front;

        while (true) {
            System.out.print(arr[i] + " ");

            if (i == rear) {
                break;
            }

            i = (i + 1) % size;
        }

        System.out.println();
    }
    public void reverse()

}
