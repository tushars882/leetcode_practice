import java.util.Scanner;

public class lc_622_cicrularQueue {
    static Scanner sc = new Scanner(System.in);
    int arr[];
    int rear  = -1;
    int front = -1 ;
    int res = 0;
    int k;

    public lc_622_cicrularQueue(int k){
        this.k = k;
        arr = new int[k];
    }

    public lc_622_cicrularQueue() {

    }

    void enqueue(int value){
        if((rear+1)%k == front){
            System.out.print("queue is full");
        }
        if(front == -1){
            front = 0;
            rear = 0;
        }
        rear = (rear+1)%k;
        arr[rear] = value;
    }
    void dequeue(){
        if(front == -1 && rear == -1){
            System.out.println("queue is empty");
        }
        int result = arr[front];
        if(front == rear){
            front = -1;
            rear = -1;
        }
        front = (front+1)%k;
    }
    public static void main(String args[]){
        int k = sc.nextInt();

    }
}
