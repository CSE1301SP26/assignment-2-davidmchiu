import java.util.Scanner;
public class Nim {
    public static void main(String[] args) {
        Scanner playerInput = new Scanner(System.in);
        System.out.print("How many sticks would you like to start with: ");
        int total = scanner.nextInt();

        int startingTotal = total;
        int totalSticks = total;
        int turn = 0;
        int round = 0;

        while(totalSticks>0) {
            if(turn%2==0) {
                startingTotal = totalSticks;
                System.out.print("How many sticks would you like to take away: ");
                int sticksRemoved = playerInput.nextInt();
                if(sticksRemoved<=2) {
                    totalSticks = startingTotal - sticksRemoved;
                    System.out.println("Round " + round + ": " + startingTotal + " at start, human takes " + sticksRemoved + ", so " + totalSticks + " remain");
                    if(totalSticks == 0) {
                        System.err.println("You win! The computer loses!");
                    }
                    else {
                        turn++;
                        round++;
                    }
                }
                else {
                    System.err.println("You can only take away 1 or 2 sticks! Try again");
                }
                
            }
            else {
                if(Math.random()<0.5 || totalSticks<2) {
                    startingTotal = totalSticks;
                    int computerSticksRemoved = 1;
                    totalSticks = startingTotal - computerSticksRemoved;
                    System.out.println("Round " + round + ": " + startingTotal + " at start, computer takes " + computerSticksRemoved + ", so " + totalSticks + " remain");
                    if(totalSticks == 0) {
                        System.err.println("The computer wins! You lose!");
                    }
                    else {
                        turn++;
                        round++;
                    }
                }
                else {
                    startingTotal = totalSticks;
                    int computerSticksRemoved = 2;
                    totalSticks = startingTotal - computerSticksRemoved;
                    System.out.println("Round " + round + ": " + startingTotal + " at start, computer takes " + computerSticksRemoved + ", so " + totalSticks + " remain");
                    if(totalSticks == 0) {
                        System.err.println("The computer wins! You lose!");
                    }
                    else {
                        turn++;
                        round++;
                    }
                }
            }
        }
        
    }
}