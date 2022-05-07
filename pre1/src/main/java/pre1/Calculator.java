package pre1;
import java.util.*;

public class Calculator {

    public  void mainFunc() {
        int a,b,Output=0;
        char op;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Values of a and b");
        a=scan.nextInt();
        b=scan.nextInt();
        System.out.println("Enter the oparater ");
        op=scan.next().charAt(0);

        switch (op){
            case '+':Output=a+b;break;
            case '-':Output=a-b;break;
            case '*':Output=a*b;break;
            case '/':Output=a/b;break;

            default:
                System.out.println("Enter a valid oparater ");
        }
        System.out.println(Output);
        scan.close();
    }
}
