package org.json.business.entity;

public class NewlyAdded {

	//����Ȩ�ͻ���Ϣ�����ӿ�
	private String mspId;
	private String operTime;
	private NewlyAddedData data;
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
	public NewlyAddedData getData() {
		return data;
	}
	public void setData(NewlyAddedData data) {
		this.data = data;
	}
	
}
