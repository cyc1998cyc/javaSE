package com.chen.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.chen.mapper.FqRcvCardNoListMapper;
import com.chen.entity.FqRcvCardNoList;
import com.chen.service.FqRcvCardNoListService;
@Service
public class FqRcvCardNoListServiceImpl implements FqRcvCardNoListService{

    @Resource
    private FqRcvCardNoListMapper fqRcvCardNoListMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return fqRcvCardNoListMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(FqRcvCardNoList record) {
        return fqRcvCardNoListMapper.insert(record);
    }

    @Override
    public int insertSelective(FqRcvCardNoList record) {
        return fqRcvCardNoListMapper.insertSelective(record);
    }

    @Override
    public FqRcvCardNoList selectByPrimaryKey(Integer id) {
        return fqRcvCardNoListMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(FqRcvCardNoList record) {
        return fqRcvCardNoListMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FqRcvCardNoList record) {
        return fqRcvCardNoListMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<FqRcvCardNoList> list) {
        return fqRcvCardNoListMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<FqRcvCardNoList> list) {
        return fqRcvCardNoListMapper.batchInsert(list);
    }

}
