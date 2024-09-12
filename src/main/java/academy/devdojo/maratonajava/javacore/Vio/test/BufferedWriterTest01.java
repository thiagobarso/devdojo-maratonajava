package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.*;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file,true);
            BufferedWriter br = new BufferedWriter(fw)){
            br.write("O DeVDojo é lindo, é o melhor curso do Brasil.");
            br.newLine();
            br.flush();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
