package com.mb.command;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

public class ThirdCommand implements Command {
    public boolean execute(Context context) throws Exception {
        throw new UnsupportedOperationException("Cannot execute Fourth Command");
    }
}
