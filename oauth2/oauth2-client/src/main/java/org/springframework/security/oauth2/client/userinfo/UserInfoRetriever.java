/*
 * Copyright 2012-2017 the original author or authors.
 *
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
 */
package org.springframework.security.oauth2.client.userinfo;

import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.client.AuthorizedClient;

/**
 * A strategy for retrieving the user attributes
 * of the <i>End-User</i> (resource owner) from the <i>UserInfo Endpoint</i>
 * using the provided {@link AuthorizedClient#getAccessToken()}.
 *
 * @author Joe Grandja
 * @author Rob Winch
 * @since 5.0
 * @see AuthorizedClient
 * @see OAuth2UserService
 */
public interface UserInfoRetriever {

	<T> T retrieve(AuthorizedClient authorizedClient, Class<T> responseType) throws OAuth2AuthenticationException;

}