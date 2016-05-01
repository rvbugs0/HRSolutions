/*
  Remove all duplicate elements from a sorted linked list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* RemoveDuplicates(Node *head)
{
  // This is a "method-only" submission. 
  // You only need to complete this method. 
Node *newHead=head;
Node *tempNode=head;    
    while(head!=NULL)
        {
        while(head!=NULL && tempNode->data==head->data)
            {
            head=head->next;
        }
        tempNode->next=head;
        tempNode=tempNode->next;
    }
    return newHead;
}
