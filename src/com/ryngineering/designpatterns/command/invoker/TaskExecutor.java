package com.ryngineering.designpatterns.command.invoker;

import com.ryngineering.designpatterns.command.Command;

import java.util.ArrayList;
import java.util.List;

public class TaskExecutor {

    private List<Command> tasks = new ArrayList<>();

    public void addTasks(Command task) {
        tasks.add(task);
    }

    public void process() {
        tasks.stream().parallel().forEach(task -> task.execute());
    }

}
