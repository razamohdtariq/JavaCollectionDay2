//Iterating ArrayList using Iterator

import java.util.*;
public class TestJavaCollection4 {
  
	 public static void main(String args[]){  
	  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
	  list.add("Mango");//Adding object in arraylist    
	  list.add("Apple");    
	  list.add("Banana");    
	  list.add("Grapes");    
	    
	  Iterator itr=list.iterator(); 
	  while(itr.hasNext()){
	   System.out.println(itr.next());  
	  }  
	 }  
	}  

