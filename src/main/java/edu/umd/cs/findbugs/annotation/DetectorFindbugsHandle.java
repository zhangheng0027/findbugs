package edu.umd.cs.findbugs.annotation;

import edu.umd.cs.findbugs.annotation.model.DetectorModel;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class DetectorFindbugsHandle {

    public static List<Object> get() {
        Class c = com.zh.findbugs.Text.class;
        Object d = c.getAnnotation(DetectorFindbugs.class);

        DetectorFindbugs t = (DetectorFindbugs) d;
        DetectorModel m = new DetectorModel(c.getName(), t);


        return Arrays.asList(m);
    }

}
