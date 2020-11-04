package org.tomaszkowalczyk94.commandline.core;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface CoreApi {

    @GET("tasks/")
    Call<List<TaskDto>> tasks();

}