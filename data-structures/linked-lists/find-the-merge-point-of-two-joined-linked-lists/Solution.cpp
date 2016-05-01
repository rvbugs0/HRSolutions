/*
   Find merge point of two linked lists
   Node is defined as
   struct Node
   {
       int data;
       Node* next;
   }
*/
int FindMergeNode(Node *headA, Node *headB)
{
    // Complete this function
    // Do not write the main method. 
    // Complete this function
// Do not write the main method. 
int c1=0,c2=0;

Node *p=headA,*q=headB;
while(p!=NULL){
    p=p->next;
    c1++;
}
while(q!=NULL){
    q=q->next;
    c2++;
}
if(c2>c1){
    p=headA;
    q=headB;
    for(int i=0;i<(c2-c1);i++){
        q=q->next;
    }
    while(p!=q){
        p=p->next;
        q=q->next;
    }
    return q->data;
}else{
    p=headA;
    q=headB;
    for(int i=0;i<(c1-c2);i++){
        p=p->next;
    }
    while(p!=q){
        p=p->next;
        q=q->next;
    }
    return p->data;
}
}
