package phonebook;

import java.io.Serial;
import java.io.Serializable;

public class Contact implements Serializable {

    @Serial
    private static final long serialVersionUID = -7133894735851737395L;
    private Long id;
        private String name;

    public Contact(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}

