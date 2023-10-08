import java.util.*;

public class main {
    public static void main(String args[]){
      GenericStack<Integer> intStack=new GenericStack<Integer>();
      GenericStack<String> strStack=new GenericStack<String>();
      GenericStack<Float> floatStack=new GenericStack<Float>();

      //integer stack 
       System.out.println("Executing Integer stack ");
      intStack.push(1);
      intStack.push(2);
      intStack.push(3);
      intStack.pop();
      intStack.pop();
      System.out.println("INT STACK SIZE :"+intStack.size());
      if(intStack.isEmpty()==true)
      {
             System.out.println("INT STACK is empty "); 
      }
      else
      System.out.println("INT STACK is not empty "); 
      
      //string stack
       System.out.println("\n\nExecuting String stack ");
      strStack.push("1");
      strStack.push("2");
      strStack.push("3");
      strStack.pop();
      strStack.pop();
      System.out.println("String stack size : "+strStack.size());
      if(strStack.isEmpty()==true)
      {
        System.out.println("String stack is empty ");
      }
      else
       System.out.println("String stack is not empty ");

        
       //float stack 
       System.out.println("\n\nExecuting float stack ");
       floatStack.push((float) 1.2345665);
       floatStack.push((float)2.123345);
       floatStack.push((float)3.45667);
       floatStack.pop();
       floatStack.pop();
       System.out.println("Float Stack size : "+floatStack.size());
      if(floatStack.isEmpty()==true)
      {
        System.out.println("Float stack is empty ");
      }
      else
       System.out.println("Float stack is not empty ");

  


    }
}
