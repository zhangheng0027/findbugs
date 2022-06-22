package com.zh.findbugs;

import edu.umd.cs.findbugs.annotation.DetectorFindbugs;
import edu.umd.cs.findbugs.bcel.OpcodeStackDetector;

@DetectorFindbugs(clazz="com.zh.findbugs.Text")
public class Text extends OpcodeStackDetector {

//    @Override
//    public boolean beforeOpcode(int i) {
//        return true;
//    }

    @Override
    public void sawOpcode(int i) {
        System.out.println("abcd");
    }
}
