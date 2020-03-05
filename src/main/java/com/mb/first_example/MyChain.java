package com.mb.first_example;

import com.mb.command.FirstCommand;
import com.mb.command.SecondCommand;
import org.apache.commons.chain.impl.ChainBase;

public class MyChain extends ChainBase {
    public MyChain() {
        super();
        addCommand(new FirstCommand());
        addCommand(new SecondCommand());
    }
}
