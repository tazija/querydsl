/*
 * Copyright (c) 2010 Mysema Ltd.
 * All rights reserved.
 *
 */
package com.mysema.query.sql;

import java.util.Collection;

import javax.annotation.Nullable;

import com.mysema.query.types.EntityPath;

/**
 * RelationalPath extends EntityPath to provide access to relational metadata
 * 
 * @author tiwe
 *
 */
public interface RelationalPath<T> extends EntityPath<T>{

    /**
     * Get the primary key for this relation or null if none exists
     * 
     * @return
     */
    @Nullable
    PrimaryKey<T> getPrimaryKey();

    /**
     * Get the foreign keys for this relation
     * 
     * @return
     */
    Collection<ForeignKey<?>> getForeignKeys();

    /**
     * Get the inverse foreign keys for this relation
     * 
     * @return
     */
    Collection<ForeignKey<?>> getInverseForeignKeys();

}