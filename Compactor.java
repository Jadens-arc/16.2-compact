import java.util.*;
import java.io.*;

/*
*@ Author: Jaden Arceneaux
*@ Assignment: A16.2 Compact
*@ Date: 1/16/20
*@ Version: 1.0.0
*@ Feedback: 
*/

class Compactor
{
  /*
  Takes in the name of a file, reads the file, outputs a list with all the integers in the file w/out 0's

  Pre: none
  Param: String filename
  Post: none
  Return: Array 
  */
  public int[] compact(String filename)
  {
    // tries to open file if unsuccessfull throws error
    try
    {
      File numFile = new File(filename);
      Scanner lengthScanner = new Scanner(numFile);
      int fileLength = 0;
      
      
      while(lengthScanner.hasNext())
        {
          int next = lengthScanner.nextInt();
          if (next != 0)
          {
            fileLength ++;
          }// ends if statement
          
      }// ends while loop

      int fileItems[] = new int[fileLength];
      Scanner itemsScanner = new Scanner(numFile);

      try
      {
        int i = 0;
        while(itemsScanner.hasNext())
        {
          int next = itemsScanner.nextInt();
          if (next != 0)
          {
            fileItems[i] = next;
            i++;
          }// ends if statement
          
        }// ends while loop
        
      }// ends try statement
      catch(Exception e)
      {
        System.out.println("Non integer in file");
        return null;
      }// ends catch statement

      return fileItems;

    }// ends try statement
    catch(Exception e)
    {
      System.out.println("File Path Not Valid !!");
      return null;
    }// ends catch statement
    
  }// ends compact method
}// ends Compact