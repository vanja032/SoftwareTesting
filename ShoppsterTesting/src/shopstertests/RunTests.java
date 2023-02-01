package shopstertests;

import java.util.logging.Logger;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import junit.textui.TestRunner;

public class RunTests {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(AllTests.class);
		Logger logs = Logger.getLogger(TestRunner.class.toString());
		for(org.junit.runner.notification.Failure f : result.getFailures()) {
			logs.warning(f.toString());
		}
		logs.info("Vreme izvrsavanja testova: " + result.getRunTime());
		logs.info("Ukupan broj testova: " + result.getRunCount());
		logs.info("Broj uspesnih testova: " + (result.getRunCount() - result.getFailureCount() - result.getIgnoreCount() - result.getAssumptionFailureCount()));
		logs.info("Broj palih testova: " + result.getFailureCount());
		logs.info("Broj preskocenih testova: " + result.getIgnoreCount());
		logs.info("Broj dinamickih preskocenih testova: " + result.getAssumptionFailureCount());
	}

}
