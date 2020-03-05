package com.mb.second_example_catalog;

import com.mb.constant.MyCommandNamed;
import com.mb.context.MyContext;
import org.apache.commons.chain.Catalog;
import org.apache.commons.chain.Command;

public class ChainStart {
    public static void main(String[] args) throws Exception {
        //Create context
        MyContext context = new MyContext();
        context.setProperty("property-value");
        context.put("custom-key", "custom-value");

        //Get the catalog
        Catalog catalog = new MyCatalog();

        //Get the command
        System.out.println("Execute the specific command: CMD_1");
        Command firstCommand = catalog.getCommand(MyCommandNamed.CMD_1.name());
        firstCommand.execute(context);

        System.out.println("\nExecute the specific chain: CHAIN_1");
        Command chain = catalog.getCommand(MyCommandNamed.CHAIN_1.name());
        chain.execute(context);
    }
}
