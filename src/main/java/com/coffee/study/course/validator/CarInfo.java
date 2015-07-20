package com.coffee.study.course.validator;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.SafeHtml;
import org.hibernate.validator.constraints.SafeHtml.WhiteListType;
import org.hibernate.validator.constraints.URL;

public class CarInfo {

	/** Boolean, boolean */
	@AssertFalse(message = "field1只能为false!")
	private Boolean field1;
	@AssertTrue(message = "field2只能为true!")
	private Boolean field2;

	/**
	 * BigDecimal, BigInteger, String, byte, short, int, long and the respective
	 * wrappers of the primitive types. Additionally supported by HV: any
	 * sub-type of Number.
	 */
	@DecimalMax(value = "30000", message = "field3必须小于或等于30000!")
	private Long field3;
	@DecimalMin(value = "30000", message = "field4必须大于或等于30000!")
	private Long field4;
	@Digits(integer = 5, fraction = 2, message = "field5数字的值超出了允许范围(只允许在5位整数和2位小数范围内)!")
	private Long field5;

	/**
	 * java.util.Date, java.util.Calendar; Additionally supported by HV, if the
	 * Joda Time date/time API is on the class path: any implementations of
	 * ReadablePartial and ReadableInstant.
	 */
	@Future(message = "field6需要是一个将来的时间!")
	private Date field6;
	@Past(message = "field7需要是一个过去的时间!")
	private Date field7;

	/**
	 * BigDecimal, BigInteger, byte, short, int, long and the respective
	 * wrappers of the primitive types. Additionally supported by HV: String
	 * (the numeric value represented by a String is evaluated), any sub-type of
	 * Number.
	 */
	@Max(value = 500, message = "field8最大不能超过500!")
	private Long field8;
	@Min(value = 500, message = "field9最小不能小于500!")
	private Long field9;

	/** Any type */
	@NotNull(message = "field10不能为null!")
	private String field10;
	@Null(message = "field11必须为null!")
	private String field11;

	/** String */
	@Pattern(regexp = "", flags = {})
	private String field12;

	/** String, Collection, Map and arrays */
	@Size(min = 2, max = 14, message = "field13个数必须在2和14之间!")
	private String field13;

	/** Any non-primitive type */
	@Valid
	private Object field14;

	/** String */
	@CreditCardNumber(message = "field21不合法的信用卡号码!")
	private String field21;
	@Email(message = "field22不是一个合法的电子邮件地址!")
	private String field22;
	@Length(min = 4, max = 10, message = "field23长度需要在2和10之间!")
	private String field23;
	@NotBlank(message = "field24不能为空!")
	private String field24;

	/** String, Collection, Map and arrays */
	@NotEmpty(message = "field25不能为空!")
	private String field25;

	/**
	 * BigDecimal, BigInteger, String, byte, short, int, long and the respective
	 * wrappers of the primitive types
	 */
	@Range(min = 2, max = 20)
	private String field26;

	/** CharSequence */
	@SafeHtml(whitelistType = WhiteListType.SIMPLE_TEXT, additionalTags = {})
	private String field27;

	/** Any type */
	// @ScriptAssert(lang = "", script = "", alias = "")
	private Object field28;

	/** String */
	@URL(protocol = "", host = "", port = 8080, regexp = "", flags = {})
	private String field29;

	public CarInfo() {
	}

	public Boolean getField1() {
		return field1;
	}

	public void setField1(Boolean field1) {
		this.field1 = field1;
	}

	public Boolean getField2() {
		return field2;
	}

	public void setField2(Boolean field2) {
		this.field2 = field2;
	}

	public Long getField3() {
		return field3;
	}

	public void setField3(Long field3) {
		this.field3 = field3;
	}

	public Long getField4() {
		return field4;
	}

	public void setField4(Long field4) {
		this.field4 = field4;
	}

	public Long getField5() {
		return field5;
	}

	public void setField5(Long field5) {
		this.field5 = field5;
	}

	public Date getField6() {
		return field6;
	}

	public void setField6(Date field6) {
		this.field6 = field6;
	}

	public Date getField7() {
		return field7;
	}

	public void setField7(Date field7) {
		this.field7 = field7;
	}

	public Long getField8() {
		return field8;
	}

	public void setField8(Long field8) {
		this.field8 = field8;
	}

	public Long getField9() {
		return field9;
	}

	public void setField9(Long field9) {
		this.field9 = field9;
	}

	public String getField10() {
		return field10;
	}

	public void setField10(String field10) {
		this.field10 = field10;
	}

	public String getField11() {
		return field11;
	}

	public void setField11(String field11) {
		this.field11 = field11;
	}

	public String getField12() {
		return field12;
	}

	public void setField12(String field12) {
		this.field12 = field12;
	}

	public String getField13() {
		return field13;
	}

	public void setField13(String field13) {
		this.field13 = field13;
	}

	public Object getField14() {
		return field14;
	}

	public void setField14(Object field14) {
		this.field14 = field14;
	}

	public String getField21() {
		return field21;
	}

	public void setField21(String field21) {
		this.field21 = field21;
	}

	public String getField22() {
		return field22;
	}

	public void setField22(String field22) {
		this.field22 = field22;
	}

	public String getField24() {
		return field24;
	}

	public void setField24(String field24) {
		this.field24 = field24;
	}

	public String getField23() {
		return field23;
	}

	public void setField23(String field23) {
		this.field23 = field23;
	}

	public String getField25() {
		return field25;
	}

	public void setField25(String field25) {
		this.field25 = field25;
	}

	public String getField26() {
		return field26;
	}

	public void setField26(String field26) {
		this.field26 = field26;
	}

	public String getField27() {
		return field27;
	}

	public void setField27(String field27) {
		this.field27 = field27;
	}

	public Object getField28() {
		return field28;
	}

	public void setField28(Object field28) {
		this.field28 = field28;
	}

	public String getField29() {
		return field29;
	}

	public void setField29(String field29) {
		this.field29 = field29;
	}
}
