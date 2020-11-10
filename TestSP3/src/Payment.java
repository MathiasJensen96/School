import java.io.FileNotFoundException;

public class Payment {

    public static void getTotalPrice() {

        int totalPrice = 0;

        for (int i = 0; i < Main.mariosSystem.step2.size(); i++) {
            String temp = Main.mariosSystem.step2.get(i);
            String newTemp = String.valueOf(temp);
            int temp1 = newTemp.lastIndexOf(",");
            String makeSubstring = Main.mariosSystem.step2.get(i).substring(temp1);
            makeSubstring = makeSubstring.replace(",", "");
            int newPrice = Integer.parseInt(makeSubstring);
            totalPrice = totalPrice + newPrice;
        }
        System.out.println(totalPrice);
    }
}
