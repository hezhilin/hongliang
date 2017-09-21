package com.paris.backend.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by HE on 2017/9/21 0021.
 * 比赛申请表
 */
@Entity
@Table(name = "hlShenqing")
public class HlShenqing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sq_id")
    private int id;

    @Column(name = "beiming")
    @Length(min = 1 , max = 100)
    private String BeiMing;

    @Column(name = "saizhi")
    @Length(min = 1 , max = 2)
    private String SaiZhi;  // 1:奥运赛制  2:世锦赛赛制

    @Column(name ="tuanti")
    private int TuanTi;     //0 无团体  1 有团体

    @Column(name ="danda")
    private int DanDa;     //0 无单打  1 有单打

    @Column(name ="ttjieduan")
    private int TTJieDuan;  //0 团体不区分阶段  1 区分比赛阶段（第一阶段循环，第二阶段淘汰）

    @Column(name = "ttjieduanlx")
    private int TTJieDuanLX;    //不区分比赛阶段，即单阶段类型  1 循环  2 淘汰

    @Column(name ="ttnan")
    private int TTNan;  //团体男子

    @Column(name ="ttnanzu")
    private int TTNanZu;    //团体男子区分组别

    @Column(name ="ttnv")
    private int TTNv;  //团体女子

    @Column(name ="ttnvzu")
    private int TTNvZu;    //团体女子区分组别

    @Column(name ="tthun")
    private int TTHun;  //团体混合

    @Column(name ="tthunzu")
    private int TTHunZu;    //团体混合区分组别

    @Column(name ="ddjieduan")
    private int DDJieDuan;  //0 单打不区分阶段  1 区分比赛阶段（第一阶段循环，第二阶段淘汰）

    @Column(name = "ddjieduanlx")
    private int DDJieDuanLX;    //不区分比赛阶段，即单阶段类型  1 循环  2 淘汰

    @Column(name ="ddnan")
    private int DDNan;  //单打男子

    @Column(name ="ddnanzu")
    private int DDNanZu;    //单打男子区分组别

    @Column(name ="ddnv")
    private int DDNv;  //单打女子

    @Column(name ="ddnvzu")
    private int DDNvZu;    //单打女子区分组别

    @Column(name ="sqsj")
    private Date SQSJ;  //申请时间

    @Column(name ="sqr")
    private int SQR;        //申请人，是否和User表做外键

    @Column(name ="shsj")
    private Date SHSJ;  //审核时间

    @Column(name ="shr")
    private int SHR;        //审核人，是否和User表做外键

    @Column(name = "status")
    private int Status;     //状态  1 申请  2 审核  3 报告 4编排 5一阶段比赛 6二阶段比赛 9结束

    @Column(name ="memo")
    @Length(min = 2 ,max = 100)
    private String Memo;

    @OneToOne(cascade = CascadeType.MERGE,orphanRemoval=true,fetch = FetchType.EAGER)
    @JoinTable(name = "hlShenqing_hlShenqings", joinColumns = @JoinColumn(name = "sq_id"), inverseJoinColumns = @JoinColumn(name = "sqs_id"))
    private HlShenqings hlShenqings;
}
