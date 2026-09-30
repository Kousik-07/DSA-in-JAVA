public class insertData{
    Node head=null;
    public void insertAtBeginning(int item){
        Node newNode=new Node(item);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void insertAtlast(int item){
        Node newNode=new Node(item);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next != null ){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public void insertAtPosition(int item,int position){
        Node newNode=new Node(item);
        int index=1;
        Node temp=head;
        position=position-1;
        if(position<0){
            System.out.println("Invalid Position");
        }
        if(position==0){
            newNode.next=head;
            head=newNode;
        }
        while(temp != null){
            if(position==index){
                newNode.next=temp.next;
                temp.next=newNode;
                return;
            }
            index++;
            temp=temp.next;
        }
    }

    public void deleteAtLast(){
        if(head== null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp != null){
            if(temp.next.next==null){
                temp.next=null;
                return;
            }
            temp=temp.next;
        }
    }

    public void deleteAtFirst(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head.next;
        head=null;
        head =temp;
    }

    public void deleteAtPosition(int position){

        if (position == 1) {
            head=head.next;
            return;
        }
        Node temp=head;
        int index=1;
        while(temp!=null){
            if((position-1)==index){
                temp.next=temp.next.next;
                return;
            }
            index++;
            temp=temp.next;
        }
    }



    public void printData(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.next==null){
                System.out.print(temp.data);
            }
            else{
                System.out.print(temp.data + " => ");
            }
            temp=temp.next;
        }
    }
}
