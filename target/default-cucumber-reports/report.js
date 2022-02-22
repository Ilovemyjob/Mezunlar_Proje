$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Us_6.feature");
formatter.feature({
  "name": "tc_6",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@6"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to choose random products and add to cart. You should see that the total price of the added products and the total in the basket are the same.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@6"
    }
  ]
});
formatter.step({
  "name": "User go to Amazon site",
  "keyword": "When "
});
formatter.match({
  "location": "ui.stepdefinitions.Us_1.userGoToAmazonSite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user hover over Sign in",
  "keyword": "And "
});
formatter.match({
  "location": "ui.stepdefinitions.Us_2.userHoverOverSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clickt Sign In",
  "keyword": "And "
});
formatter.match({
  "location": "ui.stepdefinitions.Us_2.clicktSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "write valid e mail",
  "keyword": "And "
});
formatter.match({
  "location": "ui.stepdefinitions.Us_2.writeValidEMail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "write valid Password",
  "keyword": "And "
});
formatter.match({
  "location": "ui.stepdefinitions.Us_2.writeValidPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clickt search buttom",
  "keyword": "And "
});
formatter.match({
  "location": "ui.stepdefinitions.Us_4.user_clickt_search_buttom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User write a Words \"Samsung\"",
  "keyword": "And "
});
formatter.match({
  "location": "ui.stepdefinitions.Us_4.user_write_a_Words(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clickt 1 product",
  "keyword": "And "
});
formatter.match({
  "location": "ui.stepdefinitions.Us_6.clicktProduct(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clickt Add to card",
  "keyword": "And "
});
formatter.match({
  "location": "ui.stepdefinitions.Us_6.clickt_Add_to_card()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user delete search box",
  "keyword": "And "
});
formatter.match({
  "location": "ui.stepdefinitions.Us_6.user_delete_search_box()"
});
formatter.result({
  "error_message": "org.openqa.selenium.InvalidElementStateException: invalid element state\n  (Session info: chrome\u003d98.0.4758.102)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027WINDOWSPC\u0027, ip: \u0027192.168.178.20\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 98.0.4758.102, chrome: {chromedriverVersion: 98.0.4758.102 (273bf7ac8c90..., userDataDir: C:\\Users\\ADMINI~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:56756}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: c64d9e85e35ca8e254aafa234e225d08\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.clear(RemoteWebElement.java:124)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy14.clear(Unknown Source)\r\n\tat ui.stepdefinitions.Us_6.user_delete_search_box(Us_6.java:59)\r\n\tat ✽.user delete search box(file:///C:/Users/Administrator/IdeaProjects/Mezunlar_Proje/src/test/resources/features/Us_6.feature:14)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User write a Words \"Samsung\"",
  "keyword": "And "
});
formatter.match({
  "location": "ui.stepdefinitions.Us_4.user_write_a_Words(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clickt 2 product",
  "keyword": "And "
});
formatter.match({
  "location": "ui.stepdefinitions.Us_6.clicktProduct(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clickt Add to card",
  "keyword": "And "
});
formatter.match({
  "location": "ui.stepdefinitions.Us_6.clickt_Add_to_card()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "go to Shopping list",
  "keyword": "And "
});
formatter.match({
  "location": "ui.stepdefinitions.Us_6.go_to_Shopping_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see selected product correctly",
  "keyword": "And "
});
formatter.match({
  "location": "ui.stepdefinitions.Us_6.user_should_see_selected_product_correctly()"
});
formatter.result({
  "status": "skipped"
});
});