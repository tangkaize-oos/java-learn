package com.liaoxuefeng.kJnuit;

/**
 * @Auther: 李将
 * @Date: 2020/7/10 18:35
 * @Descprition:
 */
public class Config {
    public String getConfigFile(String filename) {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            return "C:\\" + filename;
        }
        if (os.contains("mac") || os.contains("linux") || os.contains("unix")) {
            return "/usr/local/" + filename;
        }
        throw new UnsupportedOperationException();
    }
}