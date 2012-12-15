package com.google.gwt.maps.client.service;

/*
 * #%L
 * GWT Maps API V3 - Core API
 * %%
 * Copyright (C) 2011 - 2012 GWT Maps API V3
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

import com.google.gwt.maps.client.AbstractMapsGWTTestHelper;
import com.google.gwt.maps.client.LoadApi.LoadLibrary;
import com.google.gwt.maps.client.services.TravelMode;

public class TravelModeGwtTest extends AbstractMapsGWTTestHelper {

	@Override
	public LoadLibrary[] getLibraries() {
		return new LoadLibrary[] { LoadLibrary.PLACES };
	}

	public void testReverseEngineer() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				reverseEngineer();
				finishTest();
			}
		});
	}

	private native void reverseEngineer() /*-{
		var array = [ "BICYCLING", "DRIVING", "WALKING" ]
		for ( var i = 0; i < array.length; i++) {
			var s = "$wnd.google.maps.TravelMode." + array[i];
			alert(array[i] + "=" + eval(s));
		}
	}-*/;

	@SuppressWarnings("unused")
	public void testUse() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				TravelMode o = TravelMode.BICYCLING;
				assertEquals("BICYCLING", TravelMode.BICYCLING.value());
				assertEquals(TravelMode.BICYCLING,
						TravelMode.fromValue("BICYCLING"));
				finishTest();
			}
		});
	}

	@SuppressWarnings("unused")
	public void testUse2() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				TravelMode o = TravelMode.DRIVING;
				assertEquals("DRIVING", TravelMode.DRIVING.value());
				assertEquals(TravelMode.DRIVING,
						TravelMode.fromValue("DRIVING"));
				finishTest();
			}
		});
	}

	@SuppressWarnings("unused")
	public void testUse3() {
		asyncLibTest(new Runnable() {
			@Override
			public void run() {
				TravelMode o = TravelMode.WALKING;
				assertEquals("WALKING", TravelMode.WALKING.value());
				assertEquals(TravelMode.WALKING,
						TravelMode.fromValue("WALKING"));
				finishTest();
			}
		});
	}

}
