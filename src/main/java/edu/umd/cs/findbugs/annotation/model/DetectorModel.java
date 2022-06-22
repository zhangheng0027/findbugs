package edu.umd.cs.findbugs.annotation.model;

import edu.umd.cs.findbugs.annotation.DetectorFindbugs;

public class DetectorModel {

    public DetectorModel(String clazz, DetectorFindbugs d) {
        this.clazz = clazz;
        this.speed = d.speed();
        this.disabled = d.disabled();
        this.reports = d.reports();
        this.requirejre = d.requirejre();
        this.hidden = d.hidden();
    }

    private String clazz;
    private String speed;
    private boolean disabled;
    private String reports;
    private String requirejre;
    private boolean hidden;

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public String getReports() {
        return reports;
    }

    public void setReports(String reports) {
        this.reports = reports;
    }

    public String getRequirejre() {
        return requirejre;
    }

    public void setRequirejre(String requirejre) {
        this.requirejre = requirejre;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
}
