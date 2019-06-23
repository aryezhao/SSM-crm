package com.usts.crm.pojo;

import java.util.Date;

/**
 * 图书馆管理系统--图书实体类
 */
public class Book {
	
	private Long ISBN;        //图书编号
	private Long typeid;      //条形码号
	private String bookname;  //书名
	private String author;    //作者
	private String publish;   //出版社
	private Date pubilishdate;  //出版日期
	private String printtime;   //借阅次数
	private String unitprice;   //借阅状态
	private String typename;    //类别
	public Long getISBN() {
		return ISBN;
	}
	public void setISBN(Long iSBN) {
		ISBN = iSBN;
	}
	public Long getTypeid() {
		return typeid;
	}
	public void setTypeid(Long typeid) {
		this.typeid = typeid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public Date getPubilishdate() {
		return pubilishdate;
	}
	public void setPubilishdate(Date pubilishdate) {
		this.pubilishdate = pubilishdate;
	}
	public String getPrinttime() {
		return printtime;
	}
	public void setPrinttime(String printtime) {
		this.printtime = printtime;
	}
	public String getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(String unitprice) {
		this.unitprice = unitprice;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	

}
