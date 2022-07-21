public class LinkedList

{

//defining a node in singly linked list

class Node 

{

    private int data;

    private Node next;

    public Node(int data) {
            this.data = data;

            this.next = null;
        }

}

    public Node front = null;  

    //defining a method to insert an element at the beginning of the list

   public void insertionatthebeginning(int data)

   {

        System.out.println("Adding a node at the beginning of the list with data " + data + "\n");

//creating a new node called newNode 

Node newNode = new Node(data);

//checking if the given list is empty 

if (this.front == null)

{

//if the list is empty, making the newNode as the front of the list

this.front = newNode;

} 

else 

{

//otherwise the next pointer of the newNode is made the front

newNode.next = this.front;

//and then making the newNode as the front of the list

this.front = newNode;

}

} 

 //defining a method to insert an element at the end of the list

public void insertionattheend(int data) 

{

        System.out.println("Adding a node at the end of the list with data " + data + "\n");

//creating a new node called newNode 

Node newNode = new Node(data);

//checking if the given list is empty 

if (this.front == null) 

{

//if the list is empty, making the newNode as the front of the list

this.front = newNode;

} 

else 

{

//otherwise create a new node called current and assign front of the list to the current node

Node current = this.front;

//and traverse till the end of the list

while (current.next != null)

{

//and assign each node to the current node till the last node is reached

current = current.next;

}

//assigning the next pointer of the last node to the newNode

current.next = newNode;

}

} 

//defining a method to insert an element at the specified position of the list

public void insertionatpos(int position, int data) 

{

System.out.println("Adding a node at the specified position " + position + " of the list with data " + data + "\n");

//creating a new node called newNode

Node newNode = new Node(data);

//creating two new nodes called current and previous and then assigning front of the list to these two nodes

Node current = this.front;

Node previous = this.front;       

         //checking if the element to be inserted at position 1

if (position == 1) 

{

//then the next pointer of the new node is made to point to the front

newNode.next = front;

//and the new node is made the front of the list

this.front = newNode;

return;

}

//otherwise the entire list is traversed until the specified position is found by assigning current to previous and next pointer of current to current

while (current.next != null && position > 0) 

{

previous = current;

current = current.next;

}

//then the new node is inserted at the next pointer of previous node

previous.next = newNode;

// and the next pointer of new node is made the current node

newNode.next = current;

}

    //defining a method to delete an element from the beginning of the list

    public void deletionfromthebeginning()

   {

         System.out.println("deleting a node from the beginning of the list: \n");

//checking if the given list is empty

if (this.front == null)

{

System.out.println("The given list is empty.\n");

} 

else 

{

//otherwise removing front and making the first node as the front of the list

front = front.next;

}

}

//defining a method to delete an element from the end of the list

public void deletionfromtheend()

{

         System.out.println("Deleting a node from the end of the list: \n");

//checking if the given list is empty

if (this.front == null)

{

System.out.println("The given list is empty.\n");

} 

else 

{

//otherwise creating a new node called current and assigning front to it to traverse through the list to reach the second last element of the list and then making its next pointer to point to null

Node current = this.front;

while (current.next.next != null)

{

current = current.next;

    }

    current.next = null;

    }

}

//defining a method to delete an element from the specified position of the list

public void deletionfrompos(int position) 

{

System.out.println("Deleting a node from the specified position " + position +  "\n");

         //checking if the given list is empty

    if (this.front == null)

{

System.out.println("The given list is empty.\n");

} 

//checking if the given position is 0 

else if(position == 0)

{

//removing the front of the list and making the first node of the list as the front of the list

front = front.next;

    }

    else

    {

//otherwise creating a new node called current and making it front of the list

      Node current = front;

        //then traversing through the list

        for(int i =0; current!=null && i < position -1; i++)

        {

          current = current.next;

          //checking if the element is not present at all in the list

          if(current == null || current.next == null)

            {

                System.out.println("The element is not present at the specified position.\n");

          }

//removing the node at the specified position of the list and assigning the next pointer of the current node to point to the next to next node

          Node temp = current.next.next;

            current.next = temp;

        }

  }

}

//defining displaylist() function to display the data in the list  

   public void displaylist() 

   {

       //checking if the front/list is empty

if (this.front == null)

{

System.out.println("The given list is empty.\n");

} 

else 

{

    //otherwise printing each element in the list

System.out.println("The elements of the Singly Linked List are : \n");

Node current = this.front;

while (current != null)

{

//printing each data in the list and next pointer pointing to the next node  

System.out.print(current.data + " -> ");

current = current.next;

}

System.out.println("NULL\n");

}

}  

   public static void main(String[] args)

   {

       //defining a new linked list

           LinkedList newlist = new LinkedList();

           //displaying the elements of the list before performing any operation on the list

System.out.println("The elements of the singly linked list before insertion operation     are: \n");

    newlist.displaylist();

//performing various operations on the list and then displaying the elements of the list

newlist.insertionatthebeginning(1);

    newlist.displaylist();

    System.out.println("\n");

newlist.insertionatthebeginning(2);

newlist.displaylist();

System.out.println("\n");

       newlist.insertionattheend(8);

    newlist.displaylist();

    System.out.println("\n");

newlist.insertionattheend(9);

newlist.displaylist();

System.out.println("\n");

         newlist.insertionatpos(2,3);

         newlist.displaylist();

         System.out.println("\n");

         newlist.insertionatpos(3,4);

         newlist.displaylist();

         System.out.println("\n");

         newlist.insertionatpos(4,5);

         newlist.displaylist();

         System.out.println("\n");

         newlist.deletionfromthebeginning();

         newlist.displaylist();

         System.out.println("\n");

         newlist.deletionfromtheend();

         newlist.displaylist();

         System.out.println("\n");

         newlist.deletionfrompos(3);

        newlist.displaylist();

         System.out.println("\n");

    }

}