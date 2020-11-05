import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    List<String> temps = new ArrayList<>();

    public Menu() throws FileNotFoundException {

        String token1 = "";

        Scanner menu = new Scanner(new File("Menu.txt"));


        while (menu.hasNextLine()) {
            token1 = menu.nextLine();
            temps.add(token1);
        }
        menu.close();

        String[] tempsArray = temps.toArray(new String[0]);

        for (String s: tempsArray) {
            System.out.println(s);

        }

    }



    @Override
    public String toString() {
        return "Mario's Pizza Menukort:" + "\n" + temps.get(1) +
                "\n" + temps.get(2) +
                "\n" + temps.get(3) +
                "\n" + temps.get(4) +
                "\n" + temps.get(5) +
                "\n" + temps.get(6) +
                "\n" + temps.get(7) +
                "\n" + temps.get(8) +
                "\n" + temps.get(9) +
                "\n" + temps.get(10) +
                "\n" + temps.get(11) +
                "\n" + temps.get(12) +
                "\n" + temps.get(13) +
                "\n" + temps.get(14);
    }
}




    /*
    public static void showMenuKort(){
        try {
            File menuKort = new File("Menu.txt");
            Scanner myScanner = new Scanner(menuKort);

            while (myScanner.hasNextLine()) {
                String data = myScanner.nextLine();
                System.out.println(data);
            }
            myScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }*/

