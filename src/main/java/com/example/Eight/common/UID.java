package com.example.Eight.common;

import java.util.UUID;

/**
 * @author 12572
 */
public class UID {
    public String produceUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
