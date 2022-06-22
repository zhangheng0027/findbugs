package edu.umd.cs.findbugs.annotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BugPatternFindbugsHandle {

    public static List<Object> get() {
        Class c = com.zh.findbugs.Text.class;
        Object d = c.getAnnotation(BugPatternFindbugs.class);
//        return new ArrayList<>(d);
        return Arrays.asList(d);
    }


}
