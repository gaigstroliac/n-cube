package com.cedarsoftware.ncube.exception

import groovy.transform.CompileStatic

/**
 * Sub-class of IllegalArgumentException for extra clarification if needed.
 *
 * @author John DeRegnaucourt (jdereg@gmail.com)
 *         <br>
 *         Copyright (c) Cedar Software LLC
 *         <br><br>
 *         Licensed under the Apache License, Version 2.0 (the "License");
 *         you may not use this file except in compliance with the License.
 *         You may obtain a copy of the License at
 *         <br><br>
 *         http://www.apache.org/licenses/LICENSE-2.0
 *         <br><br>
 *         Unless required by applicable law or agreed to in writing, software
 *         distributed under the License is distributed on an "AS IS" BASIS,
 *         WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *         See the License for the specific language governing permissions and
 *         limitations under the License.
 */
@CompileStatic
public class InvalidCoordinateException extends IllegalArgumentException
{
	private final String cubeName
	private final Set coordinateKeys
	private final Set requiredKeys

	public InvalidCoordinateException(String msg, String cubeName = null, Set coordinateKeys = null, Set requiredKeys = null) {
		super(msg)
		this.cubeName = cubeName
		this.coordinateKeys = coordinateKeys
		this.requiredKeys = requiredKeys
	}

	/**
	 * Returns the cube name.
	 *
	 * @return  required cube name
	 */
	public String getCubeName() {
		return cubeName;
	}

	/**
	 * Returns the coordinate keys.
	 *
	 * @return  coordinate keys
	 */
	public Set getCoordinateKeys() {
		return coordinateKeys;
	}

	/**
	 * Returns the required keys.
	 *
	 * @return  required keys
	 */
	public Set getRequiredKeys() {
		return requiredKeys;
	}
}
