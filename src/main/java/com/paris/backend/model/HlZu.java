package com.paris.backend.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by HE on 2017/9/23 0023.
 * 赛程编排  分组表
 */
@Entity
@Table(name = "HlZu")
public class HlZu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "zu_id")
    private int id;

    @Column(name = "zu_name")
    @NotEmpty(message = "*请输入组名")
    private String zu_name;     //组名

    @Column(name = "sq_id")
    private int sq_id;      //比赛申请ID

    @Column(name = "leibie")
    private String leibie;       //类别   团体男子  团体女子  团体混合  男子单打  女子单打  男子双打  女子双打  混合双打

    @Column(name = "zubie")
    private String zubie;       //组别

    @Column(name = "renshu")
    private int renshu;         //表格人数

    @Column(name = "user_id")
    private int user_id;        //用户ID

    @Column(name ="bpsj")
    private Date bpsj;  //编排时间

    @Column(name = "status")
    private int Status;     //状态  1 正常  2 异常

    @Column(name ="memo")
    @Length(min = 2 ,max = 100)
    private String Memo;



}
