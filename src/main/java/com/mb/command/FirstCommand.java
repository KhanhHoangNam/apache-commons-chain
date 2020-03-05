package com.mb.command;

import com.mb.context.MyContext;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

public class FirstCommand implements Command {

    public boolean execute(Context context) throws Exception {
        System.out.println("This is first command: ");

        String property = ((MyContext) context).getProperty();
        System.out.println("+ property: " + property);

        String customValue = context.get("custom-key").toString();
        System.out.println("+ customValue: " + customValue);

        return false;
    }
}
