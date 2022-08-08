package phonebook;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) {
        byte[] buffer = new byte[1024];
        byte[] inputBuffer = new byte[10];
        try(InputStream inputStream = new ByteArrayInputStream(buffer)) {
            System.out.println(inputStream.available());
            System.out.println(inputStream.skip(1020));
            System.out.println(inputStream.available());
            System.out.println(inputStream.read(inputBuffer));
        }catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
