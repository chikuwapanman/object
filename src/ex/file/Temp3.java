package ex.file;

import java.nio.file.Files;
import java.nio.file.Path;

public class Temp3 {
    public static void main(String[] args) {
        question3();
    }

    public static void question3(){
        String first = "./src/ex/file";
        String fileName = "temp.txt";
        Path path = Path.of(first,fileName);
        if (Files.notExists(path)) {
            System.out.println("読み込み対象のファイル:" + path + "が見つかりませんでした。");
        }
            try {
                Files.lines(path)
                        .forEach(System.out::println);
            } catch (java.io.IOException e) {
                e.printStackTrace();
        }
    }
}
