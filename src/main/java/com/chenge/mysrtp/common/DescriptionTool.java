package com.chenge.mysrtp.common;

public class DescriptionTool {
    /**
     * 结合title和body便得到了description
     * @param title
     * @param body
     * @return
     */
    public static String getDes(String title, String body){
        return title + " " + body;
    }
}
