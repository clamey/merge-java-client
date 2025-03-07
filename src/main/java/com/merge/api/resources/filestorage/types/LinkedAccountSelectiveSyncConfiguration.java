/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.filestorage.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LinkedAccountSelectiveSyncConfiguration.Builder.class)
public final class LinkedAccountSelectiveSyncConfiguration {
    private final Optional<List<LinkedAccountCondition>> linkedAccountConditions;

    private final Map<String, Object> additionalProperties;

    private LinkedAccountSelectiveSyncConfiguration(
            Optional<List<LinkedAccountCondition>> linkedAccountConditions, Map<String, Object> additionalProperties) {
        this.linkedAccountConditions = linkedAccountConditions;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The conditions belonging to a selective sync.
     */
    @JsonProperty("linked_account_conditions")
    public Optional<List<LinkedAccountCondition>> getLinkedAccountConditions() {
        return linkedAccountConditions;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LinkedAccountSelectiveSyncConfiguration
                && equalTo((LinkedAccountSelectiveSyncConfiguration) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(LinkedAccountSelectiveSyncConfiguration other) {
        return linkedAccountConditions.equals(other.linkedAccountConditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.linkedAccountConditions);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<List<LinkedAccountCondition>> linkedAccountConditions = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(LinkedAccountSelectiveSyncConfiguration other) {
            linkedAccountConditions(other.getLinkedAccountConditions());
            return this;
        }

        @JsonSetter(value = "linked_account_conditions", nulls = Nulls.SKIP)
        public Builder linkedAccountConditions(Optional<List<LinkedAccountCondition>> linkedAccountConditions) {
            this.linkedAccountConditions = linkedAccountConditions;
            return this;
        }

        public Builder linkedAccountConditions(List<LinkedAccountCondition> linkedAccountConditions) {
            this.linkedAccountConditions = Optional.of(linkedAccountConditions);
            return this;
        }

        public LinkedAccountSelectiveSyncConfiguration build() {
            return new LinkedAccountSelectiveSyncConfiguration(linkedAccountConditions, additionalProperties);
        }
    }
}
