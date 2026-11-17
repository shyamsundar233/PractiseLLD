package behavioral.stateMachine;

import java.util.Scanner;

public class ATMService {
    public static void main(String[] args) {
        ATMMachine machine = new ATMMachine();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Insert Card\n2. Enter Pin\n3. Enter Amount\n4. Collect Cash\n0. Exit");
            int step = sc.nextInt();
            switch (step) {
                case 1:
                    machine.insertCard();
                    break;
                case 2:
                    machine.enterPin();
                    break;
                case 3:
                    machine.enterAmount();
                    break;
                case 4:
                    machine.collectCash();
                    break;                
            }            
            if(step == 0){
                System.out.println("Exit...");
                break;
            }
        }
        sc.close();
    }
}
