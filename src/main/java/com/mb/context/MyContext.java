package com.mb.context;

import lombok.Data;
import org.apache.commons.chain.impl.ContextBase;

@Data
public class MyContext extends ContextBase {
    private String property;
}
