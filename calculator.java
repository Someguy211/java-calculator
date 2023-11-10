import java.util.Scanner;
public class calculator{
 public static void main(String[] args) {
   //Creates scanner to ask user for the number and action they want to perform
   Scanner ask = new Scanner(System.in);
    System.out.println("********************");
    System.out.println("        MENU");
    System.out.println("********************");
   
    while (true) {
    
        //Prints the initial menu
       printFirstMenu();

       //Asks user which operation to perform
       int choice = ask.nextInt();
       if (choice == 0) {
        reset();
        return; 
       }
    
       //If user selects integer not 1-6 the calculator restarts
       if (choice < 1 || choice > 6) {
                   System.out.println("Please enter an integer between 1 and 6");


       } else if (choice < 1 || choice > 6) {
           System.out.println("Please enter an integer between 1 and 6");
          
       //If user selects stat function, second menu displaying stat function is printed.    
       } else if (choice == 5) {
           printSecondMenu();
           int choiceTwo = ask.nextInt();
           // Zero rests the calculator
           if (choiceTwo == 0) {
            reset();
            return;
        }
            /*If user selects integer not 1-6 the calculator restarts
             * and will continue to prompt the user to select a number within range
             */
               while (choiceTwo < 1 || choiceTwo > 5) {
                   System.out.println("Please enter an integer between 1 and 5");
                   choiceTwo = ask.nextInt(); 
               }

               //Mean operation
            if(choiceTwo == 1){
            Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers will be in the data set?");
        int numberOfDoubles = scanner.nextInt();
    
        double[] array = new double[numberOfDoubles];
    
        for (int i = 0; i < numberOfDoubles; i++) {
        System.out.print("Enter number #" + (i + 1) + ": ");
        array[i] = scanner.nextDouble(); 
        }
        double sum = 0.0;
        for (int i = 0; i < numberOfDoubles; i++) {
        sum += array[i];
        }
        double mean = sum / numberOfDoubles;
        System.out.println("Mean: " + mean);

    //Median operation
    } else if (choiceTwo == 2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers will be in the data set?");
        int numberOfDoubles = scanner.nextInt();
        if(numberOfDoubles == 0){
            System.out.println("You cannot find median of zero numbers.");
            reset();
        }
        double[] array = new double[numberOfDoubles];
        
        for (int i = 0; i < numberOfDoubles; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            array[i] = scanner.nextDouble(); 
        }
        
        if (array.length % 2 != 0) {
            double median = array[array.length / 2]; 
            System.out.println("Median: " + median);
        } else {
            double median = (array[array.length / 2 - 1] + array[array.length / 2]) / 2.0; 
            System.out.println("Median: " + median);
        }

    //Standard Deviation operation
    } else if (choiceTwo == 3) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers will be in the data set?");
        int numberOfDoubles = scanner.nextInt();
    if(numberOfDoubles == 0){
            System.out.println("You cannot find the stan dev of zero numbers.");
            reset();
        }
        double[] array = new double[numberOfDoubles];
    
        for (int i = 0; i < numberOfDoubles; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < numberOfDoubles; i++) {
            sum += array[i];
        }
        double mean = sum / numberOfDoubles;
    
        double squaredDifferencesSum = 0.0;
        for (int i = 0; i < numberOfDoubles; i++) {
            squaredDifferencesSum += Math.pow(array[i] - mean,2);
        }
    
        double variance = squaredDifferencesSum / numberOfDoubles;
        double standardDeviation = Math.sqrt(variance);
    
        System.out.println("Standard Deviation: " + standardDeviation);

    //Variance operation
    } else if (choiceTwo == 4) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers will be in the data set?");
        int numberOfDoubles = scanner.nextInt();
     if(numberOfDoubles == 0){
            System.out.println("You cannot find the variance of zero numbers.");
            reset();
        }
        double[] array = new double[numberOfDoubles];
    
        for (int i = 0; i < numberOfDoubles; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }
    
        double sum = 0.0;
        for (int i = 0; i < numberOfDoubles; i++) {
            sum += array[i];
        }
        double mean = sum / numberOfDoubles;
    
        double squaredDifferencesSum = 0.0;
        for (int i = 0; i < numberOfDoubles; i++) {
            squaredDifferencesSum += Math.pow(array[i] - mean, 2);
        }

        double variance = squaredDifferencesSum / (numberOfDoubles - 1); 
        System.out.println("Variance: " + variance);
    }

        //Addition operation
       } else if (choice == 1) {
           Scanner scanner = new Scanner(System.in);
           System.out.print("How many numbers do you want to add? ");
           int numberOfDoubles = scanner.nextInt();
            if(numberOfDoubles == 0){
            reset();
        }
           double sum = 0.0;
           for (int i = 1; i <= numberOfDoubles; i++) {
               System.out.print("Enter number #" + i + ": ");
               double inputDouble = scanner.nextDouble();
               sum += inputDouble;
           }
           System.out.println("Result: " + sum);

        //Subtraction operation
        } else if (choice == 2) {
            Scanner askTwo = new Scanner(System.in);
            System.out.print("How many numbers do you want to subtract? ");
            int numberOfDoubles = askTwo.nextInt();
            double amount = 0.0;
            boolean firstInput = true; 
        
            for (int i = 1; i <= numberOfDoubles; i++) {
                System.out.print("Enter number #" + i + ": ");
                double inputDouble = askTwo.nextDouble();
                if (firstInput) {
                    amount = inputDouble; 
                    firstInput = false; 
                } else {
                    amount -= inputDouble; 
                }
            }
            System.out.println("Result: " + amount); 

        //Multiplication operation
        }else if(choice == 3){
     Scanner askThree = new Scanner(System.in);
            System.out.print("How many numbers do you want to multiply? ");
            int numberOfDoubles = askThree.nextInt();
             if(numberOfDoubles == 0){
             reset();
        }
            double product = 1.0;
            for (int i = 1; i <= numberOfDoubles; i++) {
               System.out.print("Enter number #" + i + ": ");
               double inputDouble = askThree.nextDouble();
               product *= inputDouble;
           }
           System.out.println("Result: " + product);

        //Division operation
        }else if(choice == 4){
    Scanner askFour = new Scanner(System.in);
            System.out.print("How many numbers do you want to divide? ");
            int numberOfDoubles = askFour.nextInt();
            double answer = 0.0;
            boolean inputFirst = true;
            for (int i = 1; i <= numberOfDoubles; i++) {
                System.out.print("Enter number #" + i + ": ");
                double inputDouble = askFour.nextDouble();
        
                if (inputFirst) {
                    answer = inputDouble; 
                    inputFirst = false; 
                } else {
                    if (inputDouble != 0) {
                        answer /= inputDouble; 
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        return;
                    }
                }
            }
            System.out.println("Result: " + answer);

        //If user selects 6 on first menu, menu with scientific functions is presented.
        } else if (choice == 6) {
            printThirdMenu();
            int choiceThree = ask.nextInt();
            if (choiceThree == 0) {
                reset();
                return;
            }
            while (choiceThree < 1 || choiceThree > 4) {
                System.out.println("Please enter an integer between 1 and 4");
                choiceThree = ask.nextInt();
            }

            //Sqaure root operation
            if(choiceThree == 1){
                Scanner askThree = new Scanner(System.in);
                System.out.println("Enter number to square root: ");
                double input = askThree.nextDouble();
                double answer = Math.sqrt(input);
                System.out.println("Answer: " + answer);
                
             //Exponent operation
            }else if(choiceThree == 2){
                Scanner askThree = new Scanner(System.in);
                System.out.println("Enter base: ");
                double base = askThree.nextDouble();
                System.out.println("Enter power: ");
                double power = askThree.nextDouble();
                double answer = Math.pow(base, power);
                System.out.println("Answer: " + answer);

            //If user selects option 3 after selecting scientific functions, the 3 trig functions are presented.
            }else if(choiceThree == 3){
                printFourthMenu();
                 Scanner askThree = new Scanner(System.in);
                 System.out.println("Choose a trigonometric function: ");
                 int choiceFour = askThree.nextInt();
                 if(choiceFour == 1){
                    System.out.println("Enter angle: ");
                    double askSine = askThree.nextDouble();
                    double askSineRadians = Math.toRadians(askSine);
                    double answerSine = Math.sin(askSineRadians);
                    System.out.println("Sin of " + askSine + " = " + answerSine);

                //Cosine Operation
            } else if (choiceFour == 2) {
                System.out.println("Enter degree: ");
                double askCosine = askThree.nextDouble();
                double askCosineRadians = Math.toRadians(askCosine); 
                double answerCosine = Math.cos(askCosineRadians);
                System.out.println("Cosine of " + askCosine + " degrees = " + answerCosine);
            
                    //Tangent Operation
                 } else if(choiceFour == 3){
                    System.out.println("Enter degree: ");
                    double askTangent = askThree.nextDouble();
                    double askTangentRadians = Math.toRadians(askTangent);
                    double answerTangent = Math.tan(askTangentRadians);
                    System.out.println("Tangent of " + askTangent + " = " + answerTangent);

                
            }

            //Logarithm Operation
             }else if(choiceThree == 4){
                Scanner logScanner = new Scanner(System.in);
                System.out.print("Enter the number for logarithm: ");
                double number = logScanner.nextDouble();
                System.out.print("Enter the base for the logarithm: ");
                double base = logScanner.nextDouble();
                if(number ==0){
                    System.out.println("Undefined.");
                    reset();
                }
                double result = Math.log(number) / Math.log(base);
                System.out.println("Logarithm (base " + base + "): " + result);

         //This is how user resets their calculator.       
        }else if(choice == 0){
            reset();
            return;
        }
}
    }
}
 
 

