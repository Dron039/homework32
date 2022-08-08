package phonebook;

import java.io.*;

public class ObjectPhone {
    public static void main(String[] args) {

        File fileOutput = new File("/home/fox/IdeaProjects/homework32/example_directory/run/skip/java/output.txt");
        createNewFileIfNotExist(fileOutput);


        try(InputStream inputStream = new FileInputStream("/home/fox/IdeaProjects/homework32/example_directory/run/skip/java/exampleFile.txt");
        OutputStream outputStream = new FileOutputStream("/home/fox/IdeaProjects/homework32/example_directory/run/skip/java/output.txt")) {
            byte buffer[] = new byte[inputStream.available()];
            inputStream.read(buffer);
            System.out.println(new String(buffer));
            outputStream.write(buffer);

            Contact contact = new Contact(1L,"Java SE");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(contact);
            } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createNewFileIfNotExist(File fileOutput) {

    }
}
