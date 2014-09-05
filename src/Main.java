import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List popularColorsName = new ArrayList();

        while (input.hasNext()) {
            int amountOfBallean = input.nextInt();
            input.nextLine();
            if (amountOfBallean == 0) {
                break;
            }

            Color colors[] = new Color[amountOfBallean];
            for (int i = 0; i < amountOfBallean; i++) {
                colors[i] = new Color();
                colors[i].name = input.nextLine();
            }
            Color.initColorAmount(colors);
            String thePopularColorName =  Color.getPopularColorName(colors);

            popularColorsName.add(thePopularColorName);
        }

        for (int i = 0; i < popularColorsName.size(); i++) {
            System.out.println(popularColorsName.get(i));
        }
    }



}

class Color {

    String name;
    int amonut;

    Color()
    {
        name = "";
        amonut = 0;
    }
    public static void initColorAmount(Color[] colors)
    {
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                if(colors[i].name.equals(colors[j].name))
                {
                    ++colors[i].amonut;
                }
            }
        }
    }
    public static String getPopularColorName(Color[] colors)
    {
        for (int i = 0; i < colors.length; i++) {
            if (colors[0].amonut < colors[i].amonut) {
                Color template;
                template = colors[0];
                colors[0] = colors[i];
                colors[i] = template;
            }
        }

        String popularColorName = colors[0].name;
        return popularColorName;
    }
}