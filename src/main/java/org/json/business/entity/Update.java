package org.json.business.entity;

public class Update {

	//����Ȩ�ͻ���Ϣ���½ӿ�
	private String mspId;
	private String operTime;
	private UpdateDate data;
	public String getMspId() {
		return mspId;
	}
	public void setMspId(String mspId) {
		this.mspId = mspId;
	}
	public String getOperTime() {
		return operTime;
	}
	public void setOperTime(String operTime) {
		this.operTime = operTime;
	}
	public UpdateDate getData() {
		return data;
	}
	public void setData(UpdateDate data) {
		this.data = data;
	}	
}
