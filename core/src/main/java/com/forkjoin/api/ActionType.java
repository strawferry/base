package com.forkjoin.api;

import com.google.common.collect.ImmutableBiMap;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author zuoge85 on 15/6/12.
 */
public enum ActionType {
    //    GET,POST,DELETE,PUT,GET_OR_POST
    CREATE, GET,
    UPDATE, DELETE, PATCH;

    private static final ImmutableBiMap<ActionType, RequestMethod> typeMap = ImmutableBiMap.<ActionType, RequestMethod>builder()
            .put(CREATE, RequestMethod.POST)
            .put(GET, RequestMethod.GET)
            .put(UPDATE, RequestMethod.PUT)
            .put(DELETE, RequestMethod.DELETE)
            .put(PATCH, RequestMethod.PATCH)
            .build();

    public RequestMethod toMethod(){
        return typeMap.get(this);
    }
}