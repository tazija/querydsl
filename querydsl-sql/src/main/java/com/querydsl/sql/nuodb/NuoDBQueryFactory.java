/*
 * Copyright 2015, Mysema Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.querydsl.sql.nuodb;

import com.querydsl.sql.AbstractSQLQueryFactory;
import com.querydsl.sql.Configuration;
import com.querydsl.sql.SQLSubQuery;

import javax.inject.Provider;
import java.sql.Connection;

/**
 * @author Sergey Bushik
 */
public class NuoDBQueryFactory extends AbstractSQLQueryFactory<NuoDBQuery, SQLSubQuery> {

    public NuoDBQueryFactory(Configuration configuration, Provider<Connection> connection) {
        super(configuration, connection);
    }

    public NuoDBQuery query() {
        return new NuoDBQuery(connection.get(), configuration);
    }
}
