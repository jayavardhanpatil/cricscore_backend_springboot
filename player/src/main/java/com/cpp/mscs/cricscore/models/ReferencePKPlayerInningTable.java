package com.cpp.mscs.cricscore.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: jayavardhanpatil
 * Date: 3/29/21
 * Time:  18:44
 */

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReferencePKPlayerInningTable implements Serializable {

    @Column(name = "matchId")
    private Long matchId;

    @Column(name = "inningtype")
    private String inningtype;

    @Column(name = "uuid")
    private String uuid;

}