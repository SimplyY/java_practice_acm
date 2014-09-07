import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List totalTimes = new ArrayList();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            int totalTime = 0;
            int[] numbers = dealLine(line);

            for (int i = 0; i < numbers.length; i++) {
                if(i == 0){
                    caculateIime(totalTime, 0, numbers[i + 1]);
                }
                else {
                    caculateIime(totalTime, numbers[i], numbers[i + 1]);
                }
            }

            totalTimes.add(totalTime);
        }
        for (int i = 0; i < totalTimes.size(); i++) {
            System.out.println(totalTimes.get(i));
        }
    }

    static int[] dealLine(String line){
        int length = Integer.parseInt(line.split(" ")[0]) + 1;
        int[] ABn = new int[length];
        for (int i = 0; i < length ; i++) {
            ABn[i] =Integer.parseInt(line.split(" ")[i]);
        }
        return ABn;
    }

    static void caculateIime(int totalTime, int beforeFloor, int behindFloor){
        if(beforeFloor < behindFloor){
            int timeCost = (behindFloor - beforeFloor) * 6 + 5;
            totalTime += timeCost;
        }
        else{
            int timeCost = (beforeFloor - behindFloor) * 4 + 5;
            totalTime += timeCost;
        }
    }
}
