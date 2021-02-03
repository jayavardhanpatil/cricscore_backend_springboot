package com.cpp.mscs.cricscore.models;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 2/2/21
 * Time:  11:44
 */

@Data
@Entity
@Table(name = "player")
@Component
public class Player {
    @Id
    @Column(name = "uuid")
    private String uuid;

    @Column(name = "name")
    private String first_name;

    @Column(name = "city")
    private String city;

    @Column(name = "phNumber")
    private Long phoneNumber;

    @Column(name = "dob")
    private Date dateOfBirth;

    @Column(name = "profilePath")
    private String photoUrl;

    @Column(name = "email")
    private String email;
}