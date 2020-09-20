import java.util.Scanner;
class App {
   public static void main (String[] args) {
   Scanner sc = new Scanner(System.in);
   Calculator calc = new Calculator(sc);
   calc.run();
 
   sc.close();
 }
}
 
class Calculator {
 private final String APP_TITLE =  "------------\n" +
                           "CALCULATRICE" +
                           "\n------------";
 public final String QUESTION = "\nVeux-tu effectuer une nouvelle operation ?[On] ";
 public final String END_MESSAGE = "la calculatrice a bien été fermée ! ;)";
final String ERREUR = " Utilise les espaces sinon je ne peux pas faire le calcul ! ";
 final String ERROR = " Navré mais je ne peux que faire des opérations à 2 entiers ... " ;
 


 private Scanner sc;
 private int nb1 = 0, nb2 = 0;
 private String operation = "";
 private String userResponse = "";
 
 
  Calculator(Scanner pScanner) {
   this.sc = pScanner;
 }

  
 public void run() {
   mainLoop: while (!userResponse.equals("n")) {
     System.out.println(APP_TITLE);
 
     
       System.out.print("ton operation: ");
       nb1 = sc.nextInt();
     
      
       operation = sc.next();
      
 
       nb2 = sc.nextInt();
	    
      
        if (operation.trim().equals(""))
                continue;
        else 
	          System.out.println(ERROR);
      
      
      
       int result = 0;
 
       switch (operation) {
         case "+":
           result = nb1 + nb2;
           break;
         case "-":
           result = nb1 - nb2;
           break;
         case "/":
           result = nb1 / nb2;
           break;
         case "*":
           result = nb1 * nb2;
           break;
         case "%":
           result = nb1 % nb2;
           break;
         default:
           System.out.println(ERROR);
           continue mainLoop;
       }
 
       System.out.println("Résultat de l'opération: " + result);
 
       System.out.println(QUESTION);
       userResponse = sc.nextLine();
     }
			
	
   
   System.out.println(END_MESSAGE);
   sc.close();
  }

}
