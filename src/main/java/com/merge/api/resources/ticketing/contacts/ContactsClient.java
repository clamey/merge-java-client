/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.ticketing.contacts;

import com.merge.api.core.ApiError;
import com.merge.api.core.ClientOptions;
import com.merge.api.core.ObjectMappers;
import com.merge.api.core.RequestOptions;
import com.merge.api.resources.ticketing.contacts.requests.ContactsListRequest;
import com.merge.api.resources.ticketing.contacts.requests.ContactsRetrieveRequest;
import com.merge.api.resources.ticketing.types.Contact;
import com.merge.api.resources.ticketing.types.PaginatedContactList;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

public class ContactsClient {
    protected final ClientOptions clientOptions;

    public ContactsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Returns a list of <code>Contact</code> objects.
     */
    public PaginatedContactList list() {
        return list(ContactsListRequest.builder().build());
    }

    /**
     * Returns a list of <code>Contact</code> objects.
     */
    public PaginatedContactList list(ContactsListRequest request) {
        return list(request, null);
    }

    /**
     * Returns a list of <code>Contact</code> objects.
     */
    public PaginatedContactList list(ContactsListRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("api/ticketing/v1/contacts");
        if (request.getCreatedAfter().isPresent()) {
            httpUrl.addQueryParameter(
                    "created_after", request.getCreatedAfter().get().toString());
        }
        if (request.getCreatedBefore().isPresent()) {
            httpUrl.addQueryParameter(
                    "created_before", request.getCreatedBefore().get().toString());
        }
        if (request.getCursor().isPresent()) {
            httpUrl.addQueryParameter("cursor", request.getCursor().get());
        }
        if (request.getExpand().isPresent()) {
            httpUrl.addQueryParameter("expand", request.getExpand().get());
        }
        if (request.getIncludeDeletedData().isPresent()) {
            httpUrl.addQueryParameter(
                    "include_deleted_data",
                    request.getIncludeDeletedData().get().toString());
        }
        if (request.getIncludeRemoteData().isPresent()) {
            httpUrl.addQueryParameter(
                    "include_remote_data", request.getIncludeRemoteData().get().toString());
        }
        if (request.getModifiedAfter().isPresent()) {
            httpUrl.addQueryParameter(
                    "modified_after", request.getModifiedAfter().get().toString());
        }
        if (request.getModifiedBefore().isPresent()) {
            httpUrl.addQueryParameter(
                    "modified_before", request.getModifiedBefore().get().toString());
        }
        if (request.getPageSize().isPresent()) {
            httpUrl.addQueryParameter("page_size", request.getPageSize().get().toString());
        }
        if (request.getRemoteId().isPresent()) {
            httpUrl.addQueryParameter("remote_id", request.getRemoteId().get());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), PaginatedContactList.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns a <code>Contact</code> object with the given <code>id</code>.
     */
    public Contact retrieve(String id) {
        return retrieve(id, ContactsRetrieveRequest.builder().build());
    }

    /**
     * Returns a <code>Contact</code> object with the given <code>id</code>.
     */
    public Contact retrieve(String id, ContactsRetrieveRequest request) {
        return retrieve(id, request, null);
    }

    /**
     * Returns a <code>Contact</code> object with the given <code>id</code>.
     */
    public Contact retrieve(String id, ContactsRetrieveRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("api/ticketing/v1/contacts")
                .addPathSegment(id);
        if (request.getExpand().isPresent()) {
            httpUrl.addQueryParameter("expand", request.getExpand().get());
        }
        if (request.getIncludeRemoteData().isPresent()) {
            httpUrl.addQueryParameter(
                    "include_remote_data", request.getIncludeRemoteData().get().toString());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Contact.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
