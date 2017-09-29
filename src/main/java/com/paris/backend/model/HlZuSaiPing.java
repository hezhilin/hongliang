package com.paris.backend.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by HE on 2017/9/27 0027.
 * 比赛结果评价，双方选手给裁判评分
 */
@Entity
@Table(name = "HlZuSaiPing")
public class HlZuSaiPing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ping_id")
    private int id;

    @Column(name = "sc_id")
    private int sc_id;      //赛程ID

    @Column(name = "xuhao")
    private int xuhao;      //小组内序号

    @Column(name = "user_id")
    private int user_id;        //运动员  用户ID

    @Column(name = "jifen")
    private int jifen;          //积分
    @Column(name = "ping_sj")
    private Date ping_sj;             //评价时间
    @Column(name = "pingjia")
    private int pingjia;          //评价

    @Column(name = "status")
    private int Status;     //状态  1 正常  2 异常

    @Column(name ="memo")
    @Length(min = 2 ,max = 100)
    private String Memo;




}
