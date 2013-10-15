package com.wayne.edu.entities;

public class System {
	
	private String name;
	private Integer id;
	private String vcsUrl;
	private String issueTrackerUrl;
	private String programmingLang;
	   
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
	
	public void setVCSUrl(String vcsUrl) {
		this.vcsUrl = vcsUrl;
	}
	
	public String getVCSUrl() {
		return vcsUrl;
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

}
