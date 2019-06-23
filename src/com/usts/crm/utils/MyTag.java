package com.usts.crm.utils;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTag extends TagSupport {
	
	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = super.pageContext.getOut();
		try {
			out.print("<span>这个是自定义标签输出的内容<span>");
			out.print("<h1>这个是自定义标签输出的大标题<h1>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}

}
