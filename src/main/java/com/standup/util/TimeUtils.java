package com.standup.util;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;

import java.util.Date;

public class TimeUtils {

    public static void main(String[] args) {
        Date startTime = DateUtil.parseDate("2019-11-30").toJdkDate();
        Date endTime = DateUtil.date().toJdkDate();
        long howManyDays = DateUtil.between(startTime, endTime, DateUnit.DAY);
        System.out.println("已经 " + howManyDays + " 天没有工作");
    }

}
