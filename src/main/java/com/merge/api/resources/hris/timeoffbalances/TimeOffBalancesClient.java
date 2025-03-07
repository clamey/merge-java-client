/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.merge.api.resources.hris.timeoffbalances;

import com.merge.api.core.ApiError;
import com.merge.api.core.ClientOptions;
import com.merge.api.core.ObjectMappers;
import com.merge.api.core.RequestOptions;
import com.merge.api.resources.hris.timeoffbalances.requests.TimeOffBalancesListRequest;
import com.merge.api.resources.hris.timeoffbalances.requests.TimeOffBalancesRetrieveRequest;
import com.merge.api.resources.hris.types.PaginatedTimeOffBalanceList;
import com.merge.api.resources.hris.types.TimeOffBalance;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

public class TimeOffBalancesClient {
    protected final ClientOptions clientOptions;

    public TimeOffBalancesClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Returns a list of <code>TimeOffBalance</code> objects.
     */
    public PaginatedTimeOffBalanceList list() {
        return list(TimeOffBalancesListRequest.builder().build());
    }

    /**
     * Returns a list of <code>TimeOffBalance</code> objects.
     */
    public PaginatedTimeOffBalanceList list(TimeOffBalancesListRequest request) {
        return list(request, null);
    }

    /**
     * Returns a list of <code>TimeOffBalance</code> objects.
     */
    public PaginatedTimeOffBalanceList list(TimeOffBalancesListRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("api/hris/v1/time-off-balances");
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
        if (request.getEmployeeId().isPresent()) {
            httpUrl.addQueryParameter("employee_id", request.getEmployeeId().get());
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
        if (request.getPolicyType().isPresent()) {
            httpUrl.addQueryParameter(
                    "policy_type", request.getPolicyType().get().toString());
        }
        if (request.getRemoteFields().isPresent()) {
            httpUrl.addQueryParameter("remote_fields", request.getRemoteFields().get());
        }
        if (request.getRemoteId().isPresent()) {
            httpUrl.addQueryParameter("remote_id", request.getRemoteId().get());
        }
        if (request.getShowEnumOrigins().isPresent()) {
            httpUrl.addQueryParameter(
                    "show_enum_origins", request.getShowEnumOrigins().get());
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), PaginatedTimeOffBalanceList.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns a <code>TimeOffBalance</code> object with the given <code>id</code>.
     */
    public TimeOffBalance retrieve(String id) {
        return retrieve(id, TimeOffBalancesRetrieveRequest.builder().build());
    }

    /**
     * Returns a <code>TimeOffBalance</code> object with the given <code>id</code>.
     */
    public TimeOffBalance retrieve(String id, TimeOffBalancesRetrieveRequest request) {
        return retrieve(id, request, null);
    }

    /**
     * Returns a <code>TimeOffBalance</code> object with the given <code>id</code>.
     */
    public TimeOffBalance retrieve(String id, TimeOffBalancesRetrieveRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("api/hris/v1/time-off-balances")
                .addPathSegment(id);
        if (request.getExpand().isPresent()) {
            httpUrl.addQueryParameter("expand", request.getExpand().get());
        }
        if (request.getIncludeRemoteData().isPresent()) {
            httpUrl.addQueryParameter(
                    "include_remote_data", request.getIncludeRemoteData().get().toString());
        }
        if (request.getRemoteFields().isPresent()) {
            httpUrl.addQueryParameter("remote_fields", request.getRemoteFields().get());
        }
        if (request.getShowEnumOrigins().isPresent()) {
            httpUrl.addQueryParameter(
                    "show_enum_origins", request.getShowEnumOrigins().get());
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), TimeOffBalance.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
