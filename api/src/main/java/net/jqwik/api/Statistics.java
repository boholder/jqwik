package net.jqwik.api;

import org.apiguardian.api.*;

import net.jqwik.api.statistics.*;

import static org.apiguardian.api.API.Status.*;

/**
 * This class serves as a container for static methods to collect statistical
 * data about generated values within a property method.
 *
 * @deprecated Use {@link net.jqwik.api.statistics.Statistics} instead. Will be removed in version 1.3.
 */
@API(status = DEPRECATED, since = "1.2.3")
@Deprecated
public class Statistics {

	private Statistics() {
		// never invoke
	}

	/**
	 * Call this method to get a labeled instance of {@link StatisticsCollector}.
	 *
	 * @param label The label will be used for reporting the collected statistical values
	 *
	 * @deprecated Use {@link net.jqwik.api.statistics.Statistics#label(String)} instead. Will be removed in version 1.3.
	 */
	@Deprecated
	@API(status = DEPRECATED, since = "1.2.3")
	public static StatisticsCollector label(String label) {
		return net.jqwik.api.statistics.Statistics.label(label);
	}

	/**
	 * Call this method to record an entry for statistical data about generated values.
	 * As soon as this method is called at least once in a property method,
	 * the statistical data will be reported after the property has finished.
	 *
	 * @param values Can be anything. The list of these values is considered
	 *               a key for the reported table of frequencies.
	 * @deprecated Use {@link net.jqwik.api.statistics.Statistics#collect(Object...)} instead. Will be removed in version 1.3.
	 */
	@Deprecated
	@API(status = DEPRECATED, since = "1.2.3")
	public static void collect(Object... values) {
		net.jqwik.api.statistics.Statistics.collect(values);
	}

}
