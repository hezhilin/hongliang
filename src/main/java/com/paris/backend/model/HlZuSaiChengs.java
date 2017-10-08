package com.paris.backend.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * Created by HE on 2017/9/29 0029.
 * 团队小组内赛程安排
 */
@Entity
@Table(name = "")
public class HlZuSaiChengs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "scs_id")
    private int id;

    @Column(name = "xuhao1")
    private int xuhao1;      //小组内序号1

    @Column(name = "xuhao2")
    private int xuhao2;      //小组内序号2 即对手

    @Column(name = "faqiu")
    private String faqiu;       //发球

    @Column(name = "fangwei")
    private String fangwei;     //方位

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

    @Column(name = "status")
    private int Status;     //状态  1 正常  2 异常

    @Column(name ="memo")
    @Length(min = 2 ,max = 100)
    private String Memo;

    public HlZuSaiChengs() {
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
