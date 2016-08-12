package com.sibennayak.identify;

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
import com.sibennayak.identify.model.Browser;
import com.sibennayak.identify.model.UserAgent;

/**
 * The Class UaIdentify.
 */
public final class UaIdentify {

	/**
	 * Prevent object creation.
	 */
	private UaIdentify() {
	}

	/**
	 * Gets the browser information from a given user-agent string.
	 *
	 * @param userAgentString
	 *            the user agent string
	 * @return the browser
	 */
	public static final Browser getBrowser(final String userAgentString) {
		UserAgent userAgent = new UserAgent(userAgentString);
		return userAgent.getBrowser();
	}

}
