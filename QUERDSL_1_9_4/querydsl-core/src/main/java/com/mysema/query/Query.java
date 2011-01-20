/*
 * Copyright (c) 2010 Mysema Ltd.
 * All rights reserved.
 *
 */
package com.mysema.query;

import javax.annotation.Nonnegative;

import com.mysema.query.types.Expr;
import com.mysema.query.types.OrderSpecifier;
import com.mysema.query.types.Param;
import com.mysema.query.types.expr.EBoolean;

/**
 * Query provides a query interface of the fluent query DSL.
 *
 * <p>Note that the from method has been left out, since there are implementation
 * specific variants of it.</p>
 *
 * @author tiwe
 * @see SimpleQuery
 */
public interface Query<Q extends Query<Q>> extends FilteredClause<Q>{

    /**
     * Defines the grouping/aggregation expressions
     *
     * @param o
     * @return
     */
    Q groupBy(Expr<?>... o);

    /**
     * Defines the filters for aggregation
     *
     * @param o
     * @return
     */
    Q having(EBoolean... o);

    /**
     * Defines the order expressions
     *
     * @param o
     * @return
     */
    Q orderBy(OrderSpecifier<?>... o);

    /**
     * Defines the limit / max results for the query results
     *
     * @param limit
     * @return
     */
    Q limit(@Nonnegative long limit);

    /**
     * Defines the offset for the query results
     *
     * @param offset
     * @return
     */
    Q offset(@Nonnegative long offset);

    /**
     * Defines both limit and offset of the query results
     *
     * @param mod
     * @return
     */
    Q restrict(QueryModifiers mod);

    /**
     * Set the given parameter to the given value
     *
     * @param <T>
     * @param param
     * @param value
     * @return
     */
    <T> Q set(Param<T> param, T value);

}