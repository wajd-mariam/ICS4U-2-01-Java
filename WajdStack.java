/*
* Copyright (c) 2020
*
* The WajdStack Class creates a stack to use 
* by the stack.java program.
* 
* @author  Wajd Mariam
* @version 1.0
* @since   2020/12/07
*/

import java.util.ArrayList; // import the ArrayList class

public class WajdStack {
  
  // Creating and Array List:
  ArrayList<Integer> stackArray = new ArrayList<Integer>(); // Create an ArrayList object
  
  // and 1 method
  public void push(int addition) {
    stackArray.add(addition);
  } 

  //This method returns= the Integer  the has been added to the stack:
  public Integer addedNumber() {
    return this.stackArray.get(stackArray.size() - 1);
  }
}
