package com.sunshine.infrastructure.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunshine.infrastructure.entity.ServiceDefDO;
import com.sunshine.infrastructure.mapper.ServiceDefMapper;
import com.sunshine.infrastructure.service.IServiceDefService;
import org.springframework.stereotype.Service;

@Service
public class ServiceDefServiceImpl extends ServiceImpl<ServiceDefMapper,ServiceDefDO> implements IServiceDefService {
}
