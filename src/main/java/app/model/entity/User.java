package app.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "users_dar")
public class User {
    @Id
    private String id;
    private String userName;

    private String email;

    private String password;
}
