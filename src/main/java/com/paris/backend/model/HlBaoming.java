package com.paris.backend.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by HE on 2017/9/22 0022.
 * 教练报名表
 */
@Entity
@Table(name = "HlBaoming")
public class HlBaoming {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bm_id")
    private int id;

    @Column(name = "sq_id")
    private int sq_id;      //比赛申请ID

    @Column(name = "name")
    @NotEmpty(message = "*请输入队名")
    private String name;

    @Column(name = "ld_xm")
    private String ld_xm ;  //领队姓名

    @Column(name = "ld_xb")
    private int ld_xb;      //领队性别

    @Column(name = "ld_dh")
    private String ld_dh;       //领队电话

    @Column(name ="bmsj")
    private Date BMSJ;  //报名时间

    @Column(name ="bmr")
    private int BMR;        //报名人

    @Column(name ="shsj")
    private Date SHSJ;  //审核时间

    @Column(name ="shr")
    private int SHR;        //审核人，是否和User表做外键

    @Column(name = "status")
    private int Status;     //状态  1报名  2 审核

    @Column(name ="memo")
    @Length(min = 2 ,max = 100)
    private String Memo;

    @OneToOne(cascade = CascadeType.MERGE,orphanRemoval=true,fetch = FetchType.EAGER)
    @JoinTable(name = "hlBaoming_hlBaomingJiaolian", joinColumns = @JoinColumn(name = "bm_id"), inverseJoinColumns = @JoinColumn(name = "bmjl_id"))
    private HlBaomingJiaolian hlBaomingJiaolian;

    @OneToOne(cascade = CascadeType.MERGE,orphanRemoval=true,fetch = FetchType.EAGER)
    @JoinTable(name = "hlBaoming_hlBaomingYdy", joinColumns = @JoinColumn(name = "bm_id"), inverseJoinColumns = @JoinColumn(name = "bmydy_id"))
    private HlBaomingYdy hlBaomingYdy;

    @OneToOne(cascade = CascadeType.MERGE,orphanRemoval=true,fetch = FetchType.EAGER)
    @JoinTable(name = "hlBaoming_hlBaomingShuang", joinColumns = @JoinColumn(name = "bm_id"), inverseJoinColumns = @JoinColumn(name = "bms_id"))
    private HlBaomingShuang hlBaomingShuang;

    public HlBaoming() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLd_xm() {
        return ld_xm;
    }

    public void setLd_xm(String ld_xm) {
        this.ld_xm = ld_xm;
    }

    public int getLd_xb() {
        return ld_xb;
    }

    public void setLd_xb(int ld_xb) {
        this.ld_xb = ld_xb;
    }

    public String getLd_dh() {
        return ld_dh;
    }

    public void setLd_dh(String ld_dh) {
        this.ld_dh = ld_dh;
    }

    public Date getBMSJ() {
        return BMSJ;
    }

    public void setBMSJ(Date BMSJ) {
        this.BMSJ = BMSJ;
    }

    public int getBMR() {
        return BMR;
    }

    public void setBMR(int BMR) {
        this.BMR = BMR;
    }

    public Date getSHSJ() {
        return SHSJ;
    }

    public void setSHSJ(Date SHSJ) {
        this.SHSJ = SHSJ;
    }

    public int getSHR() {
        return SHR;
    }

    public void setSHR(int SHR) {
        this.SHR = SHR;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public String getMemo() {
        return Memo;
    }

    public void setMemo(String memo) {
        Memo = memo;
    }

    public int getSq_id() {
        return sq_id;
    }

    public void setSq_id(int sq_id) {
        this.sq_id = sq_id;
    }

    public HlBaomingJiaolian getHlBaomingJiaolian() {
        return hlBaomingJiaolian;
    }

    public void setHlBaomingJiaolian(HlBaomingJiaolian hlBaomingJiaolian) {
        this.hlBaomingJiaolian = hlBaomingJiaolian;
    }

    public HlBaomingYdy getHlBaomingYdy() {
        return hlBaomingYdy;
    }

    public void setHlBaomingYdy(HlBaomingYdy hlBaomingYdy) {
        this.hlBaomingYdy = hlBaomingYdy;
    }

    public HlBaomingShuang getHlBaomingShuang() {
        return hlBaomingShuang;
    }

    public void setHlBaomingShuang(HlBaomingShuang hlBaomingShuang) {
        this.hlBaomingShuang = hlBaomingShuang;
    }
}
