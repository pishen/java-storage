package com.google.cloud.storage;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Presigned V4 post policy.
 *
 * @see <a href="https://cloud.google.com/storage/docs/xml-api/post-object" POST Object</a>
 */
public final class PostPolicyV4 {
    private String url;
    private Map<String, String> fields;

    private PostPolicyV4(String url, Map<String, String> fields) {
        this.url = url;
        this.fields = fields;
    }

    public static PostPolicyV4 of(String url, Map<String, String> fields) {
        return new PostPolicyV4(url, fields);
    }

    public String getUrl() {
        return url;
    }

    public Map<String, String> getFields() {
        return fields;
    }

    /**
     * Class representing which fields to specify in a V4 POST request.
     *
     * @see <a href=https://cloud.google.com/storage/docs/xml-api/post-object#form_fields> POST Object Form fields</a>
     */
    public static final class PostFieldsV4 {
        private Map<String, String> fieldsMap;

        private PostFieldsV4(Builder builder) {
            this.fieldsMap = new HashMap<>();
            fieldsMap.put("acl", builder.acl);
            fieldsMap.put("cache-control", builder.cacheControl);
            fieldsMap.put("content-disposition", builder.contentDisposition);
            fieldsMap.put("content-length", builder.contentLength);
            fieldsMap.put("content-encoding", builder.contentEncoding);
            fieldsMap.put("content-type", builder.contentType);
            fieldsMap.put("expires", builder.expires);
            fieldsMap.put("success_action_redirect", builder.successActionRedirect);
            fieldsMap.put("success_action_status", builder.successActionStatus);
        }

        private PostFieldsV4(Map<String, String> fields) {
            this.fieldsMap = fields;
        }

        public static PostFieldsV4 of(Map<String, String> fields) {
            return new PostFieldsV4(fields);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Map<String, String> getFieldsMap() {
            return fieldsMap;
        }

        public static class Builder {
            private String acl;
            private String cacheControl;
            private String contentDisposition;
            private String contentEncoding;
            private String contentLength;
            private String contentType;
            private String expires;
            private String successActionRedirect;
            private String successActionStatus;

            private Builder() {
            }

            public PostFieldsV4 build() {
                return new PostFieldsV4(this);
            }

            public Builder setAcl(String acl) {
                this.acl = acl;
                return this;
            }

            public Builder setCacheControl(String cacheControl) {
                this.cacheControl = cacheControl;
                return this;
            }

            public Builder setContentDisposition(String contentDisposition) {
                this.contentDisposition = contentDisposition;
                return this;
            }

            public Builder setContentEncoding(String contentEncoding) {
                this.contentEncoding = contentEncoding;
                return this;
            }

            public Builder setContentLength(int contentLength) {
                this.contentLength = "" + contentLength;
                return this;
            }

            public Builder setContentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            public Builder Expires(String expires) {
                this.expires = expires;
                return this;
            }

            public Builder setSuccessActionRedirect(String successActionRedirect) {
                this.successActionRedirect = successActionRedirect;
                return this;
            }

            public Builder setSuccessActionStatus(int successActionStatus) {
                this.successActionStatus = "" + successActionStatus;
                return this;
            }
        }
    }

    /**
     * Class for specifying conditions in a V4 POST Policy document.
     *
     * @see <a href="https://cloud.google.com/storage/docs/authentication/signatures#policy-document"> Policy document</a>
     */
    public static final class PostConditionsV4 {
        private Set<ConditionV4> conditions;

        private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

        public PostConditionsV4(Builder builder) {
            this.conditions = builder.conditions;
        }

