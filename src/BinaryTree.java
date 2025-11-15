
import java.util.*;



class BinaryTree{
    private Node root;

    private class Node{
        Node left;
        Node right;
        int data;

        public Node(int data){
            this.data = data;
        }

    }

    //creting a tree
    public void createBinaryTree(){
        Node first = new Node(3);
        Node second = new Node(9);
        Node third = new Node(20);
        Node fourth = new Node(3);
        Node fifth = new Node(4);
        Node sixth = new Node(15);
        Node seventh = new Node(7);
        root = first;
        first.left = second;
        first.right = third;
//        second.left = fourth;
//        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
    }

    //Traversal of a Binary tree
    public void preOrder(Node root){
        //Base condition for recursion
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }


    //Inorder traversal of a binary tree -Recursion

//    public void inOrder(Node root){
//        if(root == null){
//            return;
//        }
//        inOrder(root.left);
//        System.out.print(root.data+" ");
//        inOrder(root.right);
//    }


    public void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data +" ");
    }

    //Height if a Binary tree

    public int  height(Node root){
        if(root == null){
            return 0;
        }
        return (Math.max(height(root.left) , height(root.right))+1);
    }

    //FIND IF   A TREE IS A COMPLETE BINARY TREE OR NOT

    public boolean check(Node root){
        boolean end = false;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            if(temp == null){
                end = true;
            }
            else{
                queue.offer(temp.left);
                queue.offer(temp.right);
                if(end == true){
                    return false;
                }
            }

        }
        return true;
    }

    //Quest- How does this return false works when we go recursively or here as well?


    //Finding maximum value in a tree

    public int findMax(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if(left > result){
            result = left;
        }
        if(right > result){
            result = right;
        }
        return result;
    }



    //Binary traversal using iteration---------------------
//    public void preOrder(){
//        if(root == null){
//            return;
//        }
//        Stack <Node> st = new Stack<>();
//        st.push(root);
//        while(!st.isEmpty()){
//            Node temp = st.pop();
//            System.out.print(temp.data+" ");
//            if(temp.right != null){
//                st.push(temp.right);
//            }
//            if(temp.left != null){
//                st.push(temp.left);
//            }
//        }
//    }



    public void inOrder(Node root){
        if(root == null){
            return;
        }
        Stack<Node> st = new Stack<>();
        Node temp = root;
        while(!st.isEmpty() || temp != null){
            if(temp != null){
                st.push(temp);
                temp = temp.left;
            }
            else{
                temp = st.pop();
                System.out.print(temp.data +" ");
                temp = temp.right;
            }
        }
    }




    //-----------Binary level order traversal------------------------------------

    public List<List<Integer>> levelOrder(Node root) {
        List <List<Integer>> Alist = new ArrayList<>();
        if(root == null){
            return Alist;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        // List<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()){
            int sz = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0 ; i < sz ; i++){
                Node temp = queue.poll();
                list.add(temp.data);
                if(temp.left != null){
                    queue.offer(temp.left);
                }
                if(temp.right != null){
                    queue.offer(temp.right);
                }
            }
            Alist.add(list);

        }
        return Alist;
    }
    int sum = 0;

   public int sumOfLeftLeaves(Node root){
       if(root == null){
           return 0;
       }
       if(root.left != null && root.left.left == null && root.left.right == null){

           sum=sum+ root.left.data;

       }
       sumOfLeftLeaves(root.left);
       sumOfLeftLeaves(root.right);
       return sum;
   }

   StringBuffer sb1 = new StringBuffer();
   public String findLeafNodes(Node root){
       if(root == null){
           return null;
       }
       if(root.left == null && root.right == null){
           sb1.append(root.data);
       }
       findLeafNodes(root.left);
       findLeafNodes(root.right);
       return sb1.toString();
   }



//   -----------------level order traversal 2--------------------------------
public ArrayList<ArrayList<Integer>> levelOrderBottom(Node root) {
       if(root == null){
           return null;
       }
       ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    ArrayList<ArrayList<Integer>> list3 = new ArrayList<>();
       Queue<Node> queue = new LinkedList<>();
       queue.offer(root);
       Stack<List> st = new Stack<>();
       while(!queue.isEmpty()){
           int sz = queue.size();
           ArrayList<Integer> list1 = new ArrayList<>();
           for(int i = 0 ; i < sz ; i++){
               Node temp = queue.poll();
               list1.add(temp.data);
               if(temp.left != null){
                   queue.offer(temp.left);
               }
               if(temp.right != null){
                   queue.offer(temp.right);
               }

           }
           list.add(list1);
       }
       for(ArrayList<Integer> ls : list ){
           st.push(ls);
       }
       while(!st.isEmpty()){
           list3.add((ArrayList<Integer>) st.pop());
       }
       return list3;

}

//--------------------binaryTree sum path----------------------
    int sm = 0;
    public boolean PathSum(Node root ,int targetSum){
        if(root == null)
            return false;
        Stack<Node> path = new Stack<>();
        Stack<Integer> sum = new Stack<>();
        path.push(root);
        sum.push(root.data);
        while(!path.isEmpty()){
            Node curr = path.pop();
            int curr_sum = sum.pop();
            if(curr.left == null && curr.right == null && curr_sum == targetSum){
                return true;
            }
            if(curr.left != null){
                path.push(curr.left);
                sum.push(curr.left.data + curr_sum);
            }
            if(curr.right != null){
                path.push(curr.right);
                sum.push(curr.right.data + curr_sum);
            }

        }
        return false;
    }







    public static void main(String args[]){
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
//        bt.preOrder(bt.root);
        System.out.println("");
//        bt.inOrder(bt.root);
        System.out.println();
//        bt.postOrder(bt.root);
//        System.out.println(bt.height(bt.root));

//        System.out.println(bt.sumOfLeftLeaves(bt.root));
//        System.out.println(bt.findMax(bt.root));
        System.out.println(bt.levelOrderBottom(bt.root));
//        System.out.println(bt.check(bt.root));
    }
}
