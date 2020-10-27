package Lab9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class ExFileWriter {

    public static void main(String [] args){

        Path myPath = Paths.get("C:/Users/LabCom_MT-4/Documents/myFileCP/Test.txt");
        BufferedWriter writer =null;
        try {
            writer = Files.newBufferedWriter(myPath, StandardCharsets.UTF_8, StandardOpenOption.APPEND);

            writer.write("Bank");
            writer.newLine();// ขึ้นบรรทัดใหม่


        } catch (IOException e) {
            e.printStackTrace();
        } finally {

                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }


    }

}
