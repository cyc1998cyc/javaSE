package com.chen.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import java.util.Date;
import com.chen.entity.GeneralConfirmData;
import com.chen.mapper.GeneralConfirmDataMapper;
import com.chen.service.GeneralConfirmDataService;
@Service
public class GeneralConfirmDataServiceImpl implements GeneralConfirmDataService{

    @Resource
    private GeneralConfirmDataMapper generalConfirmDataMapper;

    @Override
    public int deleteByPrimaryKey(Long generalConfirmDataId,Date createTime) {
        return generalConfirmDataMapper.deleteByPrimaryKey(generalConfirmDataId,createTime);
    }

    @Override
    public int insert(GeneralConfirmData record) {
        return generalConfirmDataMapper.insert(record);
    }

    @Override
    public int insertSelective(GeneralConfirmData record) {
        return generalConfirmDataMapper.insertSelective(record);
    }

    @Override
    public GeneralConfirmData selectByPrimaryKey(Long generalConfirmDataId,Date createTime) {
        return generalConfirmDataMapper.selectByPrimaryKey(generalConfirmDataId,createTime);
    }

    @Override
    public int updateByPrimaryKeySelective(GeneralConfirmData record) {
        return generalConfirmDataMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GeneralConfirmData record) {
        return generalConfirmDataMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<GeneralConfirmData> list) {
        return generalConfirmDataMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<GeneralConfirmData> list) {
        return generalConfirmDataMapper.batchInsert(list);
    }

}
