
//unfinished

public class stackimp {
	//globals will go here - do not change these.
	int[] stack = new int[5]; 
	int top = 0; //use the index 0 implementation
	
	//do not change anything in this constructor
	public stackimp(){
       System.out.println(pop());
       System.out.println(pop());
       push(1);
       push(2);
       push(3);
       push(4);
       push(5);
       push(6);
       System.out.println(pop());
       System.out.println(pop());
       push(6);
       System.out.println(pop());
       System.out.println(pop());
       System.out.println(pop());
       System.out.println(pop());
       System.out.println(pop());
       System.out.println(pop());
       System.out.println(pop());
       System.out.println(pop());
       push(1);
       push(2);
       push(3);
       push(4);
       push(5);
       push(6);
       System.out.println(pop());
       System.out.println(pop());
       
	}
	//do not change this method
    public static void main(String[] args){
        new stackimp();
    }
	

    //complete this method
	public void push(int item) 
	{
      stack[top] = item;
      top = top + 1;
	}
	
	 //complete this method
	public int pop() 
	{
      return stack[top];
      top = top - 1;
	}
	 //complete this method
	public boolean isEmpty() 
	{
	  if (top==0)
	  {
	      return true;
	  }
	  else {
	      return false;
	  }
	}
	
	 //complete this method
	public boolean isFull() 
	{
	  if (top == 5)
	  {
	      return true;
	  } 
	  else {
	      return false;
	  }
	}


}//end class
