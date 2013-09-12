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

package org.apache.hupa.shared.events;

import com.google.gwt.event.shared.GwtEvent;

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> fixed issue#74, finished to add search feature
public class RefreshMessagesEvent extends GwtEvent<RefreshMessagesEventHandler> {
	public final static Type<RefreshMessagesEventHandler> TYPE = new Type<RefreshMessagesEventHandler>();

	private String searchValue;

	public String getSearchValue() {
		return searchValue;
	}

	public RefreshMessagesEvent() {
	}
	public RefreshMessagesEvent(String searchValue) {
		this.searchValue = searchValue;
	}
	@Override
	protected void dispatch(RefreshMessagesEventHandler handler) {
		handler.onRefresh(this);
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<RefreshMessagesEventHandler> getAssociatedType() {
		return TYPE;
	}
<<<<<<< HEAD
=======
public class RefreshMessagesEvent extends GwtEvent<RefreshMessagesEventHandler>{
    public final static Type<RefreshMessagesEventHandler> TYPE = new Type<RefreshMessagesEventHandler>();
    @Override
    protected void dispatch(RefreshMessagesEventHandler handler) {
        handler.onRefresh(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<RefreshMessagesEventHandler> getAssociatedType() {
        return TYPE;
    }
>>>>>>> fixed issue#81, add refresh event handler
=======
>>>>>>> fixed issue#74, finished to add search feature

}
