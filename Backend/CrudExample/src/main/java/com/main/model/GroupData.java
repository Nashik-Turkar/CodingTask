package com.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class GroupData {

//	@Id
	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")	
	private String groupid;
	private String groupname;
	private String grule;
	private String gdescr;
	private String gindusty;
	private String glocation;
	private String gdiscoverability;
	private String permission;

	public String getGroupid() {
		return groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public String getGrule() {
		return grule;
	}

	public void setGrule(String grule) {
		this.grule = grule;
	}

	public String getGdescr() {
		return gdescr;
	}

	public void setGdescr(String gdescr) {
		this.gdescr = gdescr;
	}

	public String getGindusty() {
		return gindusty;
	}

	public void setGindusty(String gindusty) {
		this.gindusty = gindusty;
	}

	public String getGlocation() {
		return glocation;
	}

	public void setGlocation(String glocation) {
		this.glocation = glocation;
	}

	public String getGdiscoverability() {
		return gdiscoverability;
	}

	public void setGdiscoverability(String gdiscoverability) {
		this.gdiscoverability = gdiscoverability;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

}
