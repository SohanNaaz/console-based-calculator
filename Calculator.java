import java.util.Scanner;

public class Calculator{

    public void runcalculator(){

        while (true) { 


            System.out.println("*************************************");
            System.out.println("-----------Begin--------------------------");

            
            Scanner scanner = new Scanner (System.in);

            System.out.println("Enter the first number"); 
            int x = scanner.nextInt(); 
    
            System.out.println("Enter the second number");
            int y = scanner.nextInt();
    
            System.out.println("Select the operation? \n(a-addtion s-subtraction m-multiplication d- division)");
            String operation = scanner.next();
    
            switch(operation) {
                case "a":
                    System.out.println(add(x,y));
                    break;
                case "s":
                    System.out.println(subtract(x, y));
                    break;
                case "m":
                    System.out.println(multiply(x, y));
                    break;
                case "d":
                    System.out.println(division(x, y));
                    break;
    
                default:
                    System.out.println("wrong input given:");
                    break;
            }
            System.out.println();
    


        } 
    }
    
    public int add(int x, int y){
        System.out.println("the addition value is:->");
        return x+y;
    }
      public int subtract(int x, int y){
        System.out.println("the subtracted value is : ->");
        return x-y;
      }
      public int multiply(int x,int y){
        System.out.println("the multiplied value is: ->");
        return x*y;
      } 
      public int division(int x,int y){
        System.out.println("the division value is: ->");
        return x/y;
      }
    } 

        
