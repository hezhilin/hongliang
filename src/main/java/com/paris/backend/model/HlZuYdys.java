package com.paris.backend.model;

import javax.persistence.*;

/**
 * Created by HE on 2017/9/29 0029.
 * 团体分组小组报名表
 */
@Entity
@Table(name = "HlZuYdys")
public class HlZuYdys {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "zuydys_id")
    private int id;

    @Column(name = "xuhao")
    private int xuhao;      //小组内团体报名序号

    @Column(name = "user_id")
    private int user_id;        //运动员1  用户ID

    @Column(name = "user_name")
    private String user_name;        //运动员1  用户名

    public HlZuYdys() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getXuhao() {
        return xuhao;
    }

    public void setXuhao(int xuhao) {
        this.xuhao = xuhao;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
