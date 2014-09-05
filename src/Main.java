import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            int amountOfBallean = input.nextInt();
            if (amountOfBallean == 0) {
                break;
            }

            String color[] = new String[amountOfBallean];
            for (int i = 0; i < amountOfBallean; i++) {
                color[i] = input.nextLine();
            }


        }
    }
}
