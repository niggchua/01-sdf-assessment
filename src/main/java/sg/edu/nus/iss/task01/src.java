package sg.edu.nus.iss.task01;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class src {

    public static void main( String[] args )
    {


    Scanner input = new Scanner(System.in);

    Double $last = 0.0;

    System.out.println("Welcome.");

        while(!input.equals("exit")) {

        String calculation = input.nextLine();

      //  System.out.println("you put in " + calculation);

      String[] elements = calculation.split(" ");

      //System.out.println(elements[0]);
      //System.out.println(elements[1]);
      //System.out.println(elements[2]);

        if(!elements[0].startsWith("$") && (!elements[2].startsWith("$"))){
      
      double firstNumber = Double.parseDouble(elements[0]);
      double secondNumber = Double.parseDouble(elements[2]);

      switch (elements[1]) {
        case "+":
            $last = firstNumber + secondNumber;
            System.out.println($last);
            break;

        case "-":
            $last = firstNumber - secondNumber;
            System.out.println($last);
            break;

        case "*":
            $last = firstNumber * secondNumber;
            System.out.println($last);
            break;

        case "/":
            $last = firstNumber / secondNumber;
            System.out.println($last);
            break;

        default:
            break;
      }

      } else if (elements[0].startsWith("$")){

        double secondNumber = Double.parseDouble(elements[2]);
        double firstNumber = $last;

        switch (elements[1]) {
        case "+":
            $last = firstNumber + secondNumber;
            System.out.println($last);
            break;

        case "-":
            $last = firstNumber - secondNumber;
            System.out.println($last);
            break;

        case "*":
            $last = firstNumber * secondNumber;
            System.out.println($last);
            break;

        case "/":
            $last = firstNumber / secondNumber;
            System.out.println($last);
            break;

        default:
            break;
      }
      
        } else if (elements[2].startsWith("$")){

        double firstNumber = Double.parseDouble(elements[0]);
        double secondNumber = $last;

        switch (elements[1]) {
        case "+":
            $last = firstNumber + secondNumber;
            System.out.println($last);
            break;

        case "-":
            $last = firstNumber - secondNumber;
            System.out.println($last);
            break;

        case "*":
            $last = firstNumber * secondNumber;
            System.out.println($last);
            break;

        case "/":
            $last = firstNumber / secondNumber;
            System.out.println($last);
            break;

        default:
            break;
      }

        } else  if(elements[0].startsWith("$") && (elements[2].startsWith("$"))){

            
             double firstNumber = $last;
             System.out.println(firstNumber);
             double secondNumber = firstNumber;
             System.out.println(secondNumber);
             double sum = 0.0;
             System.out.println(sum);
             
    
             switch (elements[1]) {
                case "+":
                    sum = firstNumber + secondNumber;
                    $last = sum;
                    System.out.println($last);
                    break;
        
                case "-":
                    sum = firstNumber - secondNumber;
                    $last = sum;
                    System.out.println($last);
                    break;
        
                case "*":
                    sum = firstNumber * secondNumber;
                    $last = sum;
                    System.out.println($last);
                    break;
        
                case "/":
                    sum = firstNumber / secondNumber;
                    $last = sum;
                    System.out.println($last);
                    break;
        
    
            default:
                break;
          }
        }
      




        
        






    }

}

  //  private static double parseDouble() {
    //    return 0;
    }

    
    
//}
