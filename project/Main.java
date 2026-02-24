package project;

public class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];
        drinks[0] = new Coffee("001", "Bạc sỉu", 5000);
        drinks[1] = new FruitJuice("002", "Nước cam", 40000);
        drinks[2] = null;
        for (int i =0; i < drinks.length; i++){
            if(drinks[i] != null){
                displayInfo();
            }
        }

    }

    private static void displayInfo() {
        System.out.println();
    }
}
