package org.tomaszkowalczyk94.commandline.controller;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import org.tomaszkowalczyk94.commandline.core.CoreApi;
import org.tomaszkowalczyk94.commandline.core.TaskDto;
import org.tomaszkowalczyk94.commandline.gui.TaskListView;
import retrofit2.Response;

import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class TasksListController {

    CoreApi coreApi;
    TaskListView taskListView;

    @SneakyThrows
    public void reloadTasksList() {

        Response<List<TaskDto>> response = coreApi.tasks().execute();

        if (response.isSuccessful()) {
            taskListView.removeAll();
            Objects.requireNonNull(response.body())
                    .forEach(taskListView::addTask);

        } else {
            throw new ResponseNotSuccessfulException();
        }
    }

}
