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

    @OneToOne(cascade = CascadeType.MERGE,orphanRemoval=true,fetch = FetchType.EAGER)
    @JoinTable(name = "hlTai_hlCaipan", joinColumns = @JoinColumn(name = "tai_id"), inverseJoinColumns = @JoinColumn(name = "cp_id"))
    private HlCaipan hlCaipan;

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

    public HlCaipan getHlCaipan() {
        return hlCaipan;
    }

    public void setHlCaipan(HlCaipan hlCaipan) {
        this.hlCaipan = hlCaipan;
    }
}
