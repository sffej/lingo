/**
 * 
 * Copyright 2005 LogicBlaze, Inc. http://www.logicblaze.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 * 
 **/
package org.logicblaze.lingo.lock;

import org.apache.activemq.Service;

import edu.emory.mathcs.backport.java.util.concurrent.locks.ReadWriteLock;

/**
 * Represents the interface of a distributed lock manager. Nodes can acquire locks
 * which are leased. If the LockManager fails then another lock manager is chosen to take its place
 * and the locks are resumed.
 * 
 * @version $Revision$
 */
public interface LockManager extends Service {

    /**
     * Gets hold of the read/write lock for the given ID
     * 
     * @param id is the unique ID of the lock to acquire 
     * @return
     */
    public ReadWriteLock getLock(String id);
}
