package com.cpp.mscs.cricscore.match.models;


import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

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
    private String uuid1;

    @Column(name = "name")
    private String first_name;

    @ManyToOne
    @JoinColumn(name = "Fk_cityId")
    private City city;

    @Column(name = "phNumber")
    private Long phoneNumber;

    @Column(name = "dob")
    private Date dateOfBirth;

    @Column(name = "profilePath")
    private String photoUrl;

    @Column(name = "email")
    private String email;

//    @ManyToMany(mappedBy = "playerList")
//    private List<Team> teamList;
}