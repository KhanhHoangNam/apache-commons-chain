package com.mb.third_example_exception;

import com.mb.context.MyContext;
import org.apache.commons.chain.Command;

public class ChainStart {
    public static void main(String[] args) throws Exception {
        Command chain = new MyChain();
        chain.execute(new MyContext());
    }
}
