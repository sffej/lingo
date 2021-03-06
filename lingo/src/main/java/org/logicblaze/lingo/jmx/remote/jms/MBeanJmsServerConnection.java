/**
 * 
 * Copyright RAJD Consultancy Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 */
package org.logicblaze.lingo.jmx.remote.jms;

import javax.jms.Destination;
import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
/**
 * @version $Revision$
 */
public interface  MBeanJmsServerConnection extends  MBeanServerConnection{
        
    /**
     * Add a Notification listener
     * @param listenerId
     * @param name
     * @param replyToDestination
     */
    public void addNotificationListener(String listenerId, ObjectName name, Destination replyToDestination);
    
    /**
     * Remove a Notification listener
     * @param listenerId
     */
    public void removeNotificationListener(String listenerId);
    
}