public class LinkedList {
    public class Node{
        int value;
        Node next;

        Node(int value){
            next=null;
            this.value=value;
        }
    }

    Node beginNode;

    public Node insertNode(Node current, int value){
        System.out.println("--------------------------------------");
        if (current==null) {
            current = new Node(value);
            // why i need this
            if (beginNode==null) beginNode = current;

            System.out.println("Adding new Node value = "+value);
        }else{
            current.next = insertNode(current.next , value);
            System.out.println("Current Node has value = "+current.value + ", Looking for next Node");
        }
        return current;
    }

    public void insertNode(int value){

        Node myNode = insertNode(beginNode,value);
    }


    public  static void main(String[] args){
        LinkedList l = new LinkedList();
        l.insertNode(1);
        l.insertNode(4);
        l.insertNode(13);
        l.insertNode(9);
        l.insertNode(8);
        System.out.println("---------------SEARCH-----------------------");
        System.out.println(l.beginNode.value);
        System.out.println(l.search(3));
        System.out.println(l.search(1));

    }

    public Node search(Node current, int value){


        if (current == null) return null;

        if (current.value != value) {
            System.out.println("Current Node value = " + current.value + " do not match " + value);
            return search(current.next, value);
        }
        return current;
    }

    public boolean search(int value){
        if (search (beginNode, value) == null) return false;
        else return true;
    }



}
