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
public class V_FACT_JTGLJSC_RENEWALRATE {

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
	private String paidprem_3_m;
	private String rcvprem_3_m;
	private String paidprem_7_m;
	private String rcvprem_7_m;
	private String paidprem_13_m;
	private String rcvprem_13_m;
	private String paidprem_25_m;
	private String rcvprem_25_m;
	private String paidprem_3_y;
	private String rcvprem_3_y;
	private String paidprem_7_y;
	private String rcvprem_7_y;
	private String paidprem_13_y;
	private String rcvprem_13_y;
	private String paidprem_25_y;
	private String rcvprem_25_y;

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

	public String getPaidprem_3_m() {
		return paidprem_3_m;
	}

	public void setPaidprem_3_m(String paidprem_3_m) {
		this.paidprem_3_m = paidprem_3_m;
	}

	public String getRcvprem_3_m() {
		return rcvprem_3_m;
	}

	public void setRcvprem_3_m(String rcvprem_3_m) {
		this.rcvprem_3_m = rcvprem_3_m;
	}

	public String getPaidprem_7_m() {
		return paidprem_7_m;
	}

	public void setPaidprem_7_m(String paidprem_7_m) {
		this.paidprem_7_m = paidprem_7_m;
	}

	public String getRcvprem_7_m() {
		return rcvprem_7_m;
	}

	public void setRcvprem_7_m(String rcvprem_7_m) {
		this.rcvprem_7_m = rcvprem_7_m;
	}

	public String getPaidprem_13_m() {
		return paidprem_13_m;
	}

	public void setPaidprem_13_m(String paidprem_13_m) {
		this.paidprem_13_m = paidprem_13_m;
	}

	public String getRcvprem_13_m() {
		return rcvprem_13_m;
	}

	public void setRcvprem_13_m(String rcvprem_13_m) {
		this.rcvprem_13_m = rcvprem_13_m;
	}

	public String getPaidprem_25_m() {
		return paidprem_25_m;
	}

	public void setPaidprem_25_m(String paidprem_25_m) {
		this.paidprem_25_m = paidprem_25_m;
	}

	public String getRcvprem_25_m() {
		return rcvprem_25_m;
	}

	public void setRcvprem_25_m(String rcvprem_25_m) {
		this.rcvprem_25_m = rcvprem_25_m;
	}

	public String getPaidprem_3_y() {
		return paidprem_3_y;
	}

	public void setPaidprem_3_y(String paidprem_3_y) {
		this.paidprem_3_y = paidprem_3_y;
	}

	public String getRcvprem_3_y() {
		return rcvprem_3_y;
	}

	public void setRcvprem_3_y(String rcvprem_3_y) {
		this.rcvprem_3_y = rcvprem_3_y;
	}

	public String getPaidprem_7_y() {
		return paidprem_7_y;
	}

	public void setPaidprem_7_y(String paidprem_7_y) {
		this.paidprem_7_y = paidprem_7_y;
	}

	public String getRcvprem_7_y() {
		return rcvprem_7_y;
	}

	public void setRcvprem_7_y(String rcvprem_7_y) {
		this.rcvprem_7_y = rcvprem_7_y;
	}

	public String getPaidprem_13_y() {
		return paidprem_13_y;
	}

	public void setPaidprem_13_y(String paidprem_13_y) {
		this.paidprem_13_y = paidprem_13_y;
	}

	public String getRcvprem_13_y() {
		return rcvprem_13_y;
	}

	public void setRcvprem_13_y(String rcvprem_13_y) {
		this.rcvprem_13_y = rcvprem_13_y;
	}

	public String getPaidprem_25_y() {
		return paidprem_25_y;
	}

	public void setPaidprem_25_y(String paidprem_25_y) {
		this.paidprem_25_y = paidprem_25_y;
	}

	public String getRcvprem_25_y() {
		return rcvprem_25_y;
	}

	public void setRcvprem_25_y(String rcvprem_25_y) {
		this.rcvprem_25_y = rcvprem_25_y;
	}

