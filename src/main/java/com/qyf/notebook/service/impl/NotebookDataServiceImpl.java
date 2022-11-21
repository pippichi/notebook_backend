package com.qyf.notebook.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qyf.notebook.entity.NotebookData;
import com.qyf.notebook.service.INotebookDataService;
import org.springframework.stereotype.Service;

@Service
public class NotebookDataServiceImpl extends ServiceImpl<BaseMapper<NotebookData>, NotebookData> implements IService<NotebookData>, INotebookDataService {
}
