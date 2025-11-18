package InputUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetInput {

    public static Scanner getInputAsScanner(String filePath) {
        try  {
            File file = new File(filePath);
            return new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("file not found");
        }

        return null;
    }
}
