/*
 * Copyright 2013-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.awspring.cloud.sqs.support.converter;

import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.HeaderMapper;

/**
 * A {@link HeaderMapper} specialization that supports receiving a {@link MessageConversionContext} for mapping context
 * dependent headers.
 * @author Tomaz Fernandes
 * @since 3.0
 * @see ContextAwareMessagingMessageConverter
 */
public interface ContextAwareHeaderMapper<S> extends HeaderMapper<S> {

	MessageHeaders createContextHeaders(S source, MessageConversionContext context);

}
