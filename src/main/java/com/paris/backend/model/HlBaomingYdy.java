package com.paris.backend.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by HE on 2017/9/22 0022.
 * 报名子表，运动员子表
 */
@Entity
@Table(name = "HlBaomingYdy")
public class HlBaomingYdy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bmydy_id")
    private int id;

    @Column(name = "ydy_xm")
    private String ydy_xm ;  //运动员姓名

    @Column(name = "ydy_xb")
    private int ydy_xb;      //运动员性别

    @Column(name = "ydy_dh")
    private String ydy_dh;       //运动员电话

    @Column(name = "status")
    private int Status;     //状态  1报名  2 审核

    @Column(name ="memo")
    @Length(min = 2 ,max = 100)
    private String Memo;

    @Column(name = "user_id")
    private int user_id;        //用户ID，与用户表进行绑定

//    @Column(name = "leibie")
//    private String leibie;       //类别    男子  女子    有性别就可以了，不用加这个类别

    @Column(name = "zubie")
    private String zubie;       //组别

    @Column(name = "ydy_sfzh")
    @Length(min = 18,max = 18)
    private String ydy_sfzh;     //身份证号

    @Column(name = "ydy_csrq")
    private Date ydy_csrq;      //出生日期

    @Column(name = "wofa")
    private String wofa;        //握法

    @Column(name = "jiazhang")
    private int jiazhang;       //陪同家长人数

    @Column(name = "wechat")
    private String wechat;

    public HlBaomingYdy() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYdy_xm() {
        return ydy_xm;
    }

    public void setYdy_xm(String ydy_xm) {
        this.ydy_xm = ydy_xm;
    }

    public int getYdy_xb() {
        return ydy_xb;
    }

    public void setYdy_xb(int ydy_xb) {
        this.ydy_xb = ydy_xb;
    }

    public String getYdy_dh() {
        return ydy_dh;
    }

    public void setYdy_dh(String ydy_dh) {
        this.ydy_dh = ydy_dh;
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

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getZubie() {
        return zubie;
    }

    public void setZubie(String zubie) {
        this.zubie = zubie;
    }

    public String getYdy_sfzh() {
        return ydy_sfzh;
    }

    public void setYdy_sfzh(String ydy_sfzh) {
        this.ydy_sfzh = ydy_sfzh;
    }

    public Date getYdy_csrq() {
        return ydy_csrq;
    }

    public void setYdy_csrq(Date ydy_csrq) {
        this.ydy_csrq = ydy_csrq;
    }

    public String getWofa() {
        return wofa;
    }

    public void setWofa(String wofa) {
        this.wofa = wofa;
    }

    public int getJiazhang() {
        return jiazhang;
    }

    public void setJiazhang(int jiazhang) {
        this.jiazhang = jiazhang;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }
}