        public Builder toBuilder() {
            return new Builder(conditions);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Set<ConditionV4> getConditions() {
            return conditions;
        }

        public static class Builder {
            Set<ConditionV4> conditions;

            private Builder() {
                this.conditions = new LinkedHashSet<>();
            }

            private Builder(Set<ConditionV4> conditions) {
                this.conditions = conditions;
            }

            public static Builder newBuilder() {
                return new Builder();
            }

            public PostConditionsV4 build() {
                return new PostConditionsV4(this);
            }

            public Builder addAclCondition(ConditionV4Type type, String acl) {
                conditions.add(ConditionV4.newV4Condition(type, "acl", acl));
                return this;
            }

            public Builder addBucketCondition(ConditionV4Type type, String bucket) {
                conditions.add(ConditionV4.newV4Condition(type, "bucket", bucket));
                return this;
            }

            public Builder addCacheControlCondition(ConditionV4Type type, String cacheControl) {
                conditions.add(ConditionV4.newV4Condition(type, "cache-control", cacheControl));
                return this;
            }

            public Builder addContentDispositionCondition(
                    ConditionV4Type type, String contentDisposition) {
                conditions.add(ConditionV4.newV4Condition(type, "content-disposition", contentDisposition));
                return this;
            }

            public Builder addContentEncodingCondition(ConditionV4Type type, String contentEncoding) {
                conditions.add(ConditionV4.newV4Condition(type, "content-encoding", contentEncoding));
                return this;
            }

            public Builder addContentLengthCondition(ConditionV4Type type, int contentLength) {
                conditions.add(ConditionV4.newV4Condition(type, "content-length", "" + contentLength));
                return this;
            }

            public Builder addContentTypeCondition(ConditionV4Type type, String contentType) {
                conditions.add(ConditionV4.newV4Condition(type, "content-type", contentType));
                return this;
            }

            public Builder addExpiresCondition(ConditionV4Type type, long expires) {
                conditions.add(ConditionV4.newV4Condition(type, "expires", dateFormat.format(expires)));
                return this;
            }

            public Builder addExpiresCondition(ConditionV4Type type, String expires) {
                conditions.add(ConditionV4.newV4Condition(type, "expires", expires));
                return this;
            }

            public Builder addKeyCondition(ConditionV4Type type, String key) {
                conditions.add(ConditionV4.newV4Condition(type, "key", key));
                return this;
            }

            public Builder addSuccessActionRedirectUrlCondition(
                    ConditionV4Type type, String successActionRedirectUrl) {
                conditions.add(
                        ConditionV4.newV4Condition(type, "success_action_redirect", successActionRedirectUrl));
                return this;
            }

            public Builder addSuccessActionStatusCondition(ConditionV4Type type, int status) {
                conditions.add(ConditionV4.newV4Condition(type, "success_action_status", "" + status));
                return this;
            }

            public Builder addCustomMetadataCondition(ConditionV4Type type, String field, String value) {
                conditions.add(ConditionV4.newV4Condition(type, "x-goog-meta-" + field, value));
                return this;
            }

            public Builder addContentLengthRange(int min, int max) {
                conditions.add(
                        ConditionV4.newV4Condition(ConditionV4Type.CONTENT_LENGTH_RANGE, "" + min, "" + max));
                return this;
            }

            public Builder addCustomCondition(ConditionV4Type type, String field, String value) {
                conditions.add(ConditionV4.newV4Condition(type, field, value));
                return this;
            }
        }
    }

    /**
     * Class for a V4 POST Policy document.
     *
     * @see <a href="https://cloud.google.com/storage/docs/authentication/signatures#policy-document"> Policy document</a>
     */
    public static final class PostPolicyV4Document {
        private String expiration;
        private PostConditionsV4 conditions;

        private PostPolicyV4Document(String expiration, PostConditionsV4 conditions) {
            this.expiration = expiration;
            this.conditions = conditions;
        }

        public static PostPolicyV4Document of(String expiration, PostConditionsV4 conditions) {
            return new PostPolicyV4Document(expiration, conditions);
        }

        public String toJson() {
            JsonObject object = new JsonObject();
            JsonArray conditions = new JsonArray();
            for (ConditionV4 condition : this.conditions.conditions) {
                switch (condition.type) {
                    case MATCHES:
                        JsonObject match = new JsonObject();
                        match.addProperty(condition.element, condition.value);
                        conditions.add(match);
                        break;
                    case STARTS_WITH:
                        JsonArray startsWith = new JsonArray();
                        startsWith.add("starts-with");
                        startsWith.add("$" + condition.element);
                        startsWith.add(condition.value);
                        conditions.add(startsWith);
                        break;
                    case CONTENT_LENGTH_RANGE:
                        JsonArray contentLengthRange = new JsonArray();
                        contentLengthRange.add("content-length-range");
                        contentLengthRange.add(Integer.parseInt(condition.element));
                        contentLengthRange.add(Integer.parseInt(condition.value));
                        conditions.add(contentLengthRange);
                        break;
                }
            }
            object.add("conditions", conditions);
            object.addProperty("expiration", expiration);

            String json = object.toString();
            StringBuilder escapedJson = new StringBuilder();

            //Certain characters in a policy must be escaped
            for (char c : json.toCharArray()) {
                if (c >= 128) { //is a unicode character
                    escapedJson.append(String.format("\\u%04x", (int) c));
                } else {
                    switch (c) {
                        case '\\': escapedJson.append("\\\\"); break;
                        case '\b' : escapedJson.append("\\b"); break;
                        case '\f' : escapedJson.append("\\f"); break;
                        case '\n' : escapedJson.append("\\n"); break;
                        case '\r' : escapedJson.append("\\r"); break;
                        case '\t' : escapedJson.append("\\t"); break;
                        case '\u000b' : escapedJson.append("\\v"); break;
                        default : escapedJson.append(c);
                    }
                }
            }
            return escapedJson.toString();
        }
    }

    enum ConditionV4Type {
        MATCHES,
        STARTS_WITH,
        CONTENT_LENGTH_RANGE
    }

    /**
     * Class for a specific POST policy document condition.
     *
     * @see <a href="https://cloud.google.com/storage/docs/authentication/signatures#policy-document"> Policy document</a>
     */
    public static final class ConditionV4 {
        ConditionV4Type type;
        String element;
        String value;

        private ConditionV4(ConditionV4Type type, String element, String value) {
            this.type = type;
            this.element = element;
            this.value = value;
        }

        public static ConditionV4 newV4Condition(ConditionV4Type type, String element, String value) {
            return new ConditionV4(type, element, value);
        }

        @Override
        public boolean equals(Object other) {
            ConditionV4 condition = (ConditionV4) other;
            return this.type == condition.type
                    && this.element.equals(condition.element)
                    && this.value.equals(condition.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(type, element, value);
        }
    }
}
