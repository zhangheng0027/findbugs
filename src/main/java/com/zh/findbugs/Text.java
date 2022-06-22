package com.zh.findbugs;

import edu.umd.cs.findbugs.annotation.BugPatternFindbugs;
import edu.umd.cs.findbugs.annotation.DetectorFindbugs;
import edu.umd.cs.findbugs.bcel.OpcodeStackDetector;

@BugPatternFindbugs(type = "SYSTEM_OUT_ERROR", abbrev = "SYSTEM_OUT_ERROR",  category = "PERFORMANCE")
@DetectorFindbugs(clazz="com.zh.findbugs.Text", reports = "SYSTEM_OUT_ERROR")
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
