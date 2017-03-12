package com.sundy.model;

import java.math.BigDecimal;
import java.util.Date;

public class ClotheProcessBean {
    private Integer id;

    private Integer styleid;

    private String stylename;

    private String processname;

    private BigDecimal processprice;

    private Date createdate;

    private Date updatedate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStyleid() {
        return styleid;
    }

    public void setStyleid(Integer styleid) {
        this.styleid = styleid;
    }

    public String getStylename() {
        return stylename;
    }

    public void setStylename(String stylename) {
        this.stylename = stylename == null ? null : stylename.trim();
    }

    public String getProcessname() {
        return processname;
    }

    public void setProcessname(String processname) {
        this.processname = processname == null ? null : processname.trim();
    }

    public BigDecimal getProcessprice() {
        return processprice;
    }

    public void setProcessprice(BigDecimal processprice) {
        this.processprice = processprice;
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
}