package com.paris.backend.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * Created by HE on 2017/9/22 0022.
 * 裁判子表，裁判的执裁经历
 */
@Entity
@Table(name = "HlCaipans")
public class HlCaipans {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cps_id")
    private int id;

    @Column(name = "jingli")
    @Length(min = 2,max = 50)
    private String jingli;      //执裁经历

    @Column(name ="memo")
    @Length(min = 2 ,max = 100)
    private String Memo;


}
