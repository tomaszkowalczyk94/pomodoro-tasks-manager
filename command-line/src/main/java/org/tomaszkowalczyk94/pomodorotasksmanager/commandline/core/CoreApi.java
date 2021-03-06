package org.tomaszkowalczyk94.pomodorotasksmanager.commandline.core;

import org.tomaszkowalczyk94.pomodorotasksmanager.coremodel.TaskDto;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface CoreApi {

    @GET("tasks/")
    Call<List<TaskDto>> tasks();

    @POST("tasks/")
    Call<TaskDto> createTask(@Body TaskDto taskDto);

    @DELETE("tasks/{id}")
    Call<Void> removeTask(@Path("id") long id);

}
