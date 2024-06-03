import java.text.DecimalFormat;
import java.util.*;
class Calculations {
    Scanner user = new Scanner(System.in);
    void  If_Integer_Add(){
        System.out.println(" -- Integer  Addition -- ");
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("How many numbers do you want to enter:");
        Scanner user = new Scanner(System.in);
        int size = user.nextInt();
        user.nextLine();
        System.out.println("Enter numbers:");
        for (int i = 1; i <= size; i++) {
            list.add(user.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("Sum: " + sum);
    }
    void If_Double_Add(){
        System.out.println(" -- Double  Addition -- ");
        double sum = 0;
        ArrayList<Double> list = new ArrayList<>();
        System.out.println("How many numbers do you want to enter:");
        int size = user.nextInt();
        user.nextLine();
        System.out.println("Enter numbers:");
        for (int i = 1; i <= size; i++) {
            list.add(user.nextDouble());
        }
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("Sum: " + sum);
    }

    void addition() {
        boolean condition = true;
        do {
            String type ="";
            System.out.println(" which type of Number you want to Enter ?  i/d ");
            Scanner user3 = new Scanner(System.in);
             type=user3.nextLine();
            switch (type){
                case "i":
                    this.If_Integer_Add();
                    break;
                case "d":
                    this.If_Double_Add();
                    break;
                default:
                    System.out.println(" invalid input ");
                }
            System.out.println("Do you want to continue (Y/N) ");
            Scanner user2 = new Scanner(System.in);
            String backTo=null;
            backTo = user2.nextLine();
            if (backTo.equalsIgnoreCase("no")) {
                condition = false;
            }
        }while(condition);
    }

    void  Subtraction(){

        boolean condition = true;
        while (condition) {
            System.out.println(" --  Subtraction -- ");
            ArrayList<Integer> list = new ArrayList<>();
            System.out.println("How many numbers do you want to enter:");
            int size = user.nextInt();
            user.nextLine();
            System.out.println("Enter numbers:");
            for (int i = 1; i <= size; i++) {
                list.add(user.nextInt());
            }
            int sub=list.get(0)*2;
            for (int i = 0; i < list.size(); i++) {
                sub -= list.get(i);
            }
            System.out.println(" Subtraction : " + sub);
            System.out.println("Do you want to continue (Y/N) ");
            String back = user.next();
            if (back.equalsIgnoreCase("no")) {
                condition = false;
            }
        }
    }
    void Multiplication(){

        boolean condition = true;
        while (condition) {
            System.out.println(" --  Multiplication  -- ");
            ArrayList<Integer> list = new ArrayList<>();
            System.out.println("How many numbers do you want to enter: 1,2,3...");
            int size = user.nextInt();
            user.nextLine();
            System.out.println("Enter numbers:");
            for (int i = 1; i <= size; i++) {
                list.add(user.nextInt());
            }
            int Mult=list.get(0);
            for (int i = 1; i < list.size(); i++) {
                Mult *= list.get(i);
            }
            System.out.println("Multiplication : " + Mult);
            System.out.println("Do you want to continue -( Yes/No )- ");
            String back = user.next();
            if (back.equalsIgnoreCase("no")) {
                condition = false;
            }
        }

    }
    void  Divide(){

        boolean condition = true;
        while (condition) {
            System.out.println(" -- Divide   -- ");
            ArrayList<Integer> list = new ArrayList<>();
            System.out.println("How many numbers do you want to enter: 1,2,3...");
            int size = user.nextInt();
            user.nextLine();
            System.out.println("Enter numbers:");
            for (int i = 1; i <= size; i++) {
                list.add(user.nextInt());
            }
            float div=list.get(0);
            for (int i = 1; i < list.size(); i++) {
                div /= list.get(i);
            }
            System.out.println("Sum: " +div);
            System.out.println("Do you want to continue -( Yes/No )- ");
            String back = user.next();
            if (back.equalsIgnoreCase("no")) {
                condition = false;
            }
        }

    }
    void Root(){
        boolean condition = true;
        while (condition) {
            System.out.println(" -- Root   -- ");
            ArrayList<Integer> list = new ArrayList<>();
            System.out.println("How many numbers do you want to enter: 1,2,3...");
            int size = user.nextInt();
            user.nextLine();
            System.out.println("Enter numbers:");
            for (int i = 1; i <= size; i++) {
                list.add(user.nextInt());
            }
            System.out.println(" actual input ");
            for (int i: list){
                System.out.println(i+" ");
            }
            System.out.println(" Root Output ");
            DecimalFormat Df=new DecimalFormat("#.#");
            for( int i : list){
                double square_root=Math.sqrt(i);
                System.out.println(Df.format(square_root)+" ");
            }
            System.out.println("Do you want to continue -( Yes/No )- ");
            String back = user.next();
            if (back.equalsIgnoreCase("no")) {
                condition = false;
            }
        }

    }
    void Square(){
        boolean condition = true;
        while (condition) {
            System.out.println(" -- Square   -- ");
            ArrayList<Integer> list = new ArrayList<>();
            System.out.println("How many numbers do you want to enter: 1,2,3...");
            int size = user.nextInt();
            user.nextLine();
            System.out.println("Enter numbers:");
            for (int i = 1; i <= size; i++) {
                list.add(user.nextInt());
            }
            System.out.println(" enter a power Number ^ ");
            Scanner user_power=new Scanner(System.in);
            int power_number=user_power.nextInt();
            System.out.println("actual input ");
            for (int i: list){
                System.out.print(i+" | ");
            }
            System.out.println();
            System.out.println("Output ");
            for( int i : list){
                double square=Math.pow(i,power_number);
                System.out.print(square+" | ");
            }
            System.out.println();
            System.out.println("Do you want to continue -( Yes/No )- ");
            String back = user.next();
            if (back.equalsIgnoreCase("no")) {
                condition = false;
            }
        }


    }
}
public class Calculator {
    public static void main(String[] args) {
        Calculations calculate = new Calculations();
        Scanner user = new Scanner(System.in);

        while (true) {
            System.out.println(" -- Calculator system -- ");
            System.out.println("1) Addition");
            System.out.println("2) Subtraction");
            System.out.println("3) Multiplication");
            System.out.println("4) Divide");
            System.out.println("5) Root");
            System.out.println("6) Square");
            System.out.println("7) Exit");
            System.out.println("Enter your choice:");
            int userResponse = user.nextInt();
            user.nextLine();

            switch (userResponse) {
                case 1:
                    calculate.addition();
                    break;
                case 2:
                    calculate.Subtraction();
                    break;
                case 3:
                    calculate.Multiplication();
                    break;
                case 4:
                    calculate.Divide();
                    break;
                case 5:
                    calculate.Root();
                    break;
                case 6:
                    calculate.Square();
                    break;
                case 7:
                    System.out.println("Exiting Calculator...");
                    user.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}