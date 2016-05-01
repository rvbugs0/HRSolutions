/*
  Detect cycle in the list
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int HasCycle(Node head) {
String s="";
if(head!=null)
{
	s=head.data+"";
head=head.next;    
}

boolean found=false;
    while(head!=null)
{

if(s.indexOf(head.data)!=-1)
{
    found=true;
	break;
}
s=s+head.data;
head=head.next;
}
if(found)
    {
    return 1;
}
return 0;    

}