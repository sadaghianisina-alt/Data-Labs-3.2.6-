import java.io.*;
import java.util.*;

class Cereal {
    String name;
    int protein;

    public Cereal(String n, int p) {
        name = n;
        protein = p;
    }
}

public class Activity4 {

    public static void main(String[] args) throws Exception {

        ArrayList<Cereal> list = new ArrayList<>();

        Scanner file = new Scanner(new File("cereal.csv"));

        while (file.hasNextLine()) {
            String line = file.nextLine();
            String[] parts = line.split(",");

            String name = parts[0];
            int protein = Integer.parseInt(parts[1]);

            list.add(new Cereal(name, protein));
        }

        Cereal best = list.get(0);

        for (Cereal c : list) {
            if (c.protein > best.protein) {
                best = c;
            }
        }

        System.out.println("Cereal with most protein: " + best.name);
    }
}