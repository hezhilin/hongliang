package com.paris.backend.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by HE on 2017/9/23 0023.
 * 分组赛程安排
 */
@Entity
@Table(name = "HlZuSaicheng")
@Data
public class HlZuSaicheng {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sc_id")
    private int id;

    @Column(name = "jieduan")
    private int jieduan;      //阶段

    @Column(name = "xuhao")
    private int xuhao;      //序号

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

    @Column(name = "sc_cj61")
    private int sc_cj61;     //6局成绩

    @Column(name = "sc_cj62")
    private int sc_cj62;     //6局成绩

    @Column(name = "sc_cj71")
    private int sc_cj71;     //7局成绩

    @Column(name = "sc_cj72")
    private int sc_cj72;     //7局成绩

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

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval=true,fetch = FetchType.LAZY)
    @JoinColumn(name = "hlZuSaicheng_id")
    private List<HlZuSaiChengs> hlZuSaiChengs;


    public HlZuSaicheng() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getXuhao1() {
        return xuhao1;
    }

    public void setXuhao1(int xuhao1) {
        this.xuhao1 = xuhao1;
    }

    public int getXuhao2() {
        return xuhao2;
    }

    public void setXuhao2(int xuhao2) {
        this.xuhao2 = xuhao2;
    }

    public String getFaqiu() {
        return faqiu;
    }

    public void setFaqiu(String faqiu) {
        this.faqiu = faqiu;
    }

    public String getFangwei() {
        return fangwei;
    }

    public void setFangwei(String fangwei) {
        this.fangwei = fangwei;
    }

    public Date getSc_rq() {
        return sc_rq;
    }

    public void setSc_rq(Date sc_rq) {
        this.sc_rq = sc_rq;
    }

    public String getSc_kssj() {
        return sc_kssj;
    }

    public void setSc_kssj(String sc_kssj) {
        this.sc_kssj = sc_kssj;
    }

    public String getSc_jssj() {
        return sc_jssj;
    }

    public void setSc_jssj(String sc_jssj) {
        this.sc_jssj = sc_jssj;
    }

    public String getSc_tai() {
        return sc_tai;
    }

    public void setSc_tai(String sc_tai) {
        this.sc_tai = sc_tai;
    }

    public int getSc_cj1() {
        return sc_cj1;
    }

    public void setSc_cj1(int sc_cj1) {
        this.sc_cj1 = sc_cj1;
    }

    public int getSc_cj2() {
        return sc_cj2;
    }

    public void setSc_cj2(int sc_cj2) {
        this.sc_cj2 = sc_cj2;
    }

    public int getSc_cj11() {
        return sc_cj11;
    }

    public void setSc_cj11(int sc_cj11) {
        this.sc_cj11 = sc_cj11;
    }

    public int getSc_cj12() {
        return sc_cj12;
    }

    public void setSc_cj12(int sc_cj12) {
        this.sc_cj12 = sc_cj12;
    }

    public int getSc_cj21() {
        return sc_cj21;
    }

    public void setSc_cj21(int sc_cj21) {
        this.sc_cj21 = sc_cj21;
    }

    public int getSc_cj22() {
        return sc_cj22;
    }

    public void setSc_cj22(int sc_cj22) {
        this.sc_cj22 = sc_cj22;
    }

    public int getSc_cj31() {
        return sc_cj31;
    }

    public void setSc_cj31(int sc_cj31) {
        this.sc_cj31 = sc_cj31;
    }

    public int getSc_cj32() {
        return sc_cj32;
    }

    public void setSc_cj32(int sc_cj32) {
        this.sc_cj32 = sc_cj32;
    }

    public int getSc_cj41() {
        return sc_cj41;
    }

    public void setSc_cj41(int sc_cj41) {
        this.sc_cj41 = sc_cj41;
    }

    public int getSc_cj42() {
        return sc_cj42;
    }

    public void setSc_cj42(int sc_cj42) {
        this.sc_cj42 = sc_cj42;
    }

    public int getSc_cj51() {
        return sc_cj51;
    }

    public void setSc_cj51(int sc_cj51) {
        this.sc_cj51 = sc_cj51;
    }

    public int getSc_cj52() {
        return sc_cj52;
    }

    public void setSc_cj52(int sc_cj52) {
        this.sc_cj52 = sc_cj52;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getCp_id() {
        return cp_id;
    }

    public void setCp_id(int cp_id) {
        this.cp_id = cp_id;
    }

    public String getQm_sheng() {
        return qm_sheng;
    }

    public void setQm_sheng(String qm_sheng) {
        this.qm_sheng = qm_sheng;
    }

    public String getQm_fu() {
        return qm_fu;
    }

    public void setQm_fu(String qm_fu) {
        this.qm_fu = qm_fu;
    }

    public String getQm_caipan() {
        return qm_caipan;
    }

    public void setQm_caipan(String qm_caipan) {
        this.qm_caipan = qm_caipan;
    }

    public String getQm_caipanzhang() {
        return qm_caipanzhang;
    }

    public void setQm_caipanzhang(String qm_caipanzhang) {
        this.qm_caipanzhang = qm_caipanzhang;
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
}
