package org.json.business.entity;

public class Apply {

	//�ɷ�����˽��Ϣ����
	private String id;
	private String idType;
	private String fromMspId;
	private ApplyDate date;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdType() {
		switch (idType) {
		case "11":
			return "1";
		case "12":
			return "6";
		case "13":
			return "8";
		case "14":
			return "3";
		case "15":
			return "3";
		case "16":
			return "3";
		case "17":
			return "2";
		case "18":
			return "8";
		case "19":
			return "8";
		case "20":
			return "8";
		case "21":
			return "8";
		case "22":
			return "4";
		case "23":
			return "T";
		case "24":
			return "2";
		case "25":
			return "8";
		case "26":
			return "5";
		case "27":
			return "8";
		case "28":
			return "8";
		case "29":
			return "8";
		case "30":
			return "M";
		default:
			return idType;
		}
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getFromMspId() {
		return fromMspId;
	}
	public void setFromMspId(String fromMspId) {
		this.fromMspId = fromMspId;
	}
	public ApplyDate getDate() {
		return date;
	}
	public void setDate(ApplyDate date) {
		this.date = date;
	}
	

}
