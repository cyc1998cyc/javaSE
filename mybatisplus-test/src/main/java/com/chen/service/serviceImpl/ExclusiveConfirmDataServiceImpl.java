package com.chen.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.chen.mapper.ExclusiveConfirmDataMapper;
import java.util.Date;
import com.chen.entity.ExclusiveConfirmData;
import com.chen.service.ExclusiveConfirmDataService;
@Service
public class ExclusiveConfirmDataServiceImpl implements ExclusiveConfirmDataService{

    @Resource
    private ExclusiveConfirmDataMapper exclusiveConfirmDataMapper;

    @Override
    public int deleteByPrimaryKey(Long exclusiveConfirmDataId,Date createTime) {
        return exclusiveConfirmDataMapper.deleteByPrimaryKey(exclusiveConfirmDataId,createTime);
    }

    @Override
    public int insert(ExclusiveConfirmData record) {
        return exclusiveConfirmDataMapper.insert(record);
    }

    @Override
    public int insertSelective(ExclusiveConfirmData record) {
        return exclusiveConfirmDataMapper.insertSelective(record);
    }

    @Override
    public ExclusiveConfirmData selectByPrimaryKey(Long exclusiveConfirmDataId,Date createTime) {
        return exclusiveConfirmDataMapper.selectByPrimaryKey(exclusiveConfirmDataId,createTime);
    }

    @Override
    public int updateByPrimaryKeySelective(ExclusiveConfirmData record) {
        return exclusiveConfirmDataMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ExclusiveConfirmData record) {
        return exclusiveConfirmDataMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<ExclusiveConfirmData> list) {
        return exclusiveConfirmDataMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<ExclusiveConfirmData> list) {
        return exclusiveConfirmDataMapper.batchInsert(list);
    }

}
