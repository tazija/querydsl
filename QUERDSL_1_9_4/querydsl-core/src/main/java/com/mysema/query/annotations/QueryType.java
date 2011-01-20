/*
 * Copyright (c) 2010 Mysema Ltd.
 * All rights reserved.
 *
 */
package com.mysema.query.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * QueryType defines the Querydsl property type for a Domain property
 *
 * @author tiwe
 *
 */
@Documented
@Target({FIELD,METHOD,PARAMETER})
@Retention(RUNTIME)
public @interface QueryType {

    /**
     * @return
     */
    PropertyType value();
}