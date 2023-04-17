public class Main {

  public Main() {
    // chain of letters in a linked list where each node represents one letter.
    Node n1 = new Node("a");
    Node n2 = new Node("b");
    Node n3 = new Node("c");
    Node n4 = new Node("d");

   //link the nodes up to make a linked list
    n1.pointer = n2;
    n2.pointer = n3;
    n3.pointer = n4;
    
    Node front = n1; 
    Node current = front;//set a head pointer to point to the first node
    printList(current); //call the method to output the list
  }// end constructor

  public void printList(Node front){
      if (front == null)
      {
          return;
      }
      
      System.out.println(front.getData());
      printList(front.pointer);
  }//end method
  

}
