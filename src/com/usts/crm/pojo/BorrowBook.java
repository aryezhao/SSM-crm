package com.usts.crm.pojo;

import java.util.Date;

public class BorrowBook {
	
	private Long readerid;
	private Long ISBN;
	private Date borrowdate;
	private Date returndate;
	private String fine;
	public Long getReaderid() {
		return readerid;
	}
	public void setReaderid(Long readerid) {
		this.readerid = readerid;
	}
	public Long getISBN() {
		return ISBN;
	}
	public void setISBN(Long iSBN) {
		ISBN = iSBN;
	}
	public Date getBorrowdate() {
		return borrowdate;
	}
	public void setBorrowdate(Date borrowdate) {
		this.borrowdate = borrowdate;
	}
	public Date getReturndate() {
		return returndate;
	}
	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}
	public String getFine() {
		return fine;
	}
	public void setFine(String fine) {
		this.fine = fine;
	}
}
