package com.mb.second_example_catalog;

import com.mb.command.FirstCommand;
import com.mb.command.SecondCommand;
import com.mb.constant.MyCommandNamed;
import com.mb.first_example.MyChain;
import org.apache.commons.chain.impl.CatalogBase;

public class MyCatalog extends CatalogBase {
    public MyCatalog() {
        super();
        addCommand(MyCommandNamed.CMD_1.name(), new FirstCommand());
        addCommand(MyCommandNamed.CHAIN_2.name(), new SecondCommand());
        addCommand(MyCommandNamed.CHAIN_1.name(), new MyChain());
    }
}
