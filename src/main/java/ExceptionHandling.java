import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {

        System.out.println("Please enter a Number between 0 - 9: ");

        try(Scanner myscan = new Scanner(System.in)){
            int myNum = -1;
            while (myNum < 0 || myNum > 9) {
                String input = myscan.nextLine();
                try {
                    myNum = Integer.parseInt(input);
                    if (myNum >= 0 && myNum <= 9) {
                        System.out.println("The Number entered is: " + myNum);
                    } else {
                        System.out.println("Invalid Number! Please Retry");
                    }
                }catch(NumberFormatException e) {
                        System.out.println("Invalid Number! Please Retry" +e.getMessage());
                    }
                }
            }
        }


    }





   /* try {
        System.out.println("Please enter a Number: ");
        topNum = myscan.nextInt();
        System.out.println("Please enter a second number: ");
        baseNum= myscan.nextInt();
        total = topNum / baseNum;
        }

        catch(ArithmeticException ae){
            System.out.println("Please enter values greater than 0" +ae.getMessage());
        }

    finally{
        myscan.close();
    }

        System.out.println("The total is " + total);

    }
}*/