//Reset function that resets the calculator the first menu if an input is 000.
public static void reset(){
    main(null);
}

//Prints the first menu that the user sees.
 public static void printFirstMenu() {
System.out.println("Enter the number for the action you want to perform: ");
   System.out.println("");
   System.out.println("1: Addition (+) ");
   System.out.println("2: Subtraction (-) ");
   System.out.println("3: Multiplication (*) ");
   System.out.println("4: Division (/) ");
   System.out.println("5: Statistical Functions ");
   System.out.println("6: Scientific Functions ");  
}
//Prints the second menu that displays the statistical functions if the user enters 5 for the second input.
 public static void printSecondMenu() {
    System.out.println("");
    System.out.println("");
    System.out.println("********************");
    System.out.println("Statistical Functions");
    System.out.println("********************");
    System.out.println("1: Mean");
    System.out.println("2: Median");
    System.out.println("3: Standard Deviation");
    System.out.println("4: Variance"); 
}
//Prints the third menu that displays the scientific functions if the user enters 6 for the second input.
public static void printThirdMenu(){
    System.out.println("");
    System.out.println("");
    System.out.println("********************");
    System.out.println("Scientific Functions");
    System.out.println("********************");
    System.out.println("1: Square Root");
    System.out.println("2: Exponentiation");
    System.out.println("3: Trigonometric Functions");
    System.out.println("4: Logarithm"); 
}
//Prints the fourth menu that displays the scientific functions if the user enters 3 to go to trig functions
public static void printFourthMenu(){
    System.out.println("");
    System.out.println("");
    System.out.println("********************");
    System.out.println("Trigonometric Functions");
    System.out.println("********************");
    System.out.println("1: Sine");
    System.out.println("2: Cosine");
    System.out.println("3: Tangent");
}
}
