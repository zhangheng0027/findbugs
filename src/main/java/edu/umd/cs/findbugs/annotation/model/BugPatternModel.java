package edu.umd.cs.findbugs.annotation.model;

public class BugPatternModel {

    public BugPatternModel() {

    }

    private String type;
    private String abbrev;
    private String category;
    private boolean experimental;
    private int cweid;
    private boolean deprecated;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isExperimental() {
        return experimental;
    }

    public void setExperimental(boolean experimental) {
        this.experimental = experimental;
    }

    public int getCweid() {
        return cweid;
    }

    public void setCweid(int cweid) {
        this.cweid = cweid;
    }

    public boolean isDeprecated() {
        return deprecated;
    }

    public void setDeprecated(boolean deprecated) {
        this.deprecated = deprecated;
    }
}
