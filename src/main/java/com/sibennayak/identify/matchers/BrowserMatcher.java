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
package com.sibennayak.identify.matchers;

/**
 * The Class BrowserMatcher.
 */
public class BrowserMatcher {

	/**
	 * Match.
	 *
	 * @param string
	 *            the string
	 * @param match
	 *            the match
	 * @param noMatch
	 *            the no match
	 * @return true, if successful
	 */
	public static boolean match(final String string, final String match,
			final String... noMatch) {
		boolean b = string.contains(match);
		for (String str : noMatch) {
			b = b && !string.contains(str);
		}
		return b;
	}

	/**
	 * Match.
	 *
	 * @param string
	 *            the string
	 * @param match
	 *            the match
	 * @return true, if successful
	 */
	public static boolean match(final String string, final String... match) {
		boolean b = true;
		for (String str : match) {
			b = b && string.contains(str);
		}
		return b;
	}

}
