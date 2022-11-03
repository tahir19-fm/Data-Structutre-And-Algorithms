public class doubleLL {

static Node insertEnd(Node head,int data){
    Node temp=new Node(data);
    if(head==null){
        return temp;
    }
    Node curr=head;
    while(curr.next!=null){
        curr=curr.next;
    }
    curr.next=temp;
    temp.prev=curr;
    return head;
}
static Node insetBegin(Node head,int data){
    Node temp=new Node(data);
    temp.next=head;
    if(head!=null){
        head.prev=null;
    }
    return temp;
}
static Node delBegin(Node head){
    if(head==null){
        return null;
    }
    head=head.next;
    head.prev=null;
    return head;
}

static Node delPos(Node head,int pos){
    if(head==null){
        return null;
    }
    if(pos==1){
        return delBegin(head);
    }
    Node curr=head;
    for(int i=2;i<pos;i++){
        curr=curr.next;
    }
    Node temp=curr.prev;
    curr.next=curr.next.next;
    curr.prev=temp;
   
    return head;
}

static Node reverseDLL(Node head){
    if(head==null || head.next==null) return head;
    Node prev=null;
    Node curr=head;
    while(curr!=null){
        prev=curr.prev;
        curr.prev=curr.next;
        curr.next=prev;
        curr=curr.prev;

    }
    return prev.prev;
}

public static void printlist(Node head){
    Node curr=head;
    while(curr!=null){
    System.out.print(curr.data+" ->");
    curr=curr.next;
}System.out.println();
}
    


    public static void main(String[] args) {
        Node head=null;
        head=insertEnd(head, 10);
        head=insertEnd(head, 20);
        head=insertEnd(head, 30);
        head=insertEnd(head, 40);
        head=insertEnd(head, 50);
        head=reverseDLL(head);
        printlist(head);
        head=delPos(head,2);
        printlist(head);



    }
}

class Node{
    int data;
    Node next;
    Node prev;
    Node(int x){
        data=x;
        prev=null;
        next=null;
    }
}
