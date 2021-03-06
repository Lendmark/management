package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Create by Lendemark on 14.04.2019.
 */
public class FileUtils {

    public static void createNewFile(String fileName) throws IOException{
        File file = new File(fileName);
        file.createNewFile();
    }

    public static void clearFile(String fileName) throws FileNotFoundException{
        PrintWriter printWriter = new PrintWriter(fileName);
        printWriter.close();
    }
}
