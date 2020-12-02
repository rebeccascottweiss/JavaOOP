public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null; 
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    } 

    public void remove() {
        Node toRemove = head; 
        Node runner = null; 

        while (toRemove.next != null){
            runner = toRemove;
            toRemove = toRemove.next;  
        };

        runner.next = null; 
    };

    public void printValues() {
        Node runner = head; 

        while (runner.next != null){
            System.out.println(runner.value); 
            runner = runner.next; 
        }; 

        System.out.println(runner.value); 
    }; 

    public Node findInt(int num){
        Node runner = head; 

        while(runner.next != null){
            if(runner.value == num){
                return runner; 
            }

            runner = runner.next; 
        }; 

        if (runner.value == num) {
            return runner; 
        } ; 

        return null; 
    }  

    public void removeAt(int loc){
        Node runner = head; 
        Node previous = null; 

        if(loc == 0){
            this.head = runner.next; 
            runner.next = null; 
        } else {

            for (int i = 0; i < loc; i++){
                previous = runner; 
                runner = runner.next; 
            }; 

            previous.next = runner.next; 
        }

    } 


}