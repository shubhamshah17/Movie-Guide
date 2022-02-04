package com.shubham.movieguide.network;

import com.getkeepsafe.relinker.BuildConfig;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Singleton;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

@Singleton
public class RequestInterceptor implements Interceptor {

    @Inject
    public RequestInterceptor() {
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();
        HttpUrl originalHttpUrl = original.url();

        HttpUrl url = originalHttpUrl.newBuilder()
                .addQueryParameter("api_key", "4e31dd3b407bdb0180770abf251e44ef")
                .build();

        Request request = original.newBuilder().url(url).build();
        return chain.proceed(request);
    }
}
