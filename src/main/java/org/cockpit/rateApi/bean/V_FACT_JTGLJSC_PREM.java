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
public class V_FACT_JTGLJSC_PREM {

	private String datadate;
	private String tarid;
	private String freid;
	private String curid;
	private String orgid;
	private String salechnl;
	private String subchnl;
	private String payintv;
	private String prem;
	
	
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

	public String getSubchnl() {
		return subchnl;
	}

	public void setSubchnl(String subchnl) {
		this.subchnl = subchnl;
	}

	public String getPayintv() {
		return payintv;
	}

	public void setPayintv(String payintv) {
		this.payintv = payintv;
	}

	public String getPrem() {
		return prem;
	}

	public void setPrem(String prem) {
		this.prem = prem;
	}

	public V_FACT_JTGLJSC_PREM() {
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
	 * @param subchnl
	 * @param payintv
	 * @param prem
	 */
	public V_FACT_JTGLJSC_PREM(String datadate, String tarid, String freid, String curid, String orgid, String salechnl,
			String subchnl, String payintv, String prem) {
		super();
		this.datadate = datadate;
		this.tarid = tarid;
		this.freid = freid;
		this.curid = curid;
		this.orgid = orgid;
		this.salechnl = salechnl;
		this.subchnl = subchnl;
		this.payintv = payintv;
		this.prem = prem;
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
		if (subchnl == null) {
			subchnl = "";
		}
		
		if (payintv == null) {
			payintv = "";
		}
		if (prem == null) {
			prem = "";
		}
		
		return datadate + "|+|" + tarid + "|+|" + curid + "|+|" + orgid + "|+|" + salechnl + "|+|" + subchnl
				+ "|+|" + payintv + "|+|" + prem;
	}
}
