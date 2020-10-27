package Lab9;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class ExCreateFile {
    public static void main(String[] args) {

        File myFile = new File("C:/Users/LabCom_MT-4/Documents/myFileCP/Test.txt");
        try {
            if (myFile.createNewFile()) {
                System.out.println("New File is already created.");
            } else {
                System.out.println("Could not create a new file.");
            }
        } catch (IOException e) {
            System.out.println("Could not create a new file.");
            e.printStackTrace();
        }

        System.out.println(myFile.getParent());
        System.out.println(myFile.length());
        System.out.println(myFile.canRead());
        System.out.println(myFile.canWrite());
        System.out.println(myFile.exists());
        System.out.println(myFile.getName());

    }
}
