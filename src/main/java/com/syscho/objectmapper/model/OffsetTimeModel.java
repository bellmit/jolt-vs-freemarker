package com.syscho.objectmapper.model;

import java.time.OffsetDateTime;

public class OffsetTimeModel {
    private OffsetDateTime creationDateTime;

    private OffsetDateTime lastUpdateDateTime;

    public OffsetDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(OffsetDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OffsetDateTime getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    public void setLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }
}
