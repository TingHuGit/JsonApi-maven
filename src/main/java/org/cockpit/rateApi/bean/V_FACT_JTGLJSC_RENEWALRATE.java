/**
 * 
 */
package org.cockpit.rateApi.bean;

/**
 * @ClassName: FACT_JTGLJSC_RENEWALRATE
 * @Description:TODO
 * @author: WBSHXZ_HUTING
 * @date: 2019年3月11日 下午3:32:38
 * 
 */
public class V_FACT_JTGLJSC_RENEWALRATE {

	private String datadate;
	private String tarid;
	private String freid;
	private String curid;
	private String orgid;
	private String salechnl;
	private String renewaltype;
	private String renewalprem;
	private String renewalpaidprem;
	private String renewalrcvprem;

	public String getDatadate() {
		return datadate;
	}

	public void setDatadate(String datadate) {
		this.datadate = datadate;
	}

	public String getTarid() {
		return tarid;
	}

	public void setTarid(String tarid) {
		this.tarid = tarid;
	}

	public String getFreid() {
		return freid;
	}

	public void setFreid(String freid) {
		this.freid = freid;
	}

	public String getCurid() {
		return curid;
	}

	public void setCurid(String curid) {
		this.curid = curid;
	}

	public String getOrgid() {
		return orgid;
	}

	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}

	public String getSalechnl() {
		return salechnl;
	}

	public void setSalechnl(String salechnl) {
		this.salechnl = salechnl;
	}

	public String getRenewaltype() {
		return renewaltype;
	}

	public void setRenewaltype(String renewaltype) {
		this.renewaltype = renewaltype;
	}

	public String getRenewalprem() {
		return renewalprem;
	}

	public void setRenewalprem(String renewalprem) {
		this.renewalprem = renewalprem;
	}

	public String getRenewalpaidprem() {
		return renewalpaidprem;
	}

	public void setRenewalpaidprem(String renewalpaidprem) {
		this.renewalpaidprem = renewalpaidprem;
	}

	public String getRenewalrcvprem() {
		return renewalrcvprem;
	}

	public void setRenewalrcvprem(String renewalrcvprem) {
		this.renewalrcvprem = renewalrcvprem;
	}

	/**
	 * 
	 */
	public V_FACT_JTGLJSC_RENEWALRATE() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param datadate
	 * @param tarid
	 * @param freid
	 * @param curid
	 * @param orgid
	 * @param salechnl
	 * @param renewaltype
	 * @param renewalprem
	 * @param renewalpaidprem
	 * @param renewalrcvprem
	 */
	public V_FACT_JTGLJSC_RENEWALRATE(String datadate, String tarid, String freid, String curid, String orgid,
			String salechnl, String renewaltype, String renewalprem, String renewalpaidprem, String renewalrcvprem) {
		super();
		this.datadate = datadate;
		this.tarid = tarid;
		this.freid = freid;
		this.curid = curid;
		this.orgid = orgid;
		this.salechnl = salechnl;
		this.renewaltype = renewaltype;
		this.renewalprem = renewalprem;
		this.renewalpaidprem = renewalpaidprem;
		this.renewalrcvprem = renewalrcvprem;
	}

	@Override
	public String toString() {
		
		if (datadate == null) {
			datadate = "";
		}
		if (tarid == null) {
			tarid = "";
		}
		if (freid == null) {
			freid = "";
		}
		if (curid == null) {
			curid = "";
		}
		if (orgid == null) {
			orgid = "";
		}
		if (salechnl == null) {
			salechnl = "";
		}
		if (renewaltype == null) {
			renewaltype = "";
		}
		if (renewalprem == null) {
			renewalprem = "";
		}
		if (renewalpaidprem == null) {
			renewalpaidprem = "";
		}
		if (renewalrcvprem == null) {
			renewalrcvprem = "";
		}
		
		return datadate + "|+|" + tarid + "|+|" + freid + "|+|" + curid + "|+|" + orgid + "|+|" + salechnl
				+ "|+|" + renewaltype + "|+|" + renewalprem + "|+|" + renewalpaidprem + "|+|" + renewalrcvprem;
	}
}
