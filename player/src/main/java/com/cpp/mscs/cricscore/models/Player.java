package com.cpp.mscs.cricscore.models;


import lombok.Data;
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
    private String name;

    @Column(name = "city")
    private String city;

    @Column(name = "phNumber")
    private Long phNumber;

   // @Temporal(TemporalType.DATE)
    @Column(name = "dob")
    private String dob;

    @Column(name = "profilePath")
    private String profilePath;
}