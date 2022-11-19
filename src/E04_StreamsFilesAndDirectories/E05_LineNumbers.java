package E04_StreamsFilesAndDirectories;

import java.io.*;

public class E05_LineNumbers {
    public static void main(String[] args) throws IOException {
        String inPath = "D:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String outputPath = "D:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        BufferedReader reader = new BufferedReader(new FileReader(inPath));
        PrintWriter writer = new PrintWriter(new FileWriter(outputPath));

        String line;
        int count=1;
        while ((line = reader.readLine()) != null) {
            writer.println(count + ". " + line);
            count++;
        }
        writer.close();
    }
}
