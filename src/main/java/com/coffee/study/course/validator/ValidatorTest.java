package com.coffee.study.course.validator;

import java.util.Date;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValidatorTest {

	static final Logger logger = LoggerFactory.getLogger(ValidatorTest.class);

	public static void main(String args[]) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

		Validator validator = factory.getValidator();

		CarInfo car = new CarInfo();
		car.setField1(true);
		car.setField2(false);
		car.setField3(30001L);
		car.setField4(29999L);
		car.setField5(2999999999L);
		car.setField6(new Date(System.currentTimeMillis() - 10000000));
		car.setField7(new Date(System.currentTimeMillis() + 10000000));
		car.setField8(30001L);
		car.setField9(301L);
		car.setField10("");
		car.setField11("ok");
		car.setField13("okdsdddddddddddddddd");

		car.setField21("aaaa");
		car.setField22("aaaa");
		car.setField23("一个");
		car.setField24("1");
		car.setField25("1");
		car.setField26("3");
		car.setField29("https://www.baidu.com/");

		Set<ConstraintViolation<CarInfo>> cvSet = validator.validate(car);

		for (ConstraintViolation<CarInfo> cv : cvSet) {
			logger.info("错误信息:" + cv.getMessage());
		}
	}
}
