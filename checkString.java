/*
Write a class with identifier 'Main'.  Within Main write a recursive function with identifier checkString that takes one string parameter and returns a string. 

checkString should replace adjacent chars that are the same with a single instance of that character. It should return the result to the original function call.

You will need to use the substring and charAt methods to complete this task.
*/

public class Main {
    

    public String checkString(String str) {
        
    if(str.length() <= 1) {
        return str;
    }
    
    if(str.charAt(0) == str.charAt(1))
    {
       return checkString(str.substring(1,str.length()));
    }
    else{
       
      return str.substring(0,1) + checkString(str.substring(1,str.length()));
      
    }
    }
}

