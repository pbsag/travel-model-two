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

package org.jppf.client.event;

import java.util.EventListener;

/**
 * Instances of this class listen to status change events on client connections.
 * @author Laurent Cohen
 */
public interface ClientConnectionStatusListener extends EventListener
{
	/**
	 * Invoked to notify of a status chnage event on a client connection.
	 * @param event the event to notify of.
	 */
	void statusChanged(ClientConnectionStatusEvent event);
}
