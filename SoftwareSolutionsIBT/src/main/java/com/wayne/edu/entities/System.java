package com.wayne.edu.entities;

public class System {
	
	private String name;
	private Integer id;
	private String issueTrackerUrl;
	private String programmingLang;
	private String versionControlUrl;
	   
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setIssueTrackerUrl(String issueTrackerUrl) {
		this.issueTrackerUrl = issueTrackerUrl;
	}
	
	public String getIssueTrackerUrl() {
		return issueTrackerUrl;
	}
	
	public void setProgrammingLang(String programmingLang) {
		this.programmingLang = programmingLang;
	}
	
	public String getProgrammingLang() {
		return programmingLang;
	}
	
	public void setversionControlUrl(String versionControlUrl) {
		this.versionControlUrl = versionControlUrl;
	}
	
	public String getversionControlUrl() {
		return versionControlUrl;
	}

}
