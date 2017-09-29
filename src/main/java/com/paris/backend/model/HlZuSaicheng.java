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

    @Column(name = "faqiu")
    private String faqiu;       //发球

    @Column(name = "fangwei")
    private String fangwei;     //方位

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

    @Column(name = "sc_cj1")
    private int sc_cj1;     //成绩1

    @Column(name = "sc_cj2")
    private int sc_cj2;     //成绩1

    @Column(name = "sc_cj11")
    private int sc_cj11;     //1局成绩

    @Column(name = "sc_cj12")
    private int sc_cj12;     //1局成绩

    @Column(name = "sc_cj21")
    private int sc_cj21;     //2局成绩

    @Column(name = "sc_cj22")
    private int sc_cj22;     //2局成绩

    @Column(name = "sc_cj31")
    private int sc_cj31;     //3局成绩

    @Column(name = "sc_cj32")
    private int sc_cj32;     //3局成绩

    @Column(name = "sc_cj41")
    private int sc_cj41;     //4局成绩

    @Column(name = "sc_cj42")
    private int sc_cj42;     //4局成绩

    @Column(name = "sc_cj51")
    private int sc_cj51;     //5局成绩

    @Column(name = "sc_cj52")
    private int sc_cj52;     //5局成绩

    @Column(name = "win")
    private int win;      //获胜方序号

    @Column(name = "cp_id")
    private int cp_id;      //录入成绩的裁判ID

    @Column(name = "qm_sheng")
    private String qm_sheng;        //胜方签名

    @Column(name = "qm_fu")
    private String qm_fu;        //负方签名

    @Column(name = "qm_caipan")
    private String qm_caipan;        //裁判签名

    @Column(name = "qm_caipanzhang")
    private String qm_caipanzhang;        //裁判长签名

    @Column(name = "status")
    private int Status;     //状态  1 正常  2 异常

    @Column(name ="memo")
    @Length(min = 2 ,max = 100)
    private String Memo;





}
