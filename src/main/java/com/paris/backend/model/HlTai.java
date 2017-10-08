package com.paris.backend.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * Created by HE on 2017/9/27 0027.
 * 赛台管理
 */
@Entity
@Table(name = "HlTai")
public class HlTai {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tai_id")
    private int id;

    @Column(name = "sq_id")
    private int sq_id;      //比赛申请ID

    @Column(name = "taihao")
    @Length(min = 1,max = 10)
    private String taihao;

    @Column(name = "dizhi")
    @Length(min = 1,max = 30)
    private String dizhi;

    @Column(name = "status")
    private int Status;     //状态  1 正常  2 异常

    @Column(name ="memo")
    @Length(min = 2 ,max = 100)
    private String Memo;

    @Column(name = "cp_id1")
    private int cp_id1;         //裁判1

    @Column(name = "cp_name1")
    private int cp_name1;         //裁判1

    @Column(name = "cp_id2")
    private int cp_id2;         //裁判2

    @Column(name = "cp_name2")
    private int cp_name2;         //裁判2

    public HlTai() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaihao() {
        return taihao;
    }

    public void setTaihao(String taihao) {
        this.taihao = taihao;
    }

    public String getDizhi() {
        return dizhi;
    }

    public void setDizhi(String dizhi) {
        this.dizhi = dizhi;
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

    public int getCp_id1() {
        return cp_id1;
    }

    public void setCp_id1(int cp_id1) {
        this.cp_id1 = cp_id1;
    }

    public int getCp_id2() {
        return cp_id2;
    }

    public void setCp_id2(int cp_id2) {
        this.cp_id2 = cp_id2;
    }
}
