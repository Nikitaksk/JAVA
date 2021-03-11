import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

public class User {
    @Getter
    @Setter
    private UUID id;


    User() {
        id = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new User().toString());
    }
}
