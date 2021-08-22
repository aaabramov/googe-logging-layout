package com.github.aaabramov.glogging;

import com.google.gson.Gson;

/**
 * Encode {@link GcpLoggingEvent} using Gson library.
 */
class GsonEncoder implements JsonEncoder {
    
    private final Gson gson = new Gson();
    
    @Override
    public String toJson(GcpLoggingEvent event) {
        return this.gson.toJson(event);
    }
    
}