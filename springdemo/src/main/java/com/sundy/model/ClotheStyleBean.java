package com.sundy.model;

import java.util.Date;

public class ClotheStyleBean {
    private Integer id;

    private String stylename;

    private String stylecode;

    private Integer stylenum;

    private Date createdate;

    private Date updatedate;

    private String monthname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStylename() {
        return stylename;
    }

    public void setStylename(String stylename) {
        this.stylename = stylename == null ? null : stylename.trim();
    }

    public String getStylecode() {
        return stylecode;
    }

    public void setStylecode(String stylecode) {
        this.stylecode = stylecode == null ? null : stylecode.trim();
    }

    public Integer getStylenum() {
        return stylenum;
    }

    public void setStylenum(Integer stylenum) {
        this.stylenum = stylenum;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getMonthname() {
        return monthname;
    }

    public void setMonthname(String monthname) {
        this.monthname = monthname == null ? null : monthname.trim();
    }
}