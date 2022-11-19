package E04_StreamsFilesAndDirectories;

import java.io.*;

public class E03_AllCapitals {
    public static void main(String[] args) throws IOException {
        String inPath = "D:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outputPath = "D:\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        BufferedReader reader = new BufferedReader(new FileReader(inPath));
        PrintWriter writer = new PrintWriter(new FileWriter(outputPath));

        String line;
        while ((line = reader.readLine()) != null) {
            line = line.toUpperCase();
            writer.println(line);
        }
        writer.close();
    }
}
