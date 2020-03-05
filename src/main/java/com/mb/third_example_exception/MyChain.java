package com.mb.third_example_exception;

import com.mb.command.FirstCommand;
import com.mb.command.ThirdCommand;
import com.mb.filter.CommandExceptionHandler;
import org.apache.commons.chain.impl.ChainBase;

public class MyChain extends ChainBase {
    public MyChain() {
        super();
        addCommand(new CommandExceptionHandler());
        addCommand(new FirstCommand());
        addCommand(new ThirdCommand());
    }
}
