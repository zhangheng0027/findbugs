package edu.umd.cs.findbugs.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DetectorFindbugs {
    String clazz() default "";
    String speed() default "fast";
    boolean disabled() default true;
    String reports() default "";
    String requirejre() default "";
    boolean hidden() default true;
}

