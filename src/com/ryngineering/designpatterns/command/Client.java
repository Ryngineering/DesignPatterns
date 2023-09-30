package com.ryngineering.designpatterns.command;

import com.ryngineering.designpatterns.command.impl.DownloadRequestCommand;
import com.ryngineering.designpatterns.command.impl.FinancialComputationCommand;
import com.ryngineering.designpatterns.command.impl.NetworkTaskCommand;
import com.ryngineering.designpatterns.command.invoker.TaskExecutor;
import com.ryngineering.designpatterns.command.receivers.DownloadRequest;
import com.ryngineering.designpatterns.command.receivers.FinancialComputation;
import com.ryngineering.designpatterns.command.receivers.NetworkTask;

public class Client {


    public static void main(String[] args) {
        DownloadRequest downloadRequest = new DownloadRequest();
        FinancialComputation financialComputation = new FinancialComputation();
        NetworkTask networkTask = new NetworkTask();

        DownloadRequestCommand downloadRequestCommand = new DownloadRequestCommand();
        FinancialComputationCommand financialComputationCommand = new FinancialComputationCommand();
        NetworkTaskCommand networkTaskCommand = new NetworkTaskCommand();

        downloadRequestCommand.setDownloadRequest(downloadRequest);
        financialComputationCommand.setFinancialComputation(financialComputation);
        networkTaskCommand.setNetworkTask(networkTask);

        TaskExecutor taskExecutor = new TaskExecutor();

        taskExecutor.addTasks(downloadRequestCommand);
        taskExecutor.addTasks(financialComputationCommand);
        taskExecutor.addTasks(networkTaskCommand);
        taskExecutor.addTasks(() -> System.out.println("Some random task"));

        taskExecutor.process();

    }
}
