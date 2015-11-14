/*
 * #%L
 * Simmetrics Core
 * %%
 * Copyright (C) 2014 - 2015 Simmetrics Authors
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package org.simmetrics.metrics;

import static java.util.Arrays.asList;

import org.simmetrics.MultisetMetric;
import org.simmetrics.MultisetMetricTest;

@SuppressWarnings("javadoc")
public final class GeneralizedJaccardTest extends MultisetMetricTest {

	@Override
	protected MultisetMetric<String> getMetric() {
		return new GeneralizedJaccard<>();
	}


	@Override
	protected T[] getListTests() {
		return new T[]{
				new T(  0.3334f, asList("test", null), asList("test","string2")),
				new T(0.3333f, "test string1", "test string2"),
				new T(0.5000f, "test", "test string2"),
				new T(0.0000f, "", "test string2"),
				new T(0.6000f, "aaa bbb ccc ddd", "aaa bbb ccc eee"),
				new T(0.6000f, "a b c d", "a b c e"),
				new T(0.3333f, "aaa bbb ccc ddd aaa bbb ccc ddd", "aaa bbb ccc eee"),

				new T(0.2000f, "Sam J Chapman", "Samuel John Chapman"),
				new T(0.3333f, "Sam Chapman", "S Chapman"),
				new T(0.2500f, "John Smith", "Samuel John Chapman"),
				new T(0.0000f, "John Smith", "Sam Chapman"),
				new T(0.0000f, "John Smith", "Sam J Chapman"),
				new T(0.0000f, "John Smith", "S Chapman"),
				new T(0.4286f, "Web Database Applications",
						"Web Database Applications with PHP & MySQL"),
				new T(0.3750f, "Web Database Applications",
						"Creating Database Web Applications with PHP and ASP"),
				new T(0.3750f, "Web Database Applications",
						"Building Database Applications on the Web Using PHP3"),
				new T(0.3750f, "Web Database Applications",
						"Building Web Database Applications with Visual Studio 6"),
				new T(0.1428f, "Web Database Applications",
						"Web Application Development With PHP"),
				new T(
						0.2308f,
						"Web Database Applications",
						"WebRAD: Building Database Applications on the Web with Visual FoxPro and Web Connection"),
				new T(0.0000f, "Web Database Applications",
						"Structural Assessment: The Role of Large and Full-Scale Testing"),
				new T(0.0000f, "Web Database Applications",
						"How to Find a Scholarship Online"),
				new T(0.1250f, "Web Aplications",
						"Web Database Applications with PHP & MySQL"),
				new T(0.1111f, "Web Aplications",
						"Creating Database Web Applications with PHP and ASP"),
				new T(0.1111f, "Web Aplications",
						"Building Database Applications on the Web Using PHP3"),
				new T(0.1111f, "Web Aplications",
						"Building Web Database Applications with Visual Studio 6"),
				new T(0.1666f, "Web Aplications",
						"Web Application Development With PHP"),
				new T(
						0.0714f,
						"Web Aplications",
						"WebRAD: Building Database Applications on the Web with Visual FoxPro and Web Connection"),
				new T(0.0000f, "Web Aplications",
						"Structural Assessment: The Role of Large and Full-Scale Testing"),
				new T(0.0000f, "Web Aplications",
						"How to Find a Scholarship Online")};
	}
}