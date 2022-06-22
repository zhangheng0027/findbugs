package edu.umd.cs.findbugs.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface BugPatternFindbugs {

    String type();
    String abbrev();
    String category();
    boolean experimental();
    int cweid() default 0;
    boolean deprecated();

}
