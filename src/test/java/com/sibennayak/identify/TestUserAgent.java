package com.sibennayak.identify;

import java.util.ArrayList;
import java.util.List;

import com.sibennayak.identify.model.UserAgent;

public class TestUserAgent {

	public static void main(String[] args) {
		String UAFF = "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0";
		String UASM = "Mozilla/5.0 (Windows; U; Windows NT 6.2; WOW64; rv:1.8.0.7) Gecko/20110321 MultiZilla/4.33.2.6a SeaMonkey/8.6.55";
		String UAIE = "Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 7.0; InfoPath.3; .NET CLR 3.1.40767; Trident/6.0; en-IN)";
		String UAC = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2227.0 Safari/537.36";
		String UAEG = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Safari/537.36 Edge/12.246";
		String UASF = "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10_6_8; de-at) AppleWebKit/533.21.1 (KHTML, like Gecko) Version/5.0.5 Safari/533.21.1";
		String UAOP = "Opera/9.80 (Windows NT 5.1; U; zh-sg) Presto/2.9.181 Version/12.00";

		UserAgent userAgent = null;
		List<String> userAgents = new ArrayList<>();
		userAgents.add(UAFF);
		userAgents.add(UASM);
		userAgents.add(UAIE);
		userAgents.add(UAC);
		userAgents.add(UAEG);
		userAgents.add(UASF);
		userAgents.add(UAOP);

		for (String userAgentString : userAgents) {
			userAgent = new UserAgent(userAgentString);
			System.out
					.println(userAgent.getBrowser().getBrowserNameAndVersion());
		}

	}

}
