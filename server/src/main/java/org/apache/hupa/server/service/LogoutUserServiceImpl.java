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
=======
>>>>>>> other RFs
=======
>>>>>>> remove both of gwt-representer and gwt-dispatch dependencies, add license headers to all new files
package org.apache.hupa.server.service;

import org.apache.hupa.server.utils.SessionUtils;
import org.apache.hupa.shared.data.LogoutUserResultImpl;
import org.apache.hupa.shared.domain.LogoutUserResult;
import org.apache.hupa.shared.domain.User;
<<<<<<< HEAD
import org.apache.hupa.shared.exception.HupaException;

public class LogoutUserServiceImpl extends AbstractService implements LogoutUserService {
	@Override
	public LogoutUserResult logout() throws HupaException {
=======

public class LogoutUserServiceImpl extends AbstractService implements LogoutUserService {
	@Override
	public LogoutUserResult logout() {
>>>>>>> other RFs

		User user = getUser();
		user.setAuthenticated(false);

		// delete cached store
		cache.delete(user);

		// remove user attributes from session
<<<<<<< HEAD
<<<<<<< HEAD
		SessionUtils.cleanSessionAttributes(httpSessionProvider.get());
=======
		SessionUtils.cleanSessionAttributes(httpSession);
>>>>>>> other RFs
=======
		SessionUtils.cleanSessionAttributes(httpSessionProvider.get());
>>>>>>> fix issue 5,6,8:

		return new LogoutUserResultImpl(user);

	}
}
