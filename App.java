import java.util.Scanner;

class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\n|  Welcome to the GCD Finder  |");

        //implementing a while loop to loop the code
        while(true){
            System.out.println("\nWould you like to continue? y/n");
            String userCont = sc.nextLine().toLowerCase();

            if(!(userCont.equals("y") ||userCont.equals("n"))){
                System.out.println("Invalid choice entered.");
                continue;
            }
            if(userCont.equals("n")){
                System.out.println("Bye bye!");
                break;
            }

            //User Interface & variables to get User Input
            System.out.print("Enter first number: ");
            double num1 = Double.valueOf(sc.nextLine());

            if(num1<0){
                System.out.println("Please enter a positive integer!");
                continue;
            }

            System.out.print("Enter second number: ");
            double num2 = Double.valueOf(sc.nextLine());

            if(num2<0){
                System.out.println("Please enter a positive integer!");
                continue;
            }

            System.out.println("\nGCD of " + num1 + " and " + num2 + " is "+ gcdFinder(num1, num2));
            
        }
    }

   public static Double gcdFinder(double num1, double num2){
        double greaterInteger = Math.max(num1,num2);
        double smallerInteger = Math.min(num1,num2);

        while((greaterInteger%smallerInteger) > 0){
            double remainder = greaterInteger%smallerInteger;
            greaterInteger = smallerInteger;
            smallerInteger = remainder;
        }
        return smallerInteger;
   }
}
