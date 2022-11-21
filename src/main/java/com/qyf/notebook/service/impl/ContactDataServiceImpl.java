package com.qyf.notebook.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qyf.notebook.entity.ContactData;
import com.qyf.notebook.service.IContactDataService;
import org.springframework.stereotype.Service;

@Service
public class ContactDataServiceImpl extends ServiceImpl<BaseMapper<ContactData>, ContactData> implements IService<ContactData>, IContactDataService {
}
