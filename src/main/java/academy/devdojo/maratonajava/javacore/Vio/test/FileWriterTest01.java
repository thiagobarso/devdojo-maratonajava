package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWriter
// FileReader
// BufferedWriter
// BufferedReader
public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file,true)){
            fw.write("O DeVDojo é lindo, é o melhor curso do Brasil.\nPulando linha");
            fw.flush();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
