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
package com.sibennayak.identify.model;

/**
 * The Class UserAgent.
 */
public final class UserAgent {

	/** The user agent string. */
	private String userAgentString;

	/** The browser. */
	private Browser browser;

	/**
	 * Instantiates a new user agent.
	 *
	 * @param userAgentString
	 *            the user agent string
	 */
	public UserAgent(final String userAgentString) {
		this.userAgentString = userAgentString;
		this.browser = new Browser(userAgentString);
	}

	/**
	 * Gets the user agent string.
	 *
	 * @return the user agent string
	 */
	public String getUserAgentString() {
		return userAgentString;
	}

	/**
	 * Gets the browser.
	 *
	 * @return the browser
	 */
	public Browser getBrowser() {
		return browser;
	}

}
