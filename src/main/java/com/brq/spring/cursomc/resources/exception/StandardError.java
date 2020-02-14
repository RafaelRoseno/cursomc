package com.brq.spring.cursomc.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Long timesetup;
	
	public StandardError(Integer status, String msg, Long timesetup) {
		super();
		this.status = status;
		this.msg = msg;
		this.timesetup = timesetup;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getTimesetup() {
		return timesetup;
	}

	public void setTimesetup(Long timesetup) {
		this.timesetup = timesetup;
	}
	
	
	
	

}
