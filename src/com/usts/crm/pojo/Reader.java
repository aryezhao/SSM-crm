package com.usts.crm.pojo;

public class Reader {
	//dept，phone，regdat，limit，maxborrownum，type，typename
	private Long readerid;   //读者id
	private String name;     //姓名
	private String sex;      //性别
	private int age;          //年龄
	private String dept;     //
	private String phone;   //电话
	private String regdat;  //
	private String limit;   //是否超期
	private int maxborrownum;   //最大借阅量
	private String type;    //类型
	private String typename;  //类别名称
	public Long getReaderid() {
		return readerid;
	}
	public void setReaderid(Long readerid) {
		this.readerid = readerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRegdat() {
		return regdat;
	}
	public void setRegdat(String regdat) {
		this.regdat = regdat;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	
	public int getMaxborrownum() {
		return maxborrownum;
	}
	public void setMaxborrownum(int maxborrownum) {
		this.maxborrownum = maxborrownum;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}


}
