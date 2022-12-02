package com.standup.util;

import cn.hutool.Hutool;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;

import java.util.List;

public class ZzExcelUtil {

    public static void main(String[] args) {
        executeExcel();
    }

    public static void executeExcel(){
        ExcelReader reader = ExcelUtil.getReader("/Users/macbookpro/Desktop/1.内蒙古医科大学校内教职员工情况统计表（截止2022年10月11日）(1).xls");
        int sheetCount = reader.getSheetCount();
//        List sheets = reader.getSheets();
        List<String> sheetNames = reader.getSheetNames();
        sheetNames.stream().forEach(e -> System.out.println(e));

    }
}
