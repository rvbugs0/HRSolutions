/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
int CompareLists(Node *headA, Node* headB)
{
  // This is a "method-only" submission. 
  // You only need to complete this method 
int similar=1;
    while(headA!=NULL && headB!=NULL)
    {
    if(headA->data!=headB->data)
        {
        similar=0;
        break;
    }
        headA=headA->next;
        headB=headB->next;
        
}
    if(similar==0)
        {
        cout<<"0";
    }else
        {
        if((headA==NULL && headB!=NULL) || (headA!=NULL && headB==NULL))
            {
            cout<<"0";
        }
        else
            {
            cout<<"1";
        }
    }
    
}
