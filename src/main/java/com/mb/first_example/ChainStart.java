package com.mb.first_example;

import com.mb.context.MyContext;
import org.apache.commons.chain.Command;

public class ChainStart {
    public static void main(String[] args) throws Exception {
        //Create context
        MyContext context = new MyContext();
        context.setProperty("property-value");
        context.put("custom-key", "custom-value");

        //Get the command
        Command command = new MyChain();
        command.execute(context);
    }
}
