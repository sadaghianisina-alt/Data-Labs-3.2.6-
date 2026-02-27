public class Cereal {

    private String name;
    private int calories;
    private int protein;
    private int fat;
    private int sodium;
    private int sugar;


    public Cereal(String name, int calories, int protein, int fat, int sodium, int sugar) {
        this.name = name;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.sodium = sodium;
        this.sugar = sugar;
    }


    public String getName() { return name; }
    public int getCalories() { return calories; }
    public int getProtein() { return protein; }
    public int getFat() { return fat; }
    public int getSodium() { return sodium; }
    public int getSugar() { return sugar; }

    public String toString() {
        return name + " | Calories: " + calories +
               " | Protein: " + protein +
               " | Fat: " + fat +
               " | Sodium: " + sodium +
               " | Sugar: " + sugar;
    }

    public static void main(String[] args) {
        Cereal c1 = new Cereal("Cheerios", 100, 3, 2, 180, 1);
        Cereal c2 = new Cereal("Frosted Flakes", 110, 1, 0, 200, 11);

        System.out.println(c1);
        System.out.println(c2);
    }
}