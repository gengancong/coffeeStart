package com.coffee.study.course;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class ExerciseListMap {

	static final Logger logger = LoggerFactory.getLogger(ExerciseListMap.class);

	private static List<Map<String, String>> list = new ArrayList<Map<String, String>>();

	public static void main(String[] args) {
		initList();
		printList();
	}

	private static void initList() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("enCode", "ASF");
		map.put("inDate", "2014-09-24");
		map.put("rate", "0.87684663");
		list.add(map);

		map = new HashMap<String, String>();
		map.put("enCode", "ATS");
		map.put("inDate", "2014-09-24");
		map.put("rate", "0.06359000");
		list.add(map);
	}

	private static void printList() {
		if (list != null && list.size() > 0) {
			for (Map<String, String> map : list) {
				StringBuilder sb = new StringBuilder();
				sb.append(map.get("enCode")).append("\t");
				sb.append(map.get("inDate")).append("\t");
				sb.append(map.get("rate"));
				logger.info(sb.toString());
			}
		}
	}

}
