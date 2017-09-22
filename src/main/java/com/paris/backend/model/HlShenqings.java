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
    private String ZuBie;       //组别

    @Column(name ="shuliang")
    private int ShuLiang;       //数量

    public HlShenqings() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getZuBie() {
        return ZuBie;
    }

    public void setZuBie(String zuBie) {
        ZuBie = zuBie;
    }

    public int getShuLiang() {
        return ShuLiang;
    }

    public void setShuLiang(int shuLiang) {
        ShuLiang = shuLiang;
    }
}
