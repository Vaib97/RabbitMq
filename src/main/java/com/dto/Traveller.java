package com.dto;

import java.util.Date;

public class Traveller {
	private Long id;

	private String name;
	
	private String source;
	
	private String destination;
	
	private Date startdate;
	
	private Date enddate;
	
	private User user;

	public Traveller() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Traveller [id=" + id + ", name=" + name + ", source=" + source + ", destination=" + destination
				+ ", startdate=" + startdate + ", enddate=" + enddate + ", user=" + user + "]";
	}

	
}
