/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
int GetNode(Node *head,int positionFromTail)
{
  // This is a "method-only" submission. 
  // You only need to complete this method. 
int x=0;
    Node *temp=head;
    while(temp!=NULL)
        {
        temp=temp->next;
        x++;
    
    }
    int m=0;
    temp=head;
    while(m<(x-positionFromTail-1))
        {
        temp=temp->next;
        m++;
    }
    return temp->data;
    
    
}
