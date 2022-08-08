package phonebook;

import java.io.File;
import java.io.IOException;

public class IOBasics {
    public static void main(String[] args) throws InterruptedException {
        File directory = new File("/home/fox/IdeaProjects/homework32/example_directory/run/skip/java");
        directory.mkdirs();

        File fileByPath = new File("/home/fox/IdeaProjects/homework32/example_directory/run/skip/java/exampleFile.txt");
        if (!fileByPath.exists()) {
            try {
                if (fileByPath.createNewFile()) {
                    System.out.println("file was create");
                }
                }catch (IOException exception) {
                exception.printStackTrace();
            }
        }
        System.out.println(fileByPath.getFreeSpace());
        Thread.sleep(2000);
        fileByPath.deleteOnExit();
    }
}
