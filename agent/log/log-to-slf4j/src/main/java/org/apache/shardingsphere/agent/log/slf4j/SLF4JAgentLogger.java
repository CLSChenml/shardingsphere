/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.agent.log.slf4j;

import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.agent.log.api.AgentLogger;
import org.slf4j.Logger;

/**
 * SLF4J agent logger.
 */
@RequiredArgsConstructor
public final class SLF4JAgentLogger implements AgentLogger {
    
    private final Logger logger;
    
    @Override
    public void info(final String msg) {
        logger.info(msg);
    }
    
    @Override
    public void info(final String format, final Object... arguments) {
        logger.info(format, arguments);
    }
    
    @Override
    public void error(final String format, final Object... arguments) {
        logger.error(format, arguments);
    }
    
    @Override
    public void error(final String msg) {
        logger.error(msg);
    }
    
    @Override
    public void debug(final String format, final Object... arguments) {
        logger.debug(format, arguments);
    }
    
    @Override
    public void debug(final String msg) {
        logger.debug(msg);
    }
}
