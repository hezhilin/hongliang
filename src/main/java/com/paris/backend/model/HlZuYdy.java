package com.paris.backend.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by HE on 2017/9/23 0023.
 * 赛程安排 分组 组包含的运动员
 */
@Entity
@Table(name = "HlZuYdy")
public class HlZuYdy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "zuydy_id")
    private int id;

    @Column(name = "xuhao")
    private int xuhao;      //小组内序号

    @Column(name = "bm_id")
    private int bm_id;      //团体报名ID

    @Column(name = "tt_name")
    private String tt_name;     //队伍名称

    @Column(name = "user_id1")
    private int user_id1;        //运动员1  用户ID

    @Column(name = "user_name1")
    private String user_name1;        //运动员1  用户名

    @Column(name = "user_id2")
    private int user_id2;        //运动员2  用户ID

    @Column(name = "user_name2")
    private String user_name2;        //运动员2  用户名

    @Column(name = "status")
    private int Status;     //状态  1 正常  2 异常

    @Column(name ="memo")
    @Length(min = 2 ,max = 100)
    private String Memo;

    public HlZuYdy() {
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

    public int getBm_id() {
        return bm_id;
    }

    public void setBm_id(int bm_id) {
        this.bm_id = bm_id;
    }

    public String getTt_name() {
        return tt_name;
    }

    public void setTt_name(String tt_name) {
        this.tt_name = tt_name;
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
