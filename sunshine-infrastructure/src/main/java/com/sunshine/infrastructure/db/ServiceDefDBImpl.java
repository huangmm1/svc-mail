package com.sunshine.infrastructure.db;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.sunshine.business.db.IServiceDefDBInterface;
import com.sunshine.business.entity.ServiceDefEntity;
import com.sunshine.infrastructure.conver.InfrastructureCommonConverter;
import com.sunshine.infrastructure.entity.ServiceDefDO;
import com.sunshine.infrastructure.service.IServiceDefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class ServiceDefDBImpl implements IServiceDefDBInterface {

    @Autowired
    private IServiceDefService defService;

    @Autowired
    private InfrastructureCommonConverter commonConverter;

    @Override
    public boolean insertOneServiceDef(ServiceDefEntity serviceDefEntity) {

        ServiceDefDO serviceDefDO = commonConverter.toServiceDefDO(serviceDefEntity);
        boolean flg = defService.save(serviceDefDO);
        return flg;
    }

    @Override
    public boolean insertListServiceDef(List<ServiceDefEntity> serviceDefEntitys) {

        List<ServiceDefDO> serviceDefDOS = commonConverter.toListServiceDefDO(serviceDefEntitys);
        boolean flg = defService.saveBatch(serviceDefDOS);
        return flg;
    }

    @Override
    public boolean removeOneServiceDefById(String id) {

        LambdaUpdateWrapper<ServiceDefDO> wrapper = new LambdaUpdateWrapper<>();
        if(null == id || "".equals(id)){
            return false;
        }
        wrapper.eq(ServiceDefDO::getServCd, id);
        boolean flg = defService.remove(wrapper);
        return flg;
    }

    @Override
    public boolean updateOneServiceDef(ServiceDefEntity serviceDefEntity) {

        ServiceDefDO serviceDefDO = commonConverter.toServiceDefDO(serviceDefEntity);
        boolean flg = defService.updateById(serviceDefDO);
        return flg;
    }

    @Override
    public List<ServiceDefEntity> getListServiceDef(ServiceDefEntity serviceDefEntity) {

        LambdaQueryWrapper<ServiceDefDO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(StringUtils.hasText(serviceDefEntity.getServCd()), ServiceDefDO::getServCd, serviceDefEntity.getServCd())
                .eq(StringUtils.hasText(serviceDefEntity.getSysId()), ServiceDefDO::getSysId, serviceDefEntity.getSysId())
                .eq(StringUtils.hasText(serviceDefEntity.getServEngNm()), ServiceDefDO::getServEngNm, serviceDefEntity.getServEngNm())
                .eq(StringUtils.hasText(serviceDefEntity.getServStsCd()), ServiceDefDO::getServStsCd, serviceDefEntity.getServStsCd())
                .eq(StringUtils.hasText(serviceDefEntity.getServBigCgyCd()), ServiceDefDO::getServBigCgyCd, serviceDefEntity.getServBigCgyCd());
        List<ServiceDefDO> list = defService.list(wrapper);
        List<ServiceDefEntity> serviceDefEntities = commonConverter.toListServiceDefEntity(list);
        return serviceDefEntities;
    }
}
