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

import java.util.regex.Pattern;

/**
 * The Class VersionMatchers.
 */
public final class VersionMatchers {

	/** The Constant MSIE_VERSION. */
	public static final Pattern MSIE_VER = Pattern.compile("MSIE \\d+");

	/** The Constant FIREFOX_VERSION. */
	public static final Pattern FIREFOX_VER = Pattern
			.compile("Firefox\\W+\\d+");

	/** The Constant CHROME_VERSION. */
	public static final Pattern CHROME_VER = Pattern.compile("Chrome\\W+\\d+");

	/** The Constant EDGE_VERSION. */
	public static final Pattern EDGE_VER = Pattern.compile("Edge\\W+\\d+");

	/** The Constant SEAMONKEY_VERSION. */
	public static final Pattern SEAM_VER = Pattern.compile("SeaMonkey\\W+\\d+");

	/** The Constant SAFARI_VERSION. */
	public static final Pattern SAFARI_VER = Pattern.compile("Safari\\W+\\d+");

	/** The Constant CHROMIUM_VERSION. */
	public static final Pattern CHROMIUM_VER = Pattern
			.compile("Chromium\\W+\\d+");

	/** The Constant OPERA_VERSION. */
	public static final Pattern OPERA_VER = Pattern.compile("Opera\\W+\\d+");

	/** The Constant MISC_VERSION. */
	public static final Pattern MISC_VER = Pattern.compile("Version\\W+\\d+");

}
