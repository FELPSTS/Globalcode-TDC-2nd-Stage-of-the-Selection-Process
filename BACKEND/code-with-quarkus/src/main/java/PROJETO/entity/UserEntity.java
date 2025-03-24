package PROJETO.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "users")
public class UserEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Definir como AUTO_INCREMENT no MySQL
    public int id;

    @Column(name = "authorName")  // Nome do campo na tabela
    public String authorName;

    @Column(name = "email")  // Nome do campo na tabela
    public String email;
}

