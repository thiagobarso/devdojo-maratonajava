package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.*;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("O DeVDojo é lindo, é o melhor curso do Brasil.");
            bw.newLine();
            bw.flush();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
