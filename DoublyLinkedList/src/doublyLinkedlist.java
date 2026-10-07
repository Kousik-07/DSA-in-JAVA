public class doublyLinkedlist {
    Node head=null;
    Node tail=null;
    public void insertAtBeginning(int item){
        Node newNode= new Node(item);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail=head;
            head=newNode;
            tail.prev=head;
            head.next=tail;
        }
    }

    public void insertAtLast(int item){
        Node newNode=new Node(item);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
//            tail=head;
            Node temp=tail;
            tail=newNode;
            tail.prev=temp;
            temp.next=tail;
        }
    }

    public void insertAtPosition(int position, int item){
        int index=1;
        Node newNode = new Node(item);
        Node temp = head;
        if(head == null){
            head=newNode;
            tail=newNode;
            return;
        }
        if(position==1){
//            temp= head;
            head=newNode;
            head.next=temp;
            return;
        }

        while (temp != null && index < position) {
            temp = temp.next;
            index++;
        }
        if (temp == null && index == position) {
            // Tail-er pore ba sheshe add korar moto
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        else if (temp != null) {
            // Majhkane insert korar shomoy
            newNode.next = temp;
            newNode.prev = temp.prev;
            temp.prev.next = newNode;
            temp.prev = newNode;
        }
        else {
            System.out.println("Position out of bounds!");
        }
    }

    public void printData(){
        if(head==null){
            System.out.println("LinkedList is empty!");
            return;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.next==null){
                System.out.println(temp.data);
            }else{
                System.out.print(temp.data + " => ");
            }
            temp=temp.next;
        }
    }

}
