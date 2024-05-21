package com.chen.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.chen.entity.EasyConfirmData;
import java.util.Date;
import com.chen.mapper.EasyConfirmDataMapper;
import com.chen.service.EasyConfirmDataService;
@Service
public class EasyConfirmDataServiceImpl implements EasyConfirmDataService{

    @Resource
    private EasyConfirmDataMapper easyConfirmDataMapper;

    @Override
    public int deleteByPrimaryKey(Long easyConfirmDataId,Date createTime) {
        return easyConfirmDataMapper.deleteByPrimaryKey(easyConfirmDataId,createTime);
    }

    @Override
    public int insert(EasyConfirmData record) {
        return easyConfirmDataMapper.insert(record);
    }

    @Override
    public int insertSelective(EasyConfirmData record) {
        return easyConfirmDataMapper.insertSelective(record);
    }

    @Override
    public EasyConfirmData selectByPrimaryKey(Long easyConfirmDataId,Date createTime) {
        return easyConfirmDataMapper.selectByPrimaryKey(easyConfirmDataId,createTime);
    }

    @Override
    public int updateByPrimaryKeySelective(EasyConfirmData record) {
        return easyConfirmDataMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(EasyConfirmData record) {
        return easyConfirmDataMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<EasyConfirmData> list) {
        return easyConfirmDataMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<EasyConfirmData> list) {
        return easyConfirmDataMapper.batchInsert(list);
    }

}
