package com.paris.backend.model;

import com.google.gson.annotations.Expose;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/15 0015.
 */
@Entity
@Table(name = "menu")
public class Menu {
    @Expose
    @Id
    @Column(name = "res_id")
    private int id;

    @Column(name = "res_code")
    private String res_code;

    @Expose
    @Column(name = "res_name")
    private String res_name;

    @Expose
    @Column(name = "res_url")
    private String res_url;

    @Column(name = "res_img")
    private String res_img;

    @Column(name = "res_type")
    private String res_type;

    @Column(name = "res_state")
    private String res_state;

    @Column(name = "par_id")
    private int par_id;

    public Menu() {
    }

    @Expose
    @Transient
    private List<Menu> childs = new ArrayList<Menu>();

    public List<Menu> getChilds() {
        return childs;
    }

    public void addChild(Menu child) {

        this.childs.add(child)  ;
    }

    public void setChilds(List<Menu> childs) {
        this.childs = childs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRes_code() {
        return res_code;
    }

    public void setRes_code(String res_code) {
        this.res_code = res_code;
    }

    public String getRes_name() {
        return res_name;
    }

    public void setRes_name(String res_name) {
        this.res_name = res_name;
    }

    public String getRes_url() {
        return res_url;
    }

    public void setRes_url(String res_url) {
        this.res_url = res_url;
    }

    public String getRes_img() {
        return res_img;
    }

    public void setRes_img(String res_img) {
        this.res_img = res_img;
    }

    public String getRes_type() {
        return res_type;
    }

    public void setRes_type(String res_type) {
        this.res_type = res_type;
    }

    public String getRes_state() {
        return res_state;
    }

    public void setRes_state(String res_state) {
        this.res_state = res_state;
    }

    public int getPar_id() {
        return par_id;
    }

    public void setPar_id(int par_id) {
        this.par_id = par_id;
    }
}
