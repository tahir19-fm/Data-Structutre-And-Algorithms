class LinkedList{

    static Node insertIst(Node head,int x){
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }
    static Node insertLast(Node head,int x){
        Node temp=new Node(x);
        if (head==null)
        return temp;
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }
    static Node deleteIst(Node head){
        if (head==null)
        return null;
        else
        return head.next;
    }
    static Node deleteLast(Node head){
        if (head==null || head.next==null){
            return null;
        }
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        return head;
    }

static Node insertAt(Node head,int pos,int data){
    Node temp=new Node(data);
    if(pos==1){
        temp.next=head;
        return temp;
    }
Node curr=head;
for (int i = 1; i <=pos-2; i++) {
    curr=curr.next;}
    if(curr==null){
        return head;
    }
    temp.next=curr.next;
    curr.next=temp;
    return head;
}
static Node deletePos(Node head,int pos){

    Node curr=head;
for (int i = 1; i <=pos-2; i++) {
    curr=curr.next;}


    if(curr==null){
        return head;
    }
    curr.next=curr.next.next;
    return head;
}

static int searchList(Node head,int x){
    int pos=1;
    Node curr=head;
    while(curr!=null){
        if(curr.data==x){
            return pos;
        }else{
            pos++;
            curr=curr.next;
        }
    }
    return -1;
}


//Reverse the Linkedlist
static Node reverse(Node head){
    Node curr=head;
    Node prev=null;
    Node next=null;
    while(curr!=null){
         next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
    return head;
}






    static void printData(Node head){
        Node data=head;
        while(data!=null){
            System.out.print(data.data+"->");
           data= data.next;
        }
        System.out.print("null");
    }


    public static void main(String[] args) {
      
        
        Node data=new Node(10);
        data.next=new Node(20);
        data.next.next=new Node(30);
        data=insertIst(data, 5);
      //  data=insertLast(data, 40);
       // data=deleteLast(data);
      //  data=insertAt(data, 2, 3);
        printData(data); 
        System.out.println("\npos is "+searchList(data, 3));
        // data=reverse(data);
        
        // printData(data); 
System.out.println();
        data=deletePos(data, 2);                 

        printData(data);




    }
}

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
