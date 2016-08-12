/*
 * Copyright (c) 2016 Siben Nayak
 * 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.sibennayak.identify.util;

import java.util.regex.Matcher;

import com.sibennayak.identify.matchers.VersionMatchers;

/**
 * A utility class.
 */
public final class Utils {

	/**
	 * Parses the browser version.
	 *
	 * @param matcher
	 *            the matcher
	 * @param browserName
	 *            the browser name
	 * @param userAgentString
	 *            the user agent string
	 * @return the string
	 */
	public static String parseBrowserVersion(final Matcher matcher,
			final String browserName, final String userAgentString) {
		String browserVersion = null;
		Matcher mMatcher = matcher;
		if (mMatcher.find()) {
			browserVersion = userAgentString
					.substring(mMatcher.start(), mMatcher.end())
					.split("(\\W|\\/)")[1];
			if (null != browserVersion
					&& browserName.equals(Constants.SAFARI_NAME)
					|| (browserName.equals(Constants.OPERA_NAME)
							&& Integer.parseInt(browserVersion) < 12)) {
				mMatcher = VersionMatchers.MISC_VER.matcher(userAgentString);
				if (mMatcher.find()) {
					browserVersion = userAgentString
							.substring(mMatcher.start(), mMatcher.end())
							.split("(\\W|\\/)")[1];
				}
			}
		}
		return browserVersion;
	}

}
