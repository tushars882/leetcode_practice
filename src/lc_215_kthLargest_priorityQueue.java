import java.util.PriorityQueue;

public class lc_215_kthLargest_priorityQueue {
    static int inp(int[] nums , int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0 ; i  < nums.length ; i++){
            if(pq.size() < k){
                pq.add(nums[i]);
            }
            else{
                if( pq.peek() < nums[i]){
                    pq.poll();
                    pq.add(nums[i]);
                }
            }
        }
        return pq.poll();
    }
    public static void main(String args[]){
        int nums[] = {3,2,1,5,6,4};
        int k = 2 ;
        System.out.println(inp(nums , k));
    }
}
