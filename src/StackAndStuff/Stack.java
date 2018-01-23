
package StackAndStuff;

import java.util.ArrayList;

/**
 *
 * @author avila-good-m
 * Description : make a list type called a stack where elements can only be
 * be put on and taken of the stack.
 * 
 * Input: should have integers to fill the stack, and one for determining 
 * size of stack
 * 
 * Output: None unless user asks for top element. This is a class not a main
 */
public class Stack {
    private int length;
    private int top;
    ArrayList<Object> TheS;
    
// **************** constructor *******************
    public Stack(){
        top = 0;// set top element to 0
        TheS = new ArrayList<Object>();
    }// end initialized constructor
    
//****************** accessors ****************
    public Object peek(){// start peek
        return TheS.get(top);// return top element
    }// end peek at top element
    
    public void isEmpty(){
        System.out.println("Empty: " + TheS.isEmpty());
    }// end check if empty
//***************** Transformers *******************

    public void push(Object in){
        

        top++;// update top of stack
        TheS.set(top, in);// set top of stack
        
        
    }// end push an element on top
    
    public void pop(){
        System.out.println(TheS.indexOf(top) + "to be removed");
        TheS.remove(top);//delete top index
        
        top--; // lower the top of stack
        
    }// end pop an element off
    
}// end class
