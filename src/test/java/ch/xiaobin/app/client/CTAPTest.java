package ch.xiaobin.app.client;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * GWT JUnit tests must extend GWTTestCase.
 */
public class CTAPTest extends GWTTestCase {

	/**
	 * Must refer to a valid module that sources this class.
	 */
	@Override
	public String getModuleName() {
		return "ch.xiaobin.app.CTAPJUnit";
	}

	/**
	 * Tests the FieldVerifier.
	 */
	public void testFieldVerifier() {
		// assertFalse(FieldVerifier.isValidName(null));
		// assertFalse(FieldVerifier.isValidName(""));
		// assertFalse(FieldVerifier.isValidName("a"));
		// assertFalse(FieldVerifier.isValidName("ab"));
		// assertFalse(FieldVerifier.isValidName("abc"));
		// assertTrue(FieldVerifier.isValidName("abcd"));
	}

	/**
	 * This test will send a request to the server using the greetServer method
	 * in GreetingService and verify the response.
	 */
	public void testGreetingService() {
		// Create the service that we will test.
		// GreetingServiceAsync greetingService =
		// GWT.create(GreetingService.class);
		// ServiceDefTarget target = (ServiceDefTarget) greetingService;
		// target.setServiceEntryPoint(GWT.getModuleBaseURL() + "ctap/greet");
		//
		// // Since RPC calls are asynchronous, we will need to wait for a
		// response
		// // after this test method returns. This line tells the test runner to
		// // wait
		// // up to 10 seconds before timing out.
		// delayTestFinish(10000);
		//
		// // Send a request to the server.
		// greetingService.greetServer("GWT User", new AsyncCallback<String>() {
		// @Override
		// public void onFailure(Throwable caught) {
		// // The request resulted in an unexpected error.
		// fail("Request failure: " + caught.getMessage());
		// }
		//
		// @Override
		// public void onSuccess(String result) {
		// // Verify that the response is correct.
		// assertTrue(result.startsWith("Hello, GWT User!"));
		//
		// // Now that we have received a response, we need to tell the
		// // test runner
		// // that the test is complete. You must call finishTest() after
		// // an
		// // asynchronous test finishes successfully, or the test will
		// // time out.
		// finishTest();
		// }
		// });
	}

}