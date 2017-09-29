package com.paris.backend.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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


    @OneToMany(cascade = CascadeType.ALL,orphanRemoval=true,fetch = FetchType.LAZY)
    @JoinColumn(name = "hlZu_id")
    private List<HlZuYdy> hlZuYdy;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval=true,fetch = FetchType.LAZY)
    @JoinColumn(name = "hlZu_id")
    private List<HlZuSaicheng> hlZuSaicheng;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval=true,fetch = FetchType.LAZY)
    @JoinColumn(name = "hlZu_id")
    private List<HlZuSaiPing> hlZuSaiping;

    public HlZu() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getZu_name() {
        return zu_name;
    }

    public void setZu_name(String zu_name) {
        this.zu_name = zu_name;
    }

    public int getSq_id() {
        return sq_id;
    }

    public void setSq_id(int sq_id) {
        this.sq_id = sq_id;
    }

    public String getLeibie() {
        return leibie;
    }

    public void setLeibie(String leibie) {
        this.leibie = leibie;
    }

    public String getZubie() {
        return zubie;
    }

    public void setZubie(String zubie) {
        this.zubie = zubie;
    }

    public int getRenshu() {
        return renshu;
    }

    public void setRenshu(int renshu) {
        this.renshu = renshu;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Date getBpsj() {
        return bpsj;
    }

    public void setBpsj(Date bpsj) {
        this.bpsj = bpsj;
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

    public List<HlZuYdy> getHlZuYdy() {
        return hlZuYdy;
    }

    public void setHlZuYdy(List<HlZuYdy> hlZuYdy) {
        this.hlZuYdy = hlZuYdy;
    }

    public List<HlZuSaicheng> getHlZuSaicheng() {
        return hlZuSaicheng;
    }

    public void setHlZuSaicheng(List<HlZuSaicheng> hlZuSaicheng) {
        this.hlZuSaicheng = hlZuSaicheng;
    }

    public List<HlZuSaiPing> getHlZuSaiping() {
        return hlZuSaiping;
    }

    public void setHlZuSaiping(List<HlZuSaiPing> hlZuSaiping) {
        this.hlZuSaiping = hlZuSaiping;
    }
}
