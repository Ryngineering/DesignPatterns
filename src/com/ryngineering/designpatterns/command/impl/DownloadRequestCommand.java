package com.ryngineering.designpatterns.command.impl;

import com.ryngineering.designpatterns.command.Command;
import com.ryngineering.designpatterns.command.receivers.DownloadRequest;

public class DownloadRequestCommand implements Command {

    private DownloadRequest downloadRequest;

    public void setDownloadRequest(DownloadRequest downloadRequest) {
        this.downloadRequest = downloadRequest;
    }

    @Override
    public void execute() {
        downloadRequest.download();
    }
}
