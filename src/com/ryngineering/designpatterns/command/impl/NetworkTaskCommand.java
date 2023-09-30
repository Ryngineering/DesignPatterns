package com.ryngineering.designpatterns.command.impl;

import com.ryngineering.designpatterns.command.Command;
import com.ryngineering.designpatterns.command.receivers.NetworkTask;

public class NetworkTaskCommand implements Command {

    private NetworkTask networkTask;

    public void setNetworkTask(NetworkTask networkTask) {
        this.networkTask = networkTask;
    }

    @Override
    public void execute() {
        networkTask.request();
    }
}
