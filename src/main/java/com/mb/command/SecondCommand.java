package com.mb.command;

import com.mb.context.MyContext;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

public class SecondCommand implements Command {

    public boolean execute(Context context) throws Exception {
        String value = ((MyContext) context).getProperty();
        System.out.println("This is second command: " + value);

        return false;
    }
}
