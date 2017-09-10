package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lukasz on 2017-08-05.
 */
public class Main {
    private static String readData(String path) {
        //uzyskujemy obiekt dostepu do pliku na podstawie sciezki do pliku
        Path filePath = Paths.get(path);

        byte[] data = null;
        ; //tutaj bedzie zawartosc pliku gdy uda sie z niego przeczytac
        try {
            data = Files.readAllBytes(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String content = new String(data);
        return content;
    }

    public static void saveToFile(List<String> lines, String path) throws IOException {

        Path filePath = Paths.get(path);

        BufferedWriter writter = Files.newBufferedWriter(filePath);
        for (String line : lines) {
            writter.write(line);
            writter.newLine();
        }
        writter.close();

//        mechanizm ktory pojawil sie w javie 7
//        ktory automatycznie zamknie strumien
        try {
            BufferedWriter writer = Files.newBufferedWriter(filePath);
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }

            }catch(Exception ex){


        }
    }


    public static void main(String[] args) {

       // String content = readData("D:\\files\\data.txt");
      //  System.out.println(content);
        List<String> lines= Arrays.asList("linia","jbsnjdbsjdbjd","ddddddd");
        try{
            saveToFile(lines,"newFile.txt");
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