	/**
	 * 
	 */
	public V_FACT_JTGLJSC_RENEWALRATE() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param orgcode
	 * @param orgname
	 * @param datadate
	 * @param managecom
	 * @param name
	 * @param salechnl
	 * @param salechnlname
	 * @param paidprem_3_m
	 * @param rcvprem_3_m
	 * @param paidprem_7_m
	 * @param rcvprem_7_m
	 * @param paidprem_13_m
	 * @param rcvprem_13_m
	 * @param paidprem_25_m
	 * @param rcvprem_25_m
	 * @param paidprem_3_y
	 * @param rcvprem_3_y
	 * @param paidprem_7_y
	 * @param rcvprem_7_y
	 * @param paidprem_13_y
	 * @param rcvprem_13_y
	 * @param paidprem_25_y
	 * @param rcvprem_25_y
	 */
	public V_FACT_JTGLJSC_RENEWALRATE(String orgcode, String orgname, Date datadate, String managecom, String name,
			String salechnl, String salechnlname, String paidprem_3_m, String rcvprem_3_m, String paidprem_7_m,
			String rcvprem_7_m, String paidprem_13_m, String rcvprem_13_m, String paidprem_25_m, String rcvprem_25_m,
			String paidprem_3_y, String rcvprem_3_y, String paidprem_7_y, String rcvprem_7_y, String paidprem_13_y,
			String rcvprem_13_y, String paidprem_25_y, String rcvprem_25_y) {
		super();
		this.orgcode = orgcode;
		this.orgname = orgname;
		this.datadate = datadate;
		this.managecom = managecom;
		this.name = name;
		this.salechnl = salechnl;
		this.salechnlname = salechnlname;
		this.paidprem_3_m = paidprem_3_m;
		this.rcvprem_3_m = rcvprem_3_m;
		this.paidprem_7_m = paidprem_7_m;
		this.rcvprem_7_m = rcvprem_7_m;
		this.paidprem_13_m = paidprem_13_m;
		this.rcvprem_13_m = rcvprem_13_m;
		this.paidprem_25_m = paidprem_25_m;
		this.rcvprem_25_m = rcvprem_25_m;
		this.paidprem_3_y = paidprem_3_y;
		this.rcvprem_3_y = rcvprem_3_y;
		this.paidprem_7_y = paidprem_7_y;
		this.rcvprem_7_y = rcvprem_7_y;
		this.paidprem_13_y = paidprem_13_y;
		this.rcvprem_13_y = rcvprem_13_y;
		this.paidprem_25_y = paidprem_25_y;
		this.rcvprem_25_y = rcvprem_25_y;
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
		if (paidprem_3_m == null) {
			paidprem_3_m = "";
		}
		if (rcvprem_3_m == null) {
			rcvprem_3_m = "";
		}
		if (paidprem_7_m == null) {
			paidprem_7_m = "";
		}
		if (rcvprem_7_m == null) {
			rcvprem_7_m = "";
		}
		if (paidprem_13_m == null) {
			paidprem_13_m = "";
		}
		if (rcvprem_13_m == null) {
			rcvprem_13_m = "";
		}
		if (paidprem_25_m == null) {
			paidprem_25_m = "";
		}
		if (rcvprem_25_m == null) {
			rcvprem_25_m = "";
		}
		if (paidprem_3_y == null) {
			paidprem_3_y = "";
		}
		if (rcvprem_3_y == null) {
			rcvprem_3_y = "";
		}
		if (paidprem_7_y == null) {
			paidprem_7_y = "";
		}
		if (rcvprem_7_y == null) {
			rcvprem_7_y = "";
		}
		if (paidprem_13_y == null) {
			paidprem_13_y = "";
		}
		if (rcvprem_13_y == null) {
			rcvprem_13_y = "";
		}
		if (salechnlname == null) {
			salechnlname = "";
		}
		if (paidprem_3_m == null) {
			paidprem_3_m = "";
		}
		if (paidprem_7_m == null) {
			paidprem_7_m = "";
		}
		if (rcvprem_7_m == null) {
			rcvprem_7_m = "";
		}
		if (salechnl == null) {
			salechnl = "";
		}
		if (salechnlname == null) {
			salechnlname = "";
		}
		if (paidprem_3_m == null) {
			paidprem_3_m = "";
		}
		if (paidprem_25_y == null) {
			paidprem_25_y = "";
		}
		if (rcvprem_25_y == null) {
			rcvprem_25_y = "";
		}
		
		return orgcode + "|+|" + orgname + "|+|" + datadate + "|+|" + managecom + "|+|" + name + "|+|" + salechnl
				+ "|+|" + salechnlname + "|+|" + paidprem_3_m + "|+|" + rcvprem_3_m + "|+|" + paidprem_7_m + "|+|"
				+ rcvprem_7_m + "|+|" + paidprem_13_m + "|+|" + rcvprem_13_m + "|+|" + paidprem_25_m + "|+|"
				+ rcvprem_25_m + "|+|" + paidprem_3_y + "|+|" + rcvprem_3_y + "|+|" + paidprem_7_y + "|+|" + rcvprem_7_y
				+ "|+|" + paidprem_13_y + "|+|" + rcvprem_13_y + "|+|" + paidprem_25_y + "|+|" + rcvprem_25_y;
	}
}
