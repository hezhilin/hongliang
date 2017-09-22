package com.paris.backend.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * Created by HE on 2017/9/22 0022.
 * 报名表教练子表
 */
@Entity
@Table(name = "HlBaomingJiaolian")
public class HlBaomingJiaolian {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bmjl_id")
    private int id;

    @Column(name = "jl_xm")
    private String jl_xm ;  //教练姓名

    @Column(name = "jl_xb")
    private int jl_xb;      //教练性别

    @Column(name = "jl_dh")
    private String jl_dh;       //教练电话

    @Column(name = "status")
    private int Status;     //状态  1报名  2 审核

    @Column(name ="memo")
    @Length(min = 2 ,max = 100)
    private String Memo;

    @Column(name = "user_id")
    private int user_id;        //用户ID，与用户表进行绑定

    public HlBaomingJiaolian() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJl_xm() {
        return jl_xm;
    }

    public void setJl_xm(String jl_xm) {
        this.jl_xm = jl_xm;
    }

    public int getJl_xb() {
        return jl_xb;
    }

    public void setJl_xb(int jl_xb) {
        this.jl_xb = jl_xb;
    }

    public String getJl_dh() {
        return jl_dh;
    }

    public void setJl_dh(String jl_dh) {
        this.jl_dh = jl_dh;
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
}
