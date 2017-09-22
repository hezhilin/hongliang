package com.paris.backend.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by HE on 2017/9/22 0022.
 * 裁判信息表
 */
@Entity
@Table(name = "HlCaipan")
public class HlCaipan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cp_id")
    private int id;

    @Column(name = "cp_name")
    @Length(min = 2,max = 30)
    private String cp_name;

    @Column(name = "cp_sex")
    private int cp_sex;

    @Column(name = "cp_age")
    private int cp_age;

    @Column(name = "cp_sfzh")
    @Length(min = 18,max = 18)
    private String cp_sfzh;     //身份证号

    @Column(name = "cp_pic")
    @Length(min = 0,max = 50)
    private String cp_pic;     //裁判照片


    @Column(name = "email")
    @Email(message = "*请提供一个有效的邮箱")
    @NotEmpty(message = "*请提供一个邮箱")
    @Length(min = 3,max = 50)
    private String email;

    @Column(name = "phone")
    @NotEmpty(message = "*请提供您的联系电话")
    @Length(min = 7 ,max = 30)
    private String phone;

    @Column(name = "sheng")
    private String sheng;   //省

    @Column(name = "shi")
    private String shi;   //市

    @Column(name = "qu")
    private String qu;   //区

    @Column(name = "dizi")
    private String dizi;   //地址

    @Column(name = "ilevel")
    private int ilevel;     //是否有等级证书

    @Column(name = "slevel")
    @Length(min = 2,max = 30)
    private String slevel;  //等级证书名称

    @Column(name = "jifen")
    private int jifen;      //积分

    @Column(name = "user_id")
    private int user_id;        //用户ID，与用户表进行绑定

    @Column(name ="sqsj")
    private Date SQSJ;  //审核时间

    @Column(name = "status")
    private int Status;     //状态  1 正常  2 异常

    @Column(name ="memo")
    @Length(min = 2 ,max = 100)
    private String Memo;

    @OneToOne(cascade = CascadeType.MERGE,orphanRemoval=true,fetch = FetchType.EAGER)
    @JoinTable(name = "hlCaipan_hlCaipans", joinColumns = @JoinColumn(name = "cp_id"), inverseJoinColumns = @JoinColumn(name = "cps_id"))
    private HlCaipans hlCaipans;

    public HlCaipan() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCp_name() {
        return cp_name;
    }

    public void setCp_name(String cp_name) {
        this.cp_name = cp_name;
    }

    public int getCp_sex() {
        return cp_sex;
    }

    public void setCp_sex(int cp_sex) {
        this.cp_sex = cp_sex;
    }

    public int getCp_age() {
        return cp_age;
    }

    public void setCp_age(int cp_age) {
        this.cp_age = cp_age;
    }

    public String getCp_sfzh() {
        return cp_sfzh;
    }

    public void setCp_sfzh(String cp_sfzh) {
        this.cp_sfzh = cp_sfzh;
    }

    public String getCp_pic() {
        return cp_pic;
    }

    public void setCp_pic(String cp_pic) {
        this.cp_pic = cp_pic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng;
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi;
    }

    public String getQu() {
        return qu;
    }

    public void setQu(String qu) {
        this.qu = qu;
    }

    public String getDizi() {
        return dizi;
    }

    public void setDizi(String dizi) {
        this.dizi = dizi;
    }

    public int getIlevel() {
        return ilevel;
    }

    public void setIlevel(int ilevel) {
        this.ilevel = ilevel;
    }

    public String getSlevel() {
        return slevel;
    }

    public void setSlevel(String slevel) {
        this.slevel = slevel;
    }

    public int getJifen() {
        return jifen;
    }

    public void setJifen(int jifen) {
        this.jifen = jifen;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Date getSQSJ() {
        return SQSJ;
    }

    public void setSQSJ(Date SQSJ) {
        this.SQSJ = SQSJ;
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

    public HlCaipans getHlCaipans() {
        return hlCaipans;
    }

    public void setHlCaipans(HlCaipans hlCaipans) {
        this.hlCaipans = hlCaipans;
    }
}
