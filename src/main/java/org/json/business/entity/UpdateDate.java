package org.json.business.entity;

public class UpdateDate {
	private String id;
	private String idType;
	private String name;
	private UpdateDateProvider provider;
	private UpdateDateFile file;
	private UpdateDateDevice device;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UpdateDateProvider getProvider() {
		return provider;
	}
	public void setProvider(UpdateDateProvider provider) {
		this.provider = provider;
	}
	public UpdateDateFile getFile() {
		return file;
	}
	public void setFile(UpdateDateFile file) {
		this.file = file;
	}
	public UpdateDateDevice getDevice() {
		return device;
	}
	public void setDevice(UpdateDateDevice device) {
		this.device = device;
	}
	
	
	
}
