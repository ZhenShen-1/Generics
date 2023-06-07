

public class Main {
    public static void main(String[] args) {

        MagicBox<String> stringMagicBox = new MagicBox<String>(3);

        stringMagicBox.add("5267");
        stringMagicBox.add("Бу-");

        stringMagicBox.pick();

        stringMagicBox.add("Wins");

        String pick = stringMagicBox.pick();

        System.out.println(pick);


    }


}