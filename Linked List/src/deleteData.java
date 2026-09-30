public class deleteData{
    Node head=null;
    public void deleteAtLast(){
        Node temp=head;
        while(temp != null){
            if(temp.next.next==null){
                temp.next=null;
                return;
            }
            temp=temp.next;
        }
    }
}
