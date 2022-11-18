package L04_StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class L06_SortLines {
    public static void main(String[] args) throws IOException {
        Path inPath = Paths.get("D:\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        Path outputPath = Paths.get("D:\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\06.SortLinesOutput.txt");

        List<String> lineInFile = Files.readAllLines(inPath);
        Collections.sort(lineInFile);
        Files.write(outputPath, lineInFile);
    }
}
