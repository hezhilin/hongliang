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


}
