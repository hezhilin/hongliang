package com.paris.backend.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by HE on 2017/9/23 0023.
 * 分组赛程安排
 */
@Entity
@Table(name = "HlZuSaicheng")
public class HlZuSaicheng {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sc_id")
    private int id;

    @Column(name = "xuhao1")
    private int xuhao1;      //小组内序号1

    @Column(name = "xuhao2")
    private int xuhao2;      //小组内序号2 即对手

    @Column(name = "sc_rq")
    private Date sc_rq;             //比赛日期

    @Column(name = "sc_kssj")
    @Length(min = 5, max = 10)
    private String sc_kssj;         //比赛开始时间

    @Column(name = "sc_jssj")
    @Length(min = 5, max = 10)
    private String sc_jssj;         //比赛结束时间

    @Column(name = "sc_tai")
    @Length(min = 1, max = 10)
    private String sc_tai;          //比赛台号

    @Column(name = "status")
    private int Status;     //状态  1 正常  2 异常

    @Column(name ="memo")
    @Length(min = 2 ,max = 100)
    private String Memo;

    @Column(name = "sc_cj1")
    private int sc_cj1;     //成绩1

    @Column(name = "sc_cj2")
    private int sc_cj2;     //成绩1

    @Column(name = "win")
    private int win;      //获胜方序号

    @Column(name = "cp_id")
    private int cp_id;      //录入成绩的裁判ID




}
