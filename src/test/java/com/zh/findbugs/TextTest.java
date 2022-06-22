package com.zh.findbugs;

import edu.umd.cs.findbugs.LaunchAppropriateUI;
import org.junit.Test;

import static org.junit.Assert.*;

public class TextTest {

    @Test
    public void a() throws Exception {
        String[] args = {"-textui", "e:\\project\\2022\\findbugs\\target\\classes\\com\\zh\\error"};
        LaunchAppropriateUI launcher = new LaunchAppropriateUI(args);
        launcher.launch();
    }

}