/*
 * JPPF.
 * Copyright (C) 2005-2010 JPPF Team.
 * http://www.jppf.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.datasize;

import java.io.Serializable;
import java.util.concurrent.Callable;

/**
 * 
 * @author Laurent Cohen
 */
public class MyCallable implements Callable<String>, Serializable
{
	/**
	 * The id of this task.
	 */
	private String id = null;

	/**
	 * Constructor.
	 * @param id the id of this task.
	 */
	public MyCallable(String id)
	{
		this.id = id;
	}

	/**
	 * {@inheritDoc}
	 */
	public String call() throws Exception
	{
		return null;
	}
}