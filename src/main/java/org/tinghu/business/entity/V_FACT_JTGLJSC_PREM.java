/**
 * 
 */
package org.tinghu.business.entity;

import java.util.Date;

/**
 * @ClassName: FACT_JTGLJSC_RENEWALRATE
 * @Description:TODO
 * @author: WBSHXZ_HUTING
 * @date: 2019��3��11�� ����3:32:38
 * 
 */
public class V_FACT_JTGLJSC_PREM {

	// select
	// orgcode,orgname,datadate,managecom,name,salechnl,salechnlname,paidprem_3_m,
	// rcvprem_3_m,paidprem_7_m,rcvprem_7_m,paidprem_13_m,rcvprem_13_m,paidprem_25_m,rcvprem_25_m
	// ,paidprem_3_y,rcvprem_3_y,paidprem_7_y,rcvprem_7_y,paidprem_13_y,rcvprem_13_y,paidprem_25_y,
	// rcvprem_25_y from V_FACT_JTGLJSC_RENEWALRATE where
	// to_char(datadate,'yyyy-mm-dd') = ?

	private String orgcode;
	private String orgname;
	private Date datadate;
	private String managecom;
	private String name;
	private String salechnl;
	private String salechnlname;
	private String subchnl;
	private String subchnlname;
	private String payintv;
	private String payintvname;
	private String prem_m;
	private String standprem_m;
	private String prem_y;
	private String standprem_y;

	public String getOrgcode() {
		return orgcode;
	}

	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}

	public String getOrgname() {
		return orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}

	public Date getDatadate() {
		return datadate;
	}

	public void setDatadate(Date datadate) {
		this.datadate = datadate;
	}

	public String getManagecom() {
		return managecom;
	}

	public void setManagecom(String managecom) {
		this.managecom = managecom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalechnl() {
		return salechnl;
	}

	public void setSalechnl(String salechnl) {
		this.salechnl = salechnl;
	}

	public String getSalechnlname() {
		return salechnlname;
	}

	public void setSalechnlname(String salechnlname) {
		this.salechnlname = salechnlname;
	}
	
	public String getSubchnl() {
		return subchnl;
	}

	public void setSubchnl(String subchnl) {
		this.subchnl = subchnl;
	}

	public String getSubchnlname() {
		return subchnlname;
	}

	public void setSubchnlname(String subchnlname) {
		this.subchnlname = subchnlname;
	}

	public String getPayintv() {
		return payintv;
	}

	public void setPayintv(String payintv) {
		this.payintv = payintv;
	}

	public String getPayintvname() {
		return payintvname;
	}

	public void setPayintvname(String payintvname) {
		this.payintvname = payintvname;
	}

	public String getPrem_m() {
		return prem_m;
	}

	public void setPrem_m(String prem_m) {
		this.prem_m = prem_m;
	}

	public String getStandprem_m() {
		return standprem_m;
	}

	public void setStandprem_m(String standprem_m) {
		this.standprem_m = standprem_m;
	}

	public String getPrem_y() {
		return prem_y;
	}

	public void setPrem_y(String prem_y) {
		this.prem_y = prem_y;
	}

	public String getStandprem_y() {
		return standprem_y;
	}

	public void setStandprem_y(String standprem_y) {
		this.standprem_y = standprem_y;
	}

	public V_FACT_JTGLJSC_PREM() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {

		if (orgcode == null) {
			orgcode = "";
		}
		if (orgname == null) {
			orgname = "";
		}
		if (managecom == null) {
			managecom = "";
		}
		if (name == null) {
			name = "";
		}
		if (salechnl == null) {
			salechnl = "";
		}
		if (salechnlname == null) {
			salechnlname = "";
		}
		if (salechnlname == null) {
			salechnlname = "";
		}
		if (salechnl == null) {
			salechnl = "";
		}
		if (salechnlname == null) {
			salechnlname = "";
		}
		
		if (subchnl == null) {
			subchnl = "";
		}
		if (subchnlname == null) {
			subchnlname = "";
		}
		if (payintv == null) {
			payintv = "";
		}
		if (payintvname == null) {
			payintvname = "";
		}
		
		if (prem_m == null) {
			prem_m = "";
		}
		if (standprem_m == null) {
			standprem_m = "";
		}
		if (prem_y == null) {
			prem_y = "";
		}
		if (standprem_y == null) {
			standprem_y = "";
		}
		return orgcode + "|+|" + orgname + "|+|" + datadate + "|+|" + managecom + "|+|" + name + "|+|" + salechnl
				+ "|+|" + salechnlname + "|+|" + subchnl + "|+|" + subchnlname + "|+|" + payintv + "|+|"
				+ payintvname + "|+|" + prem_m + "|+|" + standprem_m + "|+|" + prem_y + "|+|"
				+ standprem_y;
	}
}
