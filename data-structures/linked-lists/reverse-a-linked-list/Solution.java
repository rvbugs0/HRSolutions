/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
        Node newHead=null;
        Node tempNode=null;
        Node preNode=null;
    while(head!=null)
        {
            tempNode=new Node();
            tempNode.data=head.data;
            tempNode.next=null;
            if(preNode!=null)
            {
                tempNode.next=preNode;
            }    
        preNode=tempNode;
            head=head.next;
    }
    newHead=tempNode;
    return newHead;
}
