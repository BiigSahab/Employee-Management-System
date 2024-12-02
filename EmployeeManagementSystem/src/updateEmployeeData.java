
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pc
 */
public class updateEmployeeData {
    public static void updateEmployeeData(String fileName, String updatedFileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            FileWriter writer = new FileWriter(updatedFileName);

            int count = 0;
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                if (count == 1 || count == 2) {
                    data = data.replace("Active", "Inactive");
                }
                writer.write(data + "\n");
                count++;
            }

            scanner.close();
            writer.close();
        } catch (IOException e) {
        }
    }
}
    

