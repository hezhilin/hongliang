package com.paris.backend.model;

import javax.persistence.*;

/**
 * Created by HE on 2017/9/21 0021.
 * 比赛申请表子表，即比赛组别表
 */
@Entity
@Table(name = "hlShenqings")
public class HlShenqings {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sqs_id")
    private int id;

    @Column(name ="zubie")
    private String ZuBie;

    @Column(name ="shuliang")
    private int ShuLiang;


}