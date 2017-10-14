package azkaoru.karaf4.osgi.exam.samples.ds;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;


public class CalcActivator implements BundleActivator {

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("[Calculator] Starting Module...");
		CalculatorImpl calculator = new CalculatorImpl();
		calculator.setAddition(new Addition());
		bundleContext.registerService(Calculator.class, calculator, null);
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("[Calculator] Stopping Module...");
	}

}
