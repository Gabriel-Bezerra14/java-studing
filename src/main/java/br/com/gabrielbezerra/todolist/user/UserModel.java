package br.com.gabrielbezerra.todolist.user;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity (name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue (generator = "UUID")
    private UUID id;

    @Column(unique = true, nullable = false)
    private String username;
    private String name;
    private String password;
    private LocalDateTime createdAt;
}
