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

            if(numbers[0] == 0){
                break;
            }

            for (int i = 1; i < numbers.length ; i++) {
                if(i == 1){
                    totalTime += caculateTime(0, numbers[i]);
                }
                else {
                    totalTime += caculateTime(numbers[i - 1], numbers[i]);
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

    static int caculateTime(int beforeFloor, int behindFloor){
        int timeCost = 0;
        if(beforeFloor < behindFloor){
            timeCost = (behindFloor - beforeFloor) * 6 + 5;
        }
        else{
            timeCost = (beforeFloor - behindFloor) * 4 + 5;
        }
        return timeCost;
    }
}
