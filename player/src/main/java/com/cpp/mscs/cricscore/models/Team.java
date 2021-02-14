package com.cpp.mscs.cricscore.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 2/3/21
 * Time:  13:25
 */

@Data
@Entity
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long teamId;

    @Column(unique = true, nullable = false, name = "team_name")
    private String teamName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id")
    private City teamCity;


    @ManyToMany
//    @JoinTable(name = "team_players",
//////        joinColumns = @JoinColumn(name = "team_id"),
//////            inverseJoinColumns = @JoinColumn(name = "player_id")
//////    )
    private List<Player> playerList;
}