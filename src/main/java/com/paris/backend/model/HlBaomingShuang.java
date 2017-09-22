package com.paris.backend.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * Created by HE on 2017/9/22 0022.
 * 报名子表 双打信息表
 */
@Entity
@Table(name = "HlBaomingShuang")
public class HlBaomingShuang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bms_id")
    private int id;

    @Column(name = "leibie")
    private String leibie;       //类别    男子双打  女子双打  混合双打

    @Column(name = "zubie")
    private String zubie;       //组别

    @Column(name = "user_id1")
    private int user_id1;        //运动员1  用户ID

    @Column(name = "user_name1")
    private String user_name1;        //运动员1  用户名

    @Column(name = "user_id2")
    private int user_id2;        //运动员2  用户ID

    @Column(name = "user_name2")
    private String user_name2;        //运动员2  用户名

    @Column(name = "status")
    private int Status;     //状态  1报名  2 审核

    @Column(name ="memo")
    @Length(min = 2 ,max = 100)
    private String Memo;

    public HlBaomingShuang() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getUser_id1() {
        return user_id1;
    }

    public void setUser_id1(int user_id1) {
        this.user_id1 = user_id1;
    }

    public String getUser_name1() {
        return user_name1;
    }

    public void setUser_name1(String user_name1) {
        this.user_name1 = user_name1;
    }

    public int getUser_id2() {
        return user_id2;
    }

    public void setUser_id2(int user_id2) {
        this.user_id2 = user_id2;
    }

    public String getUser_name2() {
        return user_name2;
    }

    public void setUser_name2(String user_name2) {
        this.user_name2 = user_name2;
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
