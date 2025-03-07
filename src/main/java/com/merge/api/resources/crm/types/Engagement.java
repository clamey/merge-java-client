/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.crm.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Engagement.Builder.class)
public final class Engagement {
    private final Optional<EngagementOwner> owner;

    private final Optional<String> content;

    private final Optional<String> subject;

    private final Optional<EngagementDirection> direction;

    private final Optional<EngagementEngagementType> engagementType;

    private final Optional<OffsetDateTime> startTime;

    private final Optional<OffsetDateTime> endTime;

    private final Optional<EngagementAccount> account;

    private final Optional<List<Optional<EngagementContactsItem>>> contacts;

    private final Optional<Boolean> remoteWasDeleted;

    private final Optional<String> id;

    private final Optional<String> remoteId;

    private final Optional<OffsetDateTime> createdAt;

    private final Optional<OffsetDateTime> modifiedAt;

    private final Optional<Map<String, JsonNode>> fieldMappings;

    private final Optional<List<RemoteData>> remoteData;

    private final Optional<List<RemoteField>> remoteFields;

    private final Map<String, Object> additionalProperties;

    private Engagement(
            Optional<EngagementOwner> owner,
            Optional<String> content,
            Optional<String> subject,
            Optional<EngagementDirection> direction,
            Optional<EngagementEngagementType> engagementType,
            Optional<OffsetDateTime> startTime,
            Optional<OffsetDateTime> endTime,
            Optional<EngagementAccount> account,
            Optional<List<Optional<EngagementContactsItem>>> contacts,
            Optional<Boolean> remoteWasDeleted,
            Optional<String> id,
            Optional<String> remoteId,
            Optional<OffsetDateTime> createdAt,
            Optional<OffsetDateTime> modifiedAt,
            Optional<Map<String, JsonNode>> fieldMappings,
            Optional<List<RemoteData>> remoteData,
            Optional<List<RemoteField>> remoteFields,
            Map<String, Object> additionalProperties) {
        this.owner = owner;
        this.content = content;
        this.subject = subject;
        this.direction = direction;
        this.engagementType = engagementType;
        this.startTime = startTime;
        this.endTime = endTime;
        this.account = account;
        this.contacts = contacts;
        this.remoteWasDeleted = remoteWasDeleted;
        this.id = id;
        this.remoteId = remoteId;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.fieldMappings = fieldMappings;
        this.remoteData = remoteData;
        this.remoteFields = remoteFields;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The engagement's owner.
     */
    @JsonProperty("owner")
    public Optional<EngagementOwner> getOwner() {
        return owner;
    }

    /**
     * @return The engagement's content.
     */
    @JsonProperty("content")
    public Optional<String> getContent() {
        return content;
    }

    /**
     * @return The engagement's subject.
     */
    @JsonProperty("subject")
    public Optional<String> getSubject() {
        return subject;
    }

    /**
     * @return The engagement's direction.
     * <ul>
     * <li><code>INBOUND</code> - INBOUND</li>
     * <li><code>OUTBOUND</code> - OUTBOUND</li>
     * </ul>
     */
    @JsonProperty("direction")
    public Optional<EngagementDirection> getDirection() {
        return direction;
    }

    /**
     * @return The engagement type of the engagement.
     */
    @JsonProperty("engagement_type")
    public Optional<EngagementEngagementType> getEngagementType() {
        return engagementType;
    }

    /**
     * @return The time at which the engagement started.
     */
    @JsonProperty("start_time")
    public Optional<OffsetDateTime> getStartTime() {
        return startTime;
    }

    /**
     * @return The time at which the engagement ended.
     */
    @JsonProperty("end_time")
    public Optional<OffsetDateTime> getEndTime() {
        return endTime;
    }

    /**
     * @return The account of the engagement.
     */
    @JsonProperty("account")
    public Optional<EngagementAccount> getAccount() {
        return account;
    }

    @JsonProperty("contacts")
    public Optional<List<Optional<EngagementContactsItem>>> getContacts() {
        return contacts;
    }

    /**
     * @return Indicates whether or not this object has been deleted in the third party platform.
     */
    @JsonProperty("remote_was_deleted")
    public Optional<Boolean> getRemoteWasDeleted() {
        return remoteWasDeleted;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    /**
     * @return The third-party API ID of the matching object.
     */
    @JsonProperty("remote_id")
    public Optional<String> getRemoteId() {
        return remoteId;
    }

    @JsonProperty("created_at")
    public Optional<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    /**
     * @return This is the datetime that this object was last updated by Merge
     */
    @JsonProperty("modified_at")
    public Optional<OffsetDateTime> getModifiedAt() {
        return modifiedAt;
    }

    @JsonProperty("field_mappings")
    public Optional<Map<String, JsonNode>> getFieldMappings() {
        return fieldMappings;
    }

    @JsonProperty("remote_data")
    public Optional<List<RemoteData>> getRemoteData() {
        return remoteData;
    }

    @JsonProperty("remote_fields")
    public Optional<List<RemoteField>> getRemoteFields() {
        return remoteFields;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Engagement && equalTo((Engagement) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Engagement other) {
        return owner.equals(other.owner)
                && content.equals(other.content)
                && subject.equals(other.subject)
                && direction.equals(other.direction)
                && engagementType.equals(other.engagementType)
                && startTime.equals(other.startTime)
                && endTime.equals(other.endTime)
                && account.equals(other.account)
                && contacts.equals(other.contacts)
                && remoteWasDeleted.equals(other.remoteWasDeleted)
                && id.equals(other.id)
                && remoteId.equals(other.remoteId)
                && createdAt.equals(other.createdAt)
                && modifiedAt.equals(other.modifiedAt)
                && fieldMappings.equals(other.fieldMappings)
                && remoteData.equals(other.remoteData)
                && remoteFields.equals(other.remoteFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.owner,
                this.content,
                this.subject,
                this.direction,
                this.engagementType,
                this.startTime,
                this.endTime,
                this.account,
                this.contacts,
                this.remoteWasDeleted,
                this.id,
                this.remoteId,
                this.createdAt,
                this.modifiedAt,
                this.fieldMappings,
                this.remoteData,
                this.remoteFields);
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
        private Optional<EngagementOwner> owner = Optional.empty();

        private Optional<String> content = Optional.empty();

        private Optional<String> subject = Optional.empty();

        private Optional<EngagementDirection> direction = Optional.empty();

        private Optional<EngagementEngagementType> engagementType = Optional.empty();

        private Optional<OffsetDateTime> startTime = Optional.empty();

        private Optional<OffsetDateTime> endTime = Optional.empty();

        private Optional<EngagementAccount> account = Optional.empty();

        private Optional<List<Optional<EngagementContactsItem>>> contacts = Optional.empty();

        private Optional<Boolean> remoteWasDeleted = Optional.empty();

        private Optional<String> id = Optional.empty();

        private Optional<String> remoteId = Optional.empty();

        private Optional<OffsetDateTime> createdAt = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Optional<Map<String, JsonNode>> fieldMappings = Optional.empty();

        private Optional<List<RemoteData>> remoteData = Optional.empty();

        private Optional<List<RemoteField>> remoteFields = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(Engagement other) {
            owner(other.getOwner());
            content(other.getContent());
            subject(other.getSubject());
            direction(other.getDirection());
            engagementType(other.getEngagementType());
            startTime(other.getStartTime());
            endTime(other.getEndTime());
            account(other.getAccount());
            contacts(other.getContacts());
            remoteWasDeleted(other.getRemoteWasDeleted());
            id(other.getId());
            remoteId(other.getRemoteId());
            createdAt(other.getCreatedAt());
            modifiedAt(other.getModifiedAt());
            fieldMappings(other.getFieldMappings());
            remoteData(other.getRemoteData());
            remoteFields(other.getRemoteFields());
            return this;
        }

        @JsonSetter(value = "owner", nulls = Nulls.SKIP)
        public Builder owner(Optional<EngagementOwner> owner) {
            this.owner = owner;
            return this;
        }

        public Builder owner(EngagementOwner owner) {
            this.owner = Optional.of(owner);
            return this;
        }

        @JsonSetter(value = "content", nulls = Nulls.SKIP)
        public Builder content(Optional<String> content) {
            this.content = content;
            return this;
        }

        public Builder content(String content) {
            this.content = Optional.of(content);
            return this;
        }

        @JsonSetter(value = "subject", nulls = Nulls.SKIP)
        public Builder subject(Optional<String> subject) {
            this.subject = subject;
            return this;
        }

        public Builder subject(String subject) {
            this.subject = Optional.of(subject);
            return this;
        }

        @JsonSetter(value = "direction", nulls = Nulls.SKIP)
        public Builder direction(Optional<EngagementDirection> direction) {
            this.direction = direction;
            return this;
        }

        public Builder direction(EngagementDirection direction) {
            this.direction = Optional.of(direction);
            return this;
        }

        @JsonSetter(value = "engagement_type", nulls = Nulls.SKIP)
        public Builder engagementType(Optional<EngagementEngagementType> engagementType) {
            this.engagementType = engagementType;
            return this;
        }

        public Builder engagementType(EngagementEngagementType engagementType) {
            this.engagementType = Optional.of(engagementType);
            return this;
        }

        @JsonSetter(value = "start_time", nulls = Nulls.SKIP)
        public Builder startTime(Optional<OffsetDateTime> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder startTime(OffsetDateTime startTime) {
            this.startTime = Optional.of(startTime);
            return this;
        }

        @JsonSetter(value = "end_time", nulls = Nulls.SKIP)
        public Builder endTime(Optional<OffsetDateTime> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder endTime(OffsetDateTime endTime) {
            this.endTime = Optional.of(endTime);
            return this;
        }

        @JsonSetter(value = "account", nulls = Nulls.SKIP)
        public Builder account(Optional<EngagementAccount> account) {
            this.account = account;
            return this;
        }

        public Builder account(EngagementAccount account) {
            this.account = Optional.of(account);
            return this;
        }

        @JsonSetter(value = "contacts", nulls = Nulls.SKIP)
        public Builder contacts(Optional<List<Optional<EngagementContactsItem>>> contacts) {
            this.contacts = contacts;
            return this;
        }

        public Builder contacts(List<Optional<EngagementContactsItem>> contacts) {
            this.contacts = Optional.of(contacts);
            return this;
        }

        @JsonSetter(value = "remote_was_deleted", nulls = Nulls.SKIP)
        public Builder remoteWasDeleted(Optional<Boolean> remoteWasDeleted) {
            this.remoteWasDeleted = remoteWasDeleted;
            return this;
        }

        public Builder remoteWasDeleted(Boolean remoteWasDeleted) {
            this.remoteWasDeleted = Optional.of(remoteWasDeleted);
            return this;
        }

        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(String id) {
            this.id = Optional.of(id);
            return this;
        }

        @JsonSetter(value = "remote_id", nulls = Nulls.SKIP)
        public Builder remoteId(Optional<String> remoteId) {
            this.remoteId = remoteId;
            return this;
        }

        public Builder remoteId(String remoteId) {
            this.remoteId = Optional.of(remoteId);
            return this;
        }

        @JsonSetter(value = "created_at", nulls = Nulls.SKIP)
        public Builder createdAt(Optional<OffsetDateTime> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            this.createdAt = Optional.of(createdAt);
            return this;
        }

        @JsonSetter(value = "modified_at", nulls = Nulls.SKIP)
        public Builder modifiedAt(Optional<OffsetDateTime> modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        public Builder modifiedAt(OffsetDateTime modifiedAt) {
            this.modifiedAt = Optional.of(modifiedAt);
            return this;
        }

        @JsonSetter(value = "field_mappings", nulls = Nulls.SKIP)
        public Builder fieldMappings(Optional<Map<String, JsonNode>> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }

        public Builder fieldMappings(Map<String, JsonNode> fieldMappings) {
            this.fieldMappings = Optional.of(fieldMappings);
            return this;
        }

        @JsonSetter(value = "remote_data", nulls = Nulls.SKIP)
        public Builder remoteData(Optional<List<RemoteData>> remoteData) {
            this.remoteData = remoteData;
            return this;
        }

        public Builder remoteData(List<RemoteData> remoteData) {
            this.remoteData = Optional.of(remoteData);
            return this;
        }

        @JsonSetter(value = "remote_fields", nulls = Nulls.SKIP)
        public Builder remoteFields(Optional<List<RemoteField>> remoteFields) {
            this.remoteFields = remoteFields;
            return this;
        }

        public Builder remoteFields(List<RemoteField> remoteFields) {
            this.remoteFields = Optional.of(remoteFields);
            return this;
        }

        public Engagement build() {
            return new Engagement(
                    owner,
                    content,
                    subject,
                    direction,
                    engagementType,
                    startTime,
                    endTime,
                    account,
                    contacts,
                    remoteWasDeleted,
                    id,
                    remoteId,
                    createdAt,
                    modifiedAt,
                    fieldMappings,
                    remoteData,
                    remoteFields,
                    additionalProperties);
        }
    }
}
