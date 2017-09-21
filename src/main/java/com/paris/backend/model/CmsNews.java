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

    public CmsNews() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCatalog_id() {
        return catalog_id;
    }

    public void setCatalog_id(int catalog_id) {
        this.catalog_id = catalog_id;
    }

    public String getNewsTitle() {
        return NewsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        NewsTitle = newsTitle;
    }

    public String getNewsPic() {
        return NewsPic;
    }

    public void setNewsPic(String newsPic) {
        NewsPic = newsPic;
    }

    public String getNewsBrief() {
        return NewsBrief;
    }

    public void setNewsBrief(String newsBrief) {
        NewsBrief = newsBrief;
    }

    public String getNewsContent() {
        return NewsContent;
    }

    public void setNewsContent(String newsContent) {
        NewsContent = newsContent;
    }

    public String getNewsState() {
        return NewsState;
    }

    public void setNewsState(String newsState) {
        NewsState = newsState;
    }

    public Date getNewsDate() {
        return NewsDate;
    }

    public void setNewsDate(Date newsDate) {
        NewsDate = newsDate;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
