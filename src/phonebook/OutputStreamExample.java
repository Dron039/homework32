package phonebook;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {

    public static void main(String[] args) {
        OutputStream outputStream = new ByteArrayOutputStream();
        try {
            outputStream.write(new byte[10]);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
