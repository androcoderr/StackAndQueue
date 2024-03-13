public class Stack {
    Node top;
    //array based stack:
   /* int topOfStack;
    int capacity;
    int[] stack;
    Stack(int capacity){
        this.capacity=capacity;
        stack= new int[capacity];
        topOfStack=-1;
    }
    public void push(int element){
        if (capacity-1==topOfStack){
            System.out.println("overflow....");
        }else{
            topOfStack++;
            stack[topOfStack]=element;
        }
    }
    public int pop(){
        if (topOfStack<0){
            System.out.println("underflow......");
            return 0;
        }else{
            int temp=stack[topOfStack];
            topOfStack--;
            return temp;
        }
    }*/
    // node based stack:
   void push(int data){
       Node newNode=new Node(data);
       newNode.next=null;
       if (this.top==null){
           this.top=newNode;
       }
       else {
           newNode.next=this.top;
           this.top=newNode;
       }
   }
   void pop(){
       this.top=this.top.next;
   }
   boolean isEmpty(){
       return this.top==null;
   }
   int top(){
       return this.top();
   }
   int size(){
       int count=0;
       if (this.top==null) return count;
       else{
           Node temp=this.top;
           while (temp.next!=null){
               count++;
           }
       }
       return count+1;
   }
    void print(){
        Node temp=this.top;
        if (temp==null)return;
        else{
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
               temp=temp.next;
       }
   }

}
