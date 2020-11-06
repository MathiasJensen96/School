import java.io.FileWriter;
import java.io.IOException;

public class Statistik {


    public static void addToFile() {

        try {
            FileWriter myWriter = new FileWriter("statistik.txt");
            for (int i = 0; i < Main.mariosSystem.step2.size(); i++) {
                myWriter.write(Main.mariosSystem.step2.get(i));
                myWriter.write("\n");
            }
            myWriter.close();
            System.out.println("Succsessfully wrote to file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
