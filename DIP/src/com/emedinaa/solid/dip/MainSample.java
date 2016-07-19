package com.emedinaa.solid.dip;

import com.emedinaa.solid.dip.sample.NRobot;
import com.emedinaa.solid.dip.sample.TerminatorRobotBody;

/**
 * Created by emedinaa on 18/07/16.
 */
public class MainSample {

    public static void main(String[] args) {
        NRobot nRobot= new NRobot(new TerminatorRobotBody());
        nRobot.findSarahConnor();
    }
}
