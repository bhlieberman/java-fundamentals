package Linter;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Linter {
    public static void main(String[] args) throws IOException {
        File filePath = new File("src/main/resources/gates.txt");
        var fs = new FileInputStream(filePath);
        linter(fs);
    }
    public static ArrayList<Integer> linter(InputStream data) {
        var scanner = new Scanner(data).useDelimiter("\n");
        int i = 1;
        ArrayList<Integer> linesMissing = new ArrayList<>();
        while (scanner.hasNext()) {
            var line = scanner.next().trim();
            if (line.length() == 0) continue;
            if (!(line.endsWith("{") || line.endsWith("}"))) {
                if (!line.endsWith(";"))
                    linesMissing.add(i);
                System.out.println("Line " + i + ": Missing semicolon.");
            }
            i++;
        }
        return linesMissing;
    }
}
