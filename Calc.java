
import java.util.*;


public class Calc {
  
   
   public static void main(String []args){
       Scanner s = new Scanner(System.in);
       SciCal sc = new SciCal();
 
       double x, y , q, sum;
       int loop = 0;
       int ans;
       char opt;
       String ch;
      
        
         try{
       System.out.println("What do you want to use? Calculator or Scientific Calculator?\npress 1 for Cal and 2 for SciCal");
       ans = s.nextInt();
      
      if(ans == 1){
         
          System.out.println("You`re using my Normal Calculator\nhere`s the choices");
          System.out.println("1. Addition");
          System.out.println("2. Subtraction");
          System.out.println("3. Multiplication");
          System.out.println("4. Division");
          ch = s.next();
          opt = ch.charAt(0);
          
          switch(opt){
              
              case '1':
                  System.out.print("Enter the 1st number:");
                  x = s.nextDouble();
                  System.out.print("Enter the 2nd number:");
                  y = s.nextDouble();
                  sum = x + y;
                  System.out.println("The answer is:" + sum);
                  break;
                  
              case '2':
                  System.out.print("Enter the 1st number:");
                  x = s.nextDouble();
                  System.out.print("Enter the 2nd number:");
                  y = s.nextDouble();
                  sum = x - y;
                  System.out.println("The answer is:" + sum);
                  break;
                  
                  case '3':
                  System.out.print("Enter the 1st number:");
                  x = s.nextDouble();
                  System.out.print("Enter the 2nd number:");
                  y = s.nextDouble();
                  sum = x * y;
                  System.out.println("The answer is:" + sum);
                  break;
                  
                  case '4':
                  System.out.print("Enter the 1st number:");
                  x = s.nextDouble();
                  System.out.print("Enter the 2nd number:");
                  y = s.nextDouble();
                  sum = x / y;
                  System.out.println("The answer is:" + sum);
                  break;
          }
          throw new InputMismatchException();
         }
        
      
      else if(ans == 2){
          
          System.out.println("You`re using my Scientific Calculator\nhere`s the choices");
          System.out.println("1. Exponent");
          System.out.println("2. Root");
          System.out.println("3. Factorial");
          System.out.println("4. Cube");
          System.out.println("5. Percentage");
          System.out.println("6. Plus with Minus");
          ch = s.next();
          opt = ch.charAt(0);
       
          switch(opt){
              case '1':
                  System.out.print("Enter the 1st number: ");
                  x = s.nextDouble();
                  System.out.print("Enter the 2nd number: ");
                  y = s.nextDouble();
                  sc.setExpo(x, y);
                  sum = sc.Display();
                  System.out.println("The answer is: " + sum);
                  break;
              
              case '2':
                  System.out.print("Enter the number for square rooting: ");
                  x = s.nextDouble();
                  sc.setRoot(x);
                  sum = sc.Display1() ;
                  System.out.println("The square root is: " + sum);
                  break;
                  
              case '3':
                  System.out.print("Enter the number for factoring: ");
                  x = s.nextDouble();  
                  sum = sc.getFact(x);   
                  System.out.println("The Factorial of " + x + " is: " + sum);   
                  break;
                  
              case '4':
                  System.out.print("Enter the number for getting its cube: ");
                  x = s.nextDouble();
                  sc.setCube(x);
                  sum = sc.Display3();
                  System.out.println("The answer is: " + sum);
                  break;
                  
              case '5':
                  System.out.print("Enter the 1st number for percentaging: ");
                  x = s.nextDouble();
                  System.out.print("Enter the 2nd number for percentaging: ");
                  y = s.nextDouble();
                  sc.setPerc(x, y);
                  sum = sc.Display4();
                  System.out.println("The answer is: " + sum);
                  break;
                  
              case '6':
                  System.out.print("Enter the 1st number: ");
                  x = s.nextDouble();
                  System.out.print("Enter the 2nd number: ");
                  y = s.nextDouble();
                  System.out.print("Enter the 3rd number: ");
                  q = s.nextDouble();
                  sum = sc.getPm(x, y, q);
                  System.out.println("The answer is: " + sum);
          }
          throw new InputMismatchException();
         }
        
         }
         catch(InputMismatchException ee){
           System.out.println("Oops.. that`s not the required input! Operation has stopped!");
       }
   }
}
        
        
        
      

   


