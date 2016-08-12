# ua-identify
A simple User Agent parser to identify the various parameters in a user agent string

### Building 

This project uses Gradle for its build process.

```
gradle build
```
### Example Usage

```
String userAgent = "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0";
Browser browser = UaIdentify.getBrowser(userAgent);

browser.getBrowserName() // Mozilla Firefox
browser.getBrowserVersion() // 25
browser.getBrowserNameAndVersion()  // Mozilla Firefox 25
```