# Bag
lets user add and view weight added to a bag.

Step 1
Develop the following class:
Class
Name: Bag
Access Modifier: public
Instance variables
Name: name
Access modifier: private
Data Type: String
Name: currentWeight
Access modifier: private
Data Type: double
Name: maximumWeight
Access modifier: private
Data Type: double
Constructors
Name: Bag
Access modifier: public
Parameters: none (default constructor)
Task: sets the value of the instance variable name to the empty string
sets the value of the instance variable currentWeight to 0.0
sets the value of the instance variable maximumWeight to 5.0
Methods
Name: setName
Access modifier: public
Parameters: newName
Return Type: void
Task: sets the value of the instance variable name to newName
Name: getName
Access modifier: public
Parameters: none
Return Type: String
Task: returns the value of the instance variable name
Name: addItem
Access modifier: public
Parameters: newWeight
Return Type: void
Task: sets the value of the instance variable currentWeight equal to the value of currentWeight plus the
value of newWeight if the value of newWeight is greater than 0 and if the value of currentWeight plus
the value of newWeight is less than or equal to the value of the instance variable maximumWeight
Name: getCurrentWeight
Access modifier: public
Parameters: none
Return Type: double
Task: returns the value of the instance variable currentWeight
Name: setMaximumWeight
Access modifier: public
Parameters: newMaximumWeight
Return Type: void
Task: sets the value of the instance variable maximumWeight to value of the newMaximumWeight if
newMaximumWeight is greater than 0 and greater than or equal to the value of the instance variable
currentWeight
Name: getMaximumWeight
Access modifier: public
Parameters: none
Return Type: double
Task: returns the value of the instance variable maximumWeight
Step 2
Develop a class with only a main method in it:
import java.util.Scanner;
public class BagDemo {
public static void main(String[] args) {
//Create a Scanner object called keyboard that takes input from
//System.in
//Create an object of the Bag class refer to this object as myBag
//declare a variable called option of type int
//Open a do/while loop
//Prompt the user to pick one of the following options:
//Press 1 to change the name of the bag
//Press 2 to add an item to the bag
//Press 3 to change the maximum weight of the bag
//Press 4 to view all information about the bag
//Press 5 to end the program
//Save the user’s input into the option variable
//if the user picks option 1, prompt the user for the name of the bag
//then save the name of the bag in a variable called newName
//change the name of the bag to newName
//else if the user picks option 2, prompt the user for the weight
//of the item and then save the weight of the item in a variable
//called newWeight
//add the new item to the bag
//else if the user picks option 3, prompt the user for the new maximum
//weight of the bag and save the new maximum weight in a variable
//called newMaximumWeight
//change the maximum weight of the bag to newMaximumWeight
//else if the user picks option 4, display to the screen the name of
//the bag, the current weight of the bag, and the maximum weight
//of the bag
//else if the user picks option 5, display Goodbye.
//else if the user picks any other option, display Error!
//close the do/while loop and make it so that it continues to run as
//long as the user does not pick option 5
}
}
