package com.coffee.study.course;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 打印输出下列格式数据。
 * ASF	2014-09-24	0.87684663
 * ATS	2014-09-24	0.06359000
 * AUD	2014-09-24	0.87630000
 * BEF	2014-09-24	0.02169000
 * BRL	2014-09-24	0.41743196
 */
public class ExerciseListBean {

	static final Logger logger = LoggerFactory.getLogger(ExerciseListBean.class);

	private static List<Rate> list = new ArrayList<Rate>();

	public static void main(String[] args) {
		initList();
		printList();
	}

	private static void initList() {
		Rate rate = new Rate();
		rate.setEnCode("ASF");
		rate.setInDate("2014-09-24");
		rate.setRate("0.87684663");
		list.add(rate);
		rate = new Rate("ATS", "2014-09-24", "0.06359000");
		list.add(rate);
	}

	private static void printList() {
		if (list != null && list.size() > 0) {
			for (Rate rate : list) {
				logger.info(rate.toString());
			}
		}
	}

}

class Rate {

	private String enCode;
	private String inDate;
	private String rate;

	public Rate() {
	}

	public Rate(String enCode, String inDate, String rate) {
		this.enCode = enCode;
		this.inDate = inDate;
		this.rate = rate;
	}

	public String getEnCode() {
		return enCode;
	}

	public void setEnCode(String enCode) {
		this.enCode = enCode;
	}

	public String getInDate() {
		return inDate;
	}

	public void setInDate(String inDate) {
		this.inDate = inDate;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(enCode).append("\t");
		sb.append(inDate).append("\t");
		sb.append(rate);
		return sb.toString();
	}

}
