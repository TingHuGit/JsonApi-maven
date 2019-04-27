package org.tinghu.business.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.tinghu.business.util.BaseEntity;

public class Fact_sjqt_riskprem extends BaseEntity{

	private static final long serialVersionUID = 1L;

	private String datadate;

    private Long inx;

    private String xh;

    private String inxbm;

    private String name;

    private String riskname;

    private BigDecimal prem;

    private BigDecimal standprem;

    private String datasource;

    private String reportdept;

    private String unit;

    private String currency;

    private Date makedate;

    private String freq;

    public Fact_sjqt_riskprem(String datadate, Long inx, String xh, String inxbm, String name, String riskname, BigDecimal prem, BigDecimal standprem, String datasource, String reportdept, String unit, String currency, Date makedate, String freq) {
        this.datadate = datadate;
        this.inx = inx;
        this.xh = xh;
        this.inxbm = inxbm;
        this.name = name;
        this.riskname = riskname;
        this.prem = prem;
        this.standprem = standprem;
        this.datasource = datasource;
        this.reportdept = reportdept;
        this.unit = unit;
        this.currency = currency;
        this.makedate = makedate;
        this.freq = freq;
    }

    public Fact_sjqt_riskprem() {
        super();
    }

    public String getDatadate() {
        return datadate;
    }

    public void setDatadate(String datadate) {
        this.datadate = datadate == null ? null : datadate.trim();
    }

    public Long getInx() {
        return inx;
    }

    public void setInx(Long inx) {
        this.inx = inx;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getInxbm() {
        return inxbm;
    }

    public void setInxbm(String inxbm) {
        this.inxbm = inxbm == null ? null : inxbm.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRiskname() {
        return riskname;
    }

    public void setRiskname(String riskname) {
        this.riskname = riskname == null ? null : riskname.trim();
    }

    public BigDecimal getPrem() {
        return prem;
    }

    public void setPrem(BigDecimal prem) {
        this.prem = prem;
    }

    public BigDecimal getStandprem() {
        return standprem;
    }

    public void setStandprem(BigDecimal standprem) {
        this.standprem = standprem;
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource == null ? null : datasource.trim();
    }

    public String getReportdept() {
        return reportdept;
    }

    public void setReportdept(String reportdept) {
        this.reportdept = reportdept == null ? null : reportdept.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public Date getMakedate() {
        return makedate;
    }

    public void setMakedate(Date makedate) {
        this.makedate = makedate;
    }

    public String getFreq() {
        return freq;
    }

    public void setFreq(String freq) {
        this.freq = freq == null ? null : freq.trim();
    }
    
}