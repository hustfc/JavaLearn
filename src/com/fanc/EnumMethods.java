package com.fanc;

import java.text.DateFormat;
import java.util.Date;

/**
 * @Author : fanc
 * @Date : 2019/11/16 11:27 上午
 */
public enum EnumMethods {
    /**
     * 时间
     */
    DATE_TIME {
        @Override
        String getInfo() {
            return DateFormat.getDateInstance().format(new Date());
        }
    },
    /**
     * 路径
     */
    CLASSPATH {
        @Override
        String getInfo() {
            return System.getenv("CLASSPATH");
        }
    },
    /**
     * 版本
     */
    VERSION {
        @Override
        String getInfo() {
            return System.getProperty("java.version");
        }
    };
    abstract String getInfo();

    public static void main(String[] args) {
        for (EnumMethods sm : values()) {
            System.out.println(sm.getInfo());
        }
    }
}
