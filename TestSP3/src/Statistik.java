import java.io.*;
import java.sql.Array;
import java.sql.Timestamp;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Statistik {

    public static void addToFile() {

        try {
            FileWriter myWriter = new FileWriter("statistik.txt",true);
            for (int i = 0; i < Main.mariosSystem.step2.size(); i++) {
                myWriter.write(Main.mariosSystem.step2.get(i));
                myWriter.write("\n");
            }
            myWriter.close();
            System.out.println("Succsessfully wrote to file.");
            Main.mariosSystem.step2.clear();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void addToOrder() {

        Date dNow = new Date(System.currentTimeMillis()+ TimeUnit.MINUTES.toMillis(Order.time));

        try {
            FileWriter myWriter = new FileWriter("orderList.txt",true);
            for (int i = 0; i < Order.orders.size(); i++) {
                //myWriter.write(new Timestamp(new java.util.Date().getTime()).toString().split("\\.")[0]);
                myWriter.write(String.valueOf(dNow));
                myWriter.write("\t");
                myWriter.write("0000");
                myWriter.write(Integer.toString(Order.orderID));
                myWriter.write("\t");
                myWriter.write(Order.orders.get(i));
                myWriter.write("\n");
            }
            myWriter.close();
            System.out.println("Succsessfully wrote to file.");
            sortOrder();
            Order.orders.clear();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void readSortedOrderList() {

        try {
            File myObj = new File("sortedOrderList.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void sortOrder() {

        BufferedReader reader = null;
        BufferedWriter writer = null;

        ArrayList<String> orderSort = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader("orderList.txt"));
            String currentLine = reader.readLine();
            while (currentLine !=null) {
                orderSort.add(currentLine);
                currentLine = reader.readLine();
            }
            Collections.sort(orderSort);
            writer = new BufferedWriter(new FileWriter("sortedOrderList.txt"));
            for (String line: orderSort) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (reader !=null) {
                    reader.close();
                }
                if (writer !=null) {
                    writer.close();
                }
                orderSort.clear();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void readOrderList() {
        try {
            File myObj = new File("orderList.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
