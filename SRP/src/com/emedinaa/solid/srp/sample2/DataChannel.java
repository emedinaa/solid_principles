package com.emedinaa.solid.srp.sample2;

/**
 * Created by emedinaa on 18/07/16.
 */
public interface DataChannel {
    void send(char c);
    char recv();
}
