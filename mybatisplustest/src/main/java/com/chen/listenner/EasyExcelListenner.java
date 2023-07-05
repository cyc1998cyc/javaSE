package com.chen.listenner;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.chen.entity.TArea;

public class EasyExcelListenner extends AnalysisEventListener<TArea> {
    @Override
    public void invoke(TArea tArea, AnalysisContext analysisContext) {
        System.out.println(tArea);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        System.out.println(analysisContext);
    }
}
