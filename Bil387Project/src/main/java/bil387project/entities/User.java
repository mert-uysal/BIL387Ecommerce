package bil387project.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    public User(int i) {
        this.userID = i;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_gen_seq")
    @SequenceGenerator(name = "user_id_gen_seq", sequenceName = "user_id_gen_seq", allocationSize = 1)
    @Column(name = "user_id")
    private int userID;

    @Column(name = "user_name")
    private String uname;

    @Column(name = "user_surname")
    private String surname;

    @Column(name = "user_email")
    private String email;

    @Column(name = "user_username")
    private String username;

    @Column(name = "user_password")
    private String password;

    @Column(name = "user_register_date")
    private String registerDate;
}
