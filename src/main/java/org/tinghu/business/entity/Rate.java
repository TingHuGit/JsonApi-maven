package org.tinghu.business.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Rate {
    private Date datadate;

    private String salechnlcode;

    private String riskcode;

    private String managecom;

    private String managecomgrade;

    private String managecomname;

    private String upmanagecom;

    private String upmanagecomname;

    private BigDecimal rcvprem3M;

    private BigDecimal paidprem3M;

    private BigDecimal rcvcontnum3M;

    private BigDecimal paidcontnum3M;

    private BigDecimal rcvprem7M;

    private BigDecimal paidprem7M;

    private BigDecimal rcvcontnum7M;

    private BigDecimal paidcontnum7M;

    private BigDecimal rcvprem13M;

    private BigDecimal paidprem13M;

    private BigDecimal rcvcontnum13M;

    private BigDecimal paidcontnum13M;

    private BigDecimal rcvprem25M;

    private BigDecimal paidprem25M;

    private BigDecimal rcvcontnum25M;

    private BigDecimal paidcontnum25M;

    private BigDecimal rcvprem3Y;

    private BigDecimal paidprem3Y;

    private BigDecimal rcvcontnum3Y;

    private BigDecimal paidcontnum3Y;

    private BigDecimal rcvprem7Y;

    private BigDecimal paidprem7Y;

    private BigDecimal rcvcontnum7Y;

    private BigDecimal paidcontnum7Y;

    private BigDecimal rcvprem13Y;

    private BigDecimal paidprem13Y;

    private BigDecimal rcvcontnum13Y;

    private BigDecimal paidcontnum13Y;

    private BigDecimal rcvprem25Y;

    private BigDecimal paidprem25Y;

    private BigDecimal rcvcontnum25Y;

    private BigDecimal paidcontnum25Y;

    public Rate(Date datadate, String salechnlcode, String riskcode, String managecom, String managecomgrade, String managecomname, String upmanagecom, String upmanagecomname, BigDecimal rcvprem3M, BigDecimal paidprem3M, BigDecimal rcvcontnum3M, BigDecimal paidcontnum3M, BigDecimal rcvprem7M, BigDecimal paidprem7M, BigDecimal rcvcontnum7M, BigDecimal paidcontnum7M, BigDecimal rcvprem13M, BigDecimal paidprem13M, BigDecimal rcvcontnum13M, BigDecimal paidcontnum13M, BigDecimal rcvprem25M, BigDecimal paidprem25M, BigDecimal rcvcontnum25M, BigDecimal paidcontnum25M, BigDecimal rcvprem3Y, BigDecimal paidprem3Y, BigDecimal rcvcontnum3Y, BigDecimal paidcontnum3Y, BigDecimal rcvprem7Y, BigDecimal paidprem7Y, BigDecimal rcvcontnum7Y, BigDecimal paidcontnum7Y, BigDecimal rcvprem13Y, BigDecimal paidprem13Y, BigDecimal rcvcontnum13Y, BigDecimal paidcontnum13Y, BigDecimal rcvprem25Y, BigDecimal paidprem25Y, BigDecimal rcvcontnum25Y, BigDecimal paidcontnum25Y) {
        this.datadate = datadate;
        this.salechnlcode = salechnlcode;
        this.riskcode = riskcode;
        this.managecom = managecom;
        this.managecomgrade = managecomgrade;
        this.managecomname = managecomname;
        this.upmanagecom = upmanagecom;
        this.upmanagecomname = upmanagecomname;
        this.rcvprem3M = rcvprem3M;
        this.paidprem3M = paidprem3M;
        this.rcvcontnum3M = rcvcontnum3M;
        this.paidcontnum3M = paidcontnum3M;
        this.rcvprem7M = rcvprem7M;
        this.paidprem7M = paidprem7M;
        this.rcvcontnum7M = rcvcontnum7M;
        this.paidcontnum7M = paidcontnum7M;
        this.rcvprem13M = rcvprem13M;
        this.paidprem13M = paidprem13M;
        this.rcvcontnum13M = rcvcontnum13M;
        this.paidcontnum13M = paidcontnum13M;
        this.rcvprem25M = rcvprem25M;
        this.paidprem25M = paidprem25M;
        this.rcvcontnum25M = rcvcontnum25M;
        this.paidcontnum25M = paidcontnum25M;
        this.rcvprem3Y = rcvprem3Y;
        this.paidprem3Y = paidprem3Y;
        this.rcvcontnum3Y = rcvcontnum3Y;
        this.paidcontnum3Y = paidcontnum3Y;
        this.rcvprem7Y = rcvprem7Y;
        this.paidprem7Y = paidprem7Y;
        this.rcvcontnum7Y = rcvcontnum7Y;
        this.paidcontnum7Y = paidcontnum7Y;
        this.rcvprem13Y = rcvprem13Y;
        this.paidprem13Y = paidprem13Y;
        this.rcvcontnum13Y = rcvcontnum13Y;
        this.paidcontnum13Y = paidcontnum13Y;
        this.rcvprem25Y = rcvprem25Y;
        this.paidprem25Y = paidprem25Y;
        this.rcvcontnum25Y = rcvcontnum25Y;
        this.paidcontnum25Y = paidcontnum25Y;
    }

    public Rate() {
        super();
    }

    public Date getDatadate() {
        return datadate;
    }

    public void setDatadate(Date datadate) {
        this.datadate = datadate;
    }

    public String getSalechnlcode() {
        return salechnlcode;
    }

    public void setSalechnlcode(String salechnlcode) {
        this.salechnlcode = salechnlcode == null ? null : salechnlcode.trim();
    }

    public String getRiskcode() {
        return riskcode;
    }

    public void setRiskcode(String riskcode) {
        this.riskcode = riskcode == null ? null : riskcode.trim();
    }

    public String getManagecom() {
        return managecom;
    }

    public void setManagecom(String managecom) {
        this.managecom = managecom == null ? null : managecom.trim();
    }

    public String getManagecomgrade() {
        return managecomgrade;
    }

    public void setManagecomgrade(String managecomgrade) {
        this.managecomgrade = managecomgrade == null ? null : managecomgrade.trim();
    }

    public String getManagecomname() {
        return managecomname;
    }

    public void setManagecomname(String managecomname) {
        this.managecomname = managecomname == null ? null : managecomname.trim();
    }

    public String getUpmanagecom() {
        return upmanagecom;
    }

    public void setUpmanagecom(String upmanagecom) {
        this.upmanagecom = upmanagecom == null ? null : upmanagecom.trim();
    }

    public String getUpmanagecomname() {
        return upmanagecomname;
    }

    public void setUpmanagecomname(String upmanagecomname) {
        this.upmanagecomname = upmanagecomname == null ? null : upmanagecomname.trim();
    }

    public BigDecimal getRcvprem3M() {
        return rcvprem3M;
    }

    public void setRcvprem3M(BigDecimal rcvprem3M) {
        this.rcvprem3M = rcvprem3M;
    }

    public BigDecimal getPaidprem3M() {
        return paidprem3M;
    }

    public void setPaidprem3M(BigDecimal paidprem3M) {
        this.paidprem3M = paidprem3M;
    }

    public BigDecimal getRcvcontnum3M() {
        return rcvcontnum3M;
    }

    public void setRcvcontnum3M(BigDecimal rcvcontnum3M) {
        this.rcvcontnum3M = rcvcontnum3M;
    }

    public BigDecimal getPaidcontnum3M() {
        return paidcontnum3M;
    }

    public void setPaidcontnum3M(BigDecimal paidcontnum3M) {
        this.paidcontnum3M = paidcontnum3M;
    }

    public BigDecimal getRcvprem7M() {
        return rcvprem7M;
    }

    public void setRcvprem7M(BigDecimal rcvprem7M) {
        this.rcvprem7M = rcvprem7M;
    }

    public BigDecimal getPaidprem7M() {
        return paidprem7M;
    }

    public void setPaidprem7M(BigDecimal paidprem7M) {
        this.paidprem7M = paidprem7M;
    }

    public BigDecimal getRcvcontnum7M() {
        return rcvcontnum7M;
    }

    public void setRcvcontnum7M(BigDecimal rcvcontnum7M) {
        this.rcvcontnum7M = rcvcontnum7M;
    }

    public BigDecimal getPaidcontnum7M() {
        return paidcontnum7M;
    }

    public void setPaidcontnum7M(BigDecimal paidcontnum7M) {
        this.paidcontnum7M = paidcontnum7M;
    }

    public BigDecimal getRcvprem13M() {
        return rcvprem13M;
    }

    public void setRcvprem13M(BigDecimal rcvprem13M) {
        this.rcvprem13M = rcvprem13M;
    }

    public BigDecimal getPaidprem13M() {
        return paidprem13M;
    }

    public void setPaidprem13M(BigDecimal paidprem13M) {
        this.paidprem13M = paidprem13M;
    }

    public BigDecimal getRcvcontnum13M() {
        return rcvcontnum13M;
    }

    public void setRcvcontnum13M(BigDecimal rcvcontnum13M) {
        this.rcvcontnum13M = rcvcontnum13M;
    }

    public BigDecimal getPaidcontnum13M() {
        return paidcontnum13M;
    }

    public void setPaidcontnum13M(BigDecimal paidcontnum13M) {
        this.paidcontnum13M = paidcontnum13M;
    }

    public BigDecimal getRcvprem25M() {
        return rcvprem25M;
    }

    public void setRcvprem25M(BigDecimal rcvprem25M) {
        this.rcvprem25M = rcvprem25M;
    }

    public BigDecimal getPaidprem25M() {
        return paidprem25M;
    }

    public void setPaidprem25M(BigDecimal paidprem25M) {
        this.paidprem25M = paidprem25M;
    }

    public BigDecimal getRcvcontnum25M() {
        return rcvcontnum25M;
    }

    public void setRcvcontnum25M(BigDecimal rcvcontnum25M) {
        this.rcvcontnum25M = rcvcontnum25M;
    }

    public BigDecimal getPaidcontnum25M() {
        return paidcontnum25M;
    }

    public void setPaidcontnum25M(BigDecimal paidcontnum25M) {
        this.paidcontnum25M = paidcontnum25M;
    }

    public BigDecimal getRcvprem3Y() {
        return rcvprem3Y;
    }

    public void setRcvprem3Y(BigDecimal rcvprem3Y) {
        this.rcvprem3Y = rcvprem3Y;
    }

    public BigDecimal getPaidprem3Y() {
        return paidprem3Y;
    }

    public void setPaidprem3Y(BigDecimal paidprem3Y) {
        this.paidprem3Y = paidprem3Y;
    }

    public BigDecimal getRcvcontnum3Y() {
        return rcvcontnum3Y;
    }

    public void setRcvcontnum3Y(BigDecimal rcvcontnum3Y) {
        this.rcvcontnum3Y = rcvcontnum3Y;
    }

    public BigDecimal getPaidcontnum3Y() {
        return paidcontnum3Y;
    }

    public void setPaidcontnum3Y(BigDecimal paidcontnum3Y) {
        this.paidcontnum3Y = paidcontnum3Y;
    }

    public BigDecimal getRcvprem7Y() {
        return rcvprem7Y;
    }

    public void setRcvprem7Y(BigDecimal rcvprem7Y) {
        this.rcvprem7Y = rcvprem7Y;
    }

    public BigDecimal getPaidprem7Y() {
        return paidprem7Y;
    }

    public void setPaidprem7Y(BigDecimal paidprem7Y) {
        this.paidprem7Y = paidprem7Y;
    }

    public BigDecimal getRcvcontnum7Y() {
        return rcvcontnum7Y;
    }

    public void setRcvcontnum7Y(BigDecimal rcvcontnum7Y) {
        this.rcvcontnum7Y = rcvcontnum7Y;
    }

    public BigDecimal getPaidcontnum7Y() {
        return paidcontnum7Y;
    }

    public void setPaidcontnum7Y(BigDecimal paidcontnum7Y) {
        this.paidcontnum7Y = paidcontnum7Y;
    }

    public BigDecimal getRcvprem13Y() {
        return rcvprem13Y;
    }

    public void setRcvprem13Y(BigDecimal rcvprem13Y) {
        this.rcvprem13Y = rcvprem13Y;
    }

    public BigDecimal getPaidprem13Y() {
        return paidprem13Y;
    }

    public void setPaidprem13Y(BigDecimal paidprem13Y) {
        this.paidprem13Y = paidprem13Y;
    }

    public BigDecimal getRcvcontnum13Y() {
        return rcvcontnum13Y;
    }

    public void setRcvcontnum13Y(BigDecimal rcvcontnum13Y) {
        this.rcvcontnum13Y = rcvcontnum13Y;
    }

    public BigDecimal getPaidcontnum13Y() {
        return paidcontnum13Y;
    }

    public void setPaidcontnum13Y(BigDecimal paidcontnum13Y) {
        this.paidcontnum13Y = paidcontnum13Y;
    }

    public BigDecimal getRcvprem25Y() {
        return rcvprem25Y;
    }

    public void setRcvprem25Y(BigDecimal rcvprem25Y) {
        this.rcvprem25Y = rcvprem25Y;
    }

    public BigDecimal getPaidprem25Y() {
        return paidprem25Y;
    }

    public void setPaidprem25Y(BigDecimal paidprem25Y) {
        this.paidprem25Y = paidprem25Y;
    }

    public BigDecimal getRcvcontnum25Y() {
        return rcvcontnum25Y;
    }

    public void setRcvcontnum25Y(BigDecimal rcvcontnum25Y) {
        this.rcvcontnum25Y = rcvcontnum25Y;
    }

    public BigDecimal getPaidcontnum25Y() {
        return paidcontnum25Y;
    }

    public void setPaidcontnum25Y(BigDecimal paidcontnum25Y) {
        this.paidcontnum25Y = paidcontnum25Y;
    }
}