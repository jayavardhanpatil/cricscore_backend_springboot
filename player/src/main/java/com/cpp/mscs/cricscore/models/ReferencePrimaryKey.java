package com.cpp.mscs.cricscore.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
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
public class ReferencePrimaryKey implements Serializable {

    @Column(name = "match_id")
    private Long matchId;

    @Column(name = "playeruuid")
    private String playeruuid;

}