package com.qyf.notebook.controller;

import com.qyf.notebook.dto.IDS;
import com.qyf.notebook.entity.NotebookData;
import com.qyf.notebook.service.INotebookDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/notebook")
@RequiredArgsConstructor
public class NotebookDataController {

    private final INotebookDataService notebookDataService;

    @PostMapping("page")
    public List<NotebookData> queryPageList(Map<String, String> body) throws Exception{
        // TODO
        return notebookDataService.list();
    }

    @PostMapping("add")
    public Boolean add(NotebookData notebookData){
        return notebookDataService.save(notebookData);
    }

    @PutMapping("update")
    public Boolean update(NotebookData notebookData){
        return notebookDataService.updateById(notebookData);
    }

    @DeleteMapping("batchDelete")
    public Boolean batchDelete(IDS ids){
        return notebookDataService.removeByIds(ids.getIdList());
    }

}
