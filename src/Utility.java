
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utility {
    public Utility() {
    }

    public static List<String[]> readFromCSV(String path) throws FileNotFoundException {
        List<String[]> list = new ArrayList();
        Scanner scanner = new Scanner(new File(path));

        while(scanner.hasNextLine()) {
            String[] eachrow = scanner.nextLine().split(",");
            list.add(eachrow);
        }

        return list;
    }
}