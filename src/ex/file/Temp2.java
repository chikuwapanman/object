package ex.file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Temp2 {
    public static void main(String[] args) {
        question2();
    }

    public static void question2(){
        String first = "./src/ex/file";
        String fileName = "temp.txt";
        Path path = Path.of(first,fileName);
        if (Files.exists(path)){
            List<String> list = Arrays.asList("oyoyo~" , "ra-ra");
            try {
                Files.write(path,list);
            } catch (java.io.IOException e){
                e.printStackTrace();
            }
        }

    }
}
