package com.ryngineering.designpatterns.command.impl;

import com.ryngineering.designpatterns.command.Command;
import com.ryngineering.designpatterns.command.receivers.FinancialComputation;

public class FinancialComputationCommand implements Command {

    private FinancialComputation financialComputation;

    public void setFinancialComputation(FinancialComputation financialComputation) {
        this.financialComputation = financialComputation;
    }

    @Override
    public void execute() {
        financialComputation.compute();
    }
}
