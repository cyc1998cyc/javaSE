package com.chen.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.entity.TArea;
import com.chen.entity.User;
import com.chen.listenner.EasyExcelListenner;
import com.chen.mapper.TAreaMapper;
import com.chen.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TAreaMapper tAreaMapper;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/test")
    public Object test() {

        /*for (int i = 0; i < 1000; i++) {
            TArea tArea = new TArea();
            tArea.setId(i+"");
            tArea.setAreaName("cyc"+i);
            tArea.setLevel(i+"");
            tArea.setParentId((i+1)+"");
            tArea.setParentName("cyc"+i);
            tAreaMapper.insert(tArea);
        }*/

        Page<TArea> page = new Page<>(1, 500);

        Page<TArea> tAreaPage = tAreaMapper.selectPage(page, null);

        List<TArea> records = tAreaPage.getRecords();


        return tAreaPage;
    }

    @RequestMapping("/output")
    public Object output() {
        Page<TArea> page = new Page<>(1, 500);

        Page<TArea> tAreaPage = tAreaMapper.selectPage(page, null);

        List<TArea> records = tAreaPage.getRecords();

        String path = "C:\\Users\\cyc\\Desktop\\city.xlsx";
        ExcelWriter excelWriter = EasyExcel.write(path, TArea.class).build();
        WriteSheet writeSheet = EasyExcel.writerSheet("test").build();
        excelWriter.write(records, writeSheet);
        excelWriter.finish();
        System.out.println("导出成功");
        return records;
    }

    @RequestMapping("/output2")
    public Object output2() {

        String path = "C:\\Users\\cyc\\Desktop\\city.xlsx";
        Long count = tAreaMapper.selectCount(null);
        int sheetNum = (int) (count % 100 == 0 ? count / 100 : count / 100 + 1);


        ExcelWriter excelWriter = EasyExcel.write(path, TArea.class).build();
        for (int i = 1; i <= sheetNum; i++) {

            Page<TArea> page = new Page<>(i, 100);

            Page<TArea> tAreaPage = tAreaMapper.selectPage(page, null);

            List<TArea> records = tAreaPage.getRecords();


            WriteSheet writeSheet = EasyExcel.writerSheet("test" + i).build();
            System.out.println("第 " + i + " 批数据导入成功！");
            excelWriter.write(records, writeSheet);


        }
        excelWriter.finish();

        return "success";

    }

    @RequestMapping("/input")
    public Object input(){
        String path = "C:\\Users\\cyc\\Desktop\\city.xlsx";
        ExcelReader excelReader = EasyExcel.read(path, TArea.class, new EasyExcelListenner()).build();
        ReadSheet build = EasyExcel.readSheet(0).build();

        excelReader.read(build);
        excelReader.finish();
        return null;

    }
}

