import java.util.Scanner;

public class DequeExample {
    
    
    public Node head;
    public int size;
    public DequeExample(){
        this.size =0;
        this.head = null;
        

    }
    //push places the data at the beginning of the stack
    public void push(int data){
        if(head == null){
            head = new Node(data);
            size ++;
            return;
        }
        Node temporary = head;
        head = new Node(data);
        head.next = temporary;
        size ++;

    }
    //places the data at the end of the queue
    public void add(int data){

        if(head == null){
            head = new Node(data);
            size += 1;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;

        }

        current.next = new Node(data);
        size ++;
        //Node temporary = tail;
        //System.out.println(temporary.data);
        // tail = new Node(data);
        // tail.previous = temporary;
        // temporary.next = tail;
        // System.out.println(tail.data);
        // tail.next = new Node(data);
        
       

    }
    //removes the first element 
    public Node pop(){
        Node tempHead = head;
        head = head.next;
        size --;
        return tempHead;

        

    }
    //gets rid of the last value
    public Node remove(){

        Node current = head;
        
        
        for(int i =0; i<size-2;i++){
            current = current.next;

        }
       
        Node returnNode = current.next;
        current.next = null;
        return returnNode;
    }
    //have a previous Node to go bothways
    // 
    


    public void DisplayTheList(){
        //Some kinda system out statement System.out.println()
        Node currentNode =  head;
        while(currentNode != null){
            System.out.print(currentNode.data);
            
            currentNode = currentNode.next;

        }

    }
    
    public static void main(String[] args) {
        //Instantiating an object of the DequeExample class
        DequeExample deque = new DequeExample();
        //Calling the method InstertAtTheFront and passing a value
        // deque.push(7);
        // deque.push(8);

        // deque.push(9);
        // deque.add(1);
        
        // deque.DisplayTheList();
        // deque.pop();
        // System.out.println();
        // System.out.println();
        // deque.DisplayTheList();
        // System.out.println();
        // System.out.println();
        // deque.remove();
        // deque.DisplayTheList();
            Scanner myObj = new Scanner(System.in);
            Scanner myInt = new Scanner(System.in);
            System.out.println();
            System.out.println("Pick one of the options from below: \nA to add at the end, PU to push at the front, PO Pop to remove from front, R to remove from the end, Q to quit");
            String yesNo = myObj.nextLine();
        do{
            if(yesNo.equals("A")){
                System.out.println("What would you like to add?");
                int data = myInt.nextInt();
                deque.add(data);
                deque.DisplayTheList();
                System.out.println();
                System.out.println("Pick one of the options from below: \nA to add at the end, PU to push at the front, PO Pop to remove from front, R to remove from the end, Q to quit");
                yesNo = myObj.nextLine();
                }
             if(yesNo.equals("PU")){
                System.out.println("What would you like to push?");
                int data = myInt.nextInt();
                deque.push(data);
                deque.DisplayTheList();
                System.out.println();
                System.out.println("Pick one of the options from below: \nA to add at the end, PU to push at the front, PO Pop to remove from front, R to remove from the end, Q to quit");
                yesNo = myObj.nextLine();
                }
            if(yesNo.equals("PO")){
                    deque.pop();
                    deque.DisplayTheList();
                    System.out.println();
                    System.out.println("Pick one of the options from below: \nA to add at the end, PU to push at the front, PO Pop to remove from front, R to remove from the end, Q to quit");
                    yesNo = myObj.nextLine();
                    }
            if(yesNo.equals("R")){
                        deque.remove();
                        deque.DisplayTheList();
                        System.out.println();
                        System.out.println("Pick one of the options from below: \nA to add at the end, PU to push at the front, PO Pop to remove from front, R to remove from the end, Q to quit");
                        yesNo = myObj.nextLine();
                        }
            
    
    
        }while (!yesNo.equals("Q"));
        
    }

    
    
   


}
class Node{
    public int data;
    public Node next;
    public Node previous;
    public Node(int data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }



} 


