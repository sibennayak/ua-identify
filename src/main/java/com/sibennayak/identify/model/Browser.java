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

import java.util.regex.Matcher;

import com.sibennayak.identify.matchers.VersionMatchers;
import com.sibennayak.identify.util.Constants;
import com.sibennayak.identify.util.Utils;

/**
 * The Class Browser.
 */
public final class Browser {

	/** The browser name. */
	private String browserName;

	/** The browser version. */
	private String browserVersion;

	/** The rendering engine. */
	private String renderingEngine;

	/**
	 * Instantiates a new browser.
	 *
	 * @param userAgentString
	 *            the user agent string
	 */
	public Browser(final String userAgentString) {
		this.setBrowserNameAndVersion(userAgentString);
	}

	/**
	 * Sets the browser name and version.
	 *
	 * @param userAgentString
	 *            the new browser name and version
	 */
	private void setBrowserNameAndVersion(final String userAgentString) {
		Matcher m = null;
		if (userAgentString.contains(Constants.FIREFOX)
				&& !userAgentString.contains(Constants.SEAMONKEY)) {
			this.browserName = Constants.FIREFOX_NAME;
			m = VersionMatchers.FIREFOX_VER.matcher(userAgentString);
		} else if (userAgentString.contains(Constants.SEAMONKEY)) {
			this.browserName = Constants.SEAMONKEY_NAME;
			m = VersionMatchers.SEAM_VER.matcher(userAgentString);
		} else if (userAgentString.contains(Constants.EDGE)) {
			this.browserName = Constants.EDGE_NAME;
			m = VersionMatchers.EDGE_VER.matcher(userAgentString);
		} else if (userAgentString.contains(Constants.CHROME)
				&& !userAgentString.contains(Constants.CHROMIUM)) {
			this.browserName = Constants.CHROME_NAME;
			m = VersionMatchers.CHROME_VER.matcher(userAgentString);
		} else if (userAgentString.contains(Constants.CHROMIUM)) {
			this.browserName = Constants.CHROMIUM_NAME;
			m = VersionMatchers.CHROMIUM_VER.matcher(userAgentString);
		} else if (userAgentString.contains(Constants.SAFARI)
				&& !userAgentString.contains(Constants.CHROME)
				&& !userAgentString.contains(Constants.CHROMIUM)) {
			this.browserName = Constants.SAFARI_NAME;
			m = VersionMatchers.SAFARI_VER.matcher(userAgentString);
		} else if (userAgentString.contains(Constants.OPERA_NEW)
				|| userAgentString.contains(Constants.OPERA)) {
			this.browserName = Constants.OPERA_NAME;
			m = VersionMatchers.OPERA_VER.matcher(userAgentString);
		} else if (userAgentString.contains(Constants.MSIE)) {
			this.browserName = Constants.MSIE_NAME;
			m = VersionMatchers.MSIE_VER.matcher(userAgentString);
		}
		this.browserVersion = Utils.parseBrowserVersion(m, browserName,
				userAgentString);
	}

	/**
	 * Gets the browser name.
	 *
	 * @return the browser name
	 */
	public String getBrowserName() {
		return browserName;
	}

	/**
	 * Gets the browser version.
	 *
	 * @return the browser version
	 */
	public String getBrowserVersion() {
		return browserVersion;
	}

	/**
	 * Gets the browser name and version.
	 *
	 * @return the browser name and version
	 */
	public String getBrowserNameAndVersion() {
		return browserName + " " + browserVersion;
	}

	/**
	 * Gets the rendering engine.
	 *
	 * @return the rendering engine
	 */
	public String getRenderingEngine() {
		return renderingEngine;
	}

}
