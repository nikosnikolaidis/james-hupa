<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> remove both of gwt-representer and gwt-dispatch dependencies, add license headers to all new files
/****************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 ****************************************************************/

<<<<<<< HEAD
package org.apache.hupa.server.service;

import javax.mail.MessagingException;

import org.apache.hupa.shared.domain.DeleteFolderAction;
import org.apache.hupa.shared.domain.GenericResult;
import org.apache.hupa.shared.exception.HupaException;

public interface DeleteFolderService {
	GenericResult delete(DeleteFolderAction action) throws HupaException, MessagingException;
=======
=======
>>>>>>> remove both of gwt-representer and gwt-dispatch dependencies, add license headers to all new files
package org.apache.hupa.server.service;

import org.apache.hupa.shared.domain.DeleteFolderAction;
import org.apache.hupa.shared.domain.GenericResult;

public interface DeleteFolderService {
	GenericResult delete(DeleteFolderAction action) throws Exception;
>>>>>>> delete and rename folder
}
