package org.ccsl.gen.ocl.services;

import org.apache.commons.lang3.StringUtils;

public class StringService {

	public static int countMatches(String str, String word) {
		return StringUtils.countMatches(str, word);
	}
}
