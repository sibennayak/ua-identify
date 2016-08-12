package com.sibennayak.identify;

import org.junit.Assert;
import org.junit.Test;

import com.sibennayak.identify.model.Browser;

public class UserAgentTest {

	@Test
	public void testFirefox() {
		String userAgent = "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0";
		Browser browser = UaIdentify.getBrowser(userAgent);
		Assert.assertEquals(browser.getBrowserName(), "Mozilla Firefox");
		Assert.assertEquals(browser.getBrowserVersion(), "25");
	}

	@Test
	public void testSeamonkey() {
		String userAgent = "Mozilla/5.0 (Windows; U; Windows NT 6.2; WOW64; rv:1.8.0.7) Gecko/20110321 MultiZilla/4.33.2.6a SeaMonkey/8.6.55";
		Browser browser = UaIdentify.getBrowser(userAgent);
		Assert.assertEquals(browser.getBrowserName(), "SeaMonkey");
		Assert.assertEquals(browser.getBrowserVersion(), "8");
	}

	@Test
	public void testInternetExplorer() {
		String userAgent = "Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 7.0; InfoPath.3; .NET CLR 3.1.40767; Trident/6.0; en-IN)";
		Browser browser = UaIdentify.getBrowser(userAgent);
		Assert.assertEquals(browser.getBrowserName(), "Internet Explorer");
		Assert.assertEquals(browser.getBrowserVersion(), "10");
	}

	@Test
	public void testChrome() {
		String userAgent = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2227.0 Safari/537.36";
		Browser browser = UaIdentify.getBrowser(userAgent);
		Assert.assertEquals(browser.getBrowserName(), "Google Chrome");
		Assert.assertEquals(browser.getBrowserVersion(), "41");
	}

	@Test
	public void testEdge() {
		String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Safari/537.36 Edge/12.246";
		Browser browser = UaIdentify.getBrowser(userAgent);
		Assert.assertEquals(browser.getBrowserName(), "Microsoft Edge");
		Assert.assertEquals(browser.getBrowserVersion(), "12");
	}

	@Test
	public void testSafari() {
		String userAgent = "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10_6_8; de-at) AppleWebKit/533.21.1 (KHTML, like Gecko) Version/5.0.5 Safari/533.21.1";
		Browser browser = UaIdentify.getBrowser(userAgent);
		Assert.assertEquals(browser.getBrowserName(), "Safari");
		Assert.assertEquals(browser.getBrowserVersion(), "5");
	}

	@Test
	public void testOpera() {
		String userAgent = "Opera/9.80 (Windows NT 5.1; U; zh-sg) Presto/2.9.181 Version/12.00";
		Browser browser = UaIdentify.getBrowser(userAgent);
		Assert.assertEquals(browser.getBrowserName(), "Opera");
		Assert.assertEquals(browser.getBrowserVersion(), "12");
	}

}
