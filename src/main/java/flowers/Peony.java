package flowers;

import java.util.UUID;

public class Peony {
    public static Object peony() {
        String[] peony = {"Solange", "Pink Parfait", "Lorelei", "Angel Cheeks", "Lemon Chiffon"};
        for (String p : peony)
            System.out.println(p);
        return null;
    }

    public static void peonyAmount() {
        int[] amount = {15, 10, 7, 13, 20};
        for (int a : amount)
            System.out.println(a);
    }

    public static void peonyPrice() {
        float[] price = {15f, 10f, 25f, 16f, 28f};
        for (float pr : price)
            System.out.println(pr);
    }

    public UUID id;
    public String name;
    public String type;
    public String color;
}

