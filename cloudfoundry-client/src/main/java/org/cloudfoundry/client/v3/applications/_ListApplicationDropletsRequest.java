/*
 * Copyright 2013-2018 the original author or authors.
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

package org.cloudfoundry.client.v3.applications;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.cloudfoundry.Nullable;
import org.cloudfoundry.client.v3.FilterParameter;
import org.cloudfoundry.client.v3.PaginatedRequest;
import org.cloudfoundry.client.v3.droplets.DropletState;
import org.immutables.value.Value;

import java.util.List;

/**
 * The request payload for the List Application Droplets operation
 */
@Value.Immutable
abstract class _ListApplicationDropletsRequest extends PaginatedRequest {

    /**
     * The application id
     */
    @JsonIgnore
    abstract String getApplicationId();

    /**
     * Whether to only include the droplet current assigned to the app
     */
    @FilterParameter("current")
    @Nullable
    abstract Boolean getCurrent();

    /**
     * The droplet ids
     */
    @FilterParameter("guids")
    abstract List<String> getDropletIds();

    /**
     * The states
     */
    @FilterParameter("states")
    abstract List<DropletState> getStates();

}
