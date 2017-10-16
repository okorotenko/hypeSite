package ua.com.hype.core.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by Алексей on 16.10.2017.
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;


    private String userName;
    private String password;
}
