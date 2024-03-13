public class Queue {
    //array based queue:
  /*

   int[] arr;
   int capacity;
   int first;
   int last;
   static int currentSize;
   Queue(int capacity){
       this.capacity=capacity;
       arr=new int[capacity];
       first=0;
       last=-1;
       currentSize=0;
   }
    public static boolean isEmpty(){
      return currentSize==0;
    }
    boolean isFull(){
       return currentSize==capacity;
    }
    void enqueue(int element){
       if (isFull()){
           System.out.println("overflow...");
       }else{
           last++;
           arr[last]=element;
           currentSize++;
       }
   }
    void dequeue(){
       if (isEmpty()){
           System.out.println("underflow...");
       }else{
           first++;
           currentSize--;
       }
   }*/

    //node based queue:
    Node first;
    Node last;

  void enqueue(int data){
      Node newNode=new Node(data);
      if (this.first==null){
         this.first= newNode;
         this.last=newNode;
      }else{
          Node temp=this.first;
          while (temp.next!=null){
              temp=temp.next;
          }
          temp.next=newNode;
          this.last=newNode;
      }
  }
  void dequeue(){
     this.first=this.first.next;
  }
  int first(){
      return this.first();
  }
  int last(){
      return this.last();
  }
  int size(){
      int count=0;
      Node temp=this.first;
      if (temp==null)return count;
      else {
          while (temp!=null){
              count++;
              temp=temp.next;
           }
      }
      return count;
  }
  void print(){
      Node temp=this.first;
      if (temp==null){
          System.out.println("queue is empty");
      }else{
          while (temp!=null){
              System.out.println(temp.data);
              temp=temp.next;
          }
      }
  }
}
