package com.paris.backend.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by HE on 2017/9/21 0021.
 * 首页及其他新闻发布页面的新闻内容
 */
@Entity
@Table(name="CmsNews")
public class CmsNews {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "new_id")
    private int id;

    @Column(name = "catalog_id")
    private int catalog_id;

    @Column(name ="newsTitle")
    @Length(min = 2, max = 100)
    private String NewsTitle;

    @Column(name ="newsPic")
    @Length(min = 2, max = 100)
    private String NewsPic;

    @Column(name ="newsBrief")
    @Length(min = 2, max = 100)
    private String NewsBrief;

    @Column(name = "newsContent")
    @Length(min = 2 , max = 2000)
    private String NewsContent;

    @Column(name = "newsState")
    @Length(min = 2 , max = 20)
    private String NewsState ;

    @Column(name ="newsDate")
    private Date NewsDate;  //时间

    @Column(name ="user_id")
    private int user_id;

}
