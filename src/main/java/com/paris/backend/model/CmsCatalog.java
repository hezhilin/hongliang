package com.paris.backend.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

/**
 * Created by HE on 2017/9/21 0021.
 * CMS网站栏目
 */
@Entity
@Table(name="CmsCatalog")
public class CmsCatalog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "catalog_id")
    private int id;

    @Column(name = "par_id")
    private int par_id;     //上级栏目ID

    @Column(name="catalog_name")
    @Length(min =2 ,max = 30)
    private String catalog_name;


    @Column(name="catalog_type")
    @Length(min =2 ,max = 20)
    private String catalog_type;

    @Column(name="catalog_state")
    @Length(min =2 ,max = 20)
    private String catalog_state;

    @Column(name="catalog_url")
    @Length(min =2 ,max = 30)
    private String catalog_url;

    @Column(name="catalog_opentype")
    @Length(min =2 ,max = 20)
    private String catalog_opentype;

    @Column(name="catalog_order")
    private int catalog_order;

    public CmsCatalog() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPar_id() {
        return par_id;
    }

    public void setPar_id(int par_id) {
        this.par_id = par_id;
    }

    public String getCatalog_name() {
        return catalog_name;
    }

    public void setCatalog_name(String catalog_name) {
        this.catalog_name = catalog_name;
    }

    public String getCatalog_type() {
        return catalog_type;
    }

    public void setCatalog_type(String catalog_type) {
        this.catalog_type = catalog_type;
    }

    public String getCatalog_state() {
        return catalog_state;
    }

    public void setCatalog_state(String catalog_state) {
        this.catalog_state = catalog_state;
    }

    public String getCatalog_url() {
        return catalog_url;
    }

    public void setCatalog_url(String catalog_url) {
        this.catalog_url = catalog_url;
    }

    public String getCatalog_opentype() {
        return catalog_opentype;
    }

    public void setCatalog_opentype(String catalog_opentype) {
        this.catalog_opentype = catalog_opentype;
    }

    public int getCatalog_order() {
        return catalog_order;
    }

    public void setCatalog_order(int catalog_order) {
        this.catalog_order = catalog_order;
    }
}
