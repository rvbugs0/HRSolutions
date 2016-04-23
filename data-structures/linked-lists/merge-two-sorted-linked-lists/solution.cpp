/*
  Merge two sorted lists A and B as one linked list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* MergeLists(Node *headA, Node* headB)
{
  // This is a "method-only" submission. 
  // You only need to complete this method

    Node* newHead=NULL;
   // newHead->next=NULL;
    if(headA!=NULL && headB!=NULL)
        {
    int a = headA->data;
    int b = headB->data;
    if(a<=b)
        {
        newHead=headA;
        headA=headA->next;
    }
    else
        {
        newHead=headB;
        headB=headB->next;
    }
        
    }
    else
        {
        if(headA==NULL)
            {
            newHead=headB;
            }
        else
            {
            newHead=headA;
        }
    }
    

    Node* tempNode=newHead;    
    while(headA!=NULL && headB!=NULL )
        {
        if(headA->data < headB->data && headA->data > tempNode->data)
            {
          tempNode->next=headA;       
            tempNode=tempNode->next;
            headA=headA->next;
        }
        else if(headA->data > headB->data && headB-> data > tempNode->data)
            {
          tempNode->next=headB;       
            tempNode=tempNode->next;
            headB=headB->next;
        }
        else
            {
            headA=headA->next;
            headB=headB->next;
        }
        
        
                
    }
    if(headA==NULL && headB!=NULL)
        {
        while(headB->data<=tempNode->data)
            {
            headB=headB->next;
        }
        tempNode->next=headB;
        
    }
    if(headB==NULL && headA!=NULL)
        {
         while(headA->data <= tempNode->data)
            {
            headA=headA->next;
        }
        tempNode->next=headA;
        
    }
    return newHead;
}

