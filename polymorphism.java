/*Define a class with identifier 'Animal'.

The constructor should take only one parameter that should be taken as a private variable, observing the data encapsulation principle of OOP.

Define a class 'Mammal', a sub class of Animal. It should take a boolean on creation that indicates whether the mammal has fur, if the parameter if true then a private variable with identifier 'follicle' should store the value 'Fur', otherwise it should store 'Hair' . Your program should observe the data encapsulation principle of OOP.

Animals breathe, modify the animal class to allow for an initial oxygen level to be passed as a parameter to the constructor and to be saved in a private variable with identifier 'o2'. You need to write a procedure with identifier 'breathe' which allows for the behaviour of breathing to take place, it should increase the o2 content by 1 each time.

Mammals also breathe, however generally breathing using lungs is more efficient. Define the method 'breathe' within the Mammal class, the o2 content should increase by 2 for each call of this method.
*/

public class Animal 
{
    private String name ="";
    private int o2;
    public Animal(String name, int o2){
        this.name = name;
        this.o2 = o2;
    }
    
   	public String getName() 
    {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getO2() 
    {
		return o2;
	}
	
	public void setO2(int o2) 
	{
		this.o2 = o2;
	}
	
	public void breathe ()
	{
	    o2 = o2 + 1;
	}
	
}

public class Mammal extends Animal {
     private String follicle;
    public Mammal (String name, boolean fur, int o2) {
    super(name, o2);
    
   
    
    if (fur == true)
    {
        follicle = "Fur";
    }
    else
    {
        follicle = "Hair";
    }
    
    }
    
    public String getFollicle() 
    {
		return follicle;
	}
	
	public void setFollicle(String follicle) 
	{
		this.follicle = follicle;
	}
	public void breathe ()
	{
	    setO2(getO2() + 2);
	}
    
} 
