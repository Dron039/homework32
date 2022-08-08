package phonebook;

import java.io.Serializable;

public class Contact implements Serializable {

        private Long id;
        private String name;

    public Contact(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}

