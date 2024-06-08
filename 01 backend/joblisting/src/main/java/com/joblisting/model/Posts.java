package com.joblisting.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "JobPost")
public class Posts {

    private String desc;
    private String profile;
    private int exp;
    private String[] techs;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "desc='" + desc + '\'' +
                ", profile='" + profile + '\'' +
                ", exp=" + exp +
                ", techs=" + Arrays.toString(techs) +
                '}';
    }

    public Posts(String desc, String profile, int exp, String[] techs) {
        this.desc = desc;
        this.profile = profile;
        this.exp = exp;
        this.techs = techs;
    }

    public Posts() {
        super();
    }
}
