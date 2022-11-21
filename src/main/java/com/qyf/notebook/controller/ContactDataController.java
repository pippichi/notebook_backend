package com.qyf.notebook.controller;

import com.qyf.notebook.dto.IDS;
import com.qyf.notebook.entity.ContactData;
import com.qyf.notebook.service.IContactDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/contact")
@RequiredArgsConstructor
public class ContactDataController {
    
    IContactDataService contactDataService;

    @PostMapping("page")
    public List<ContactData> queryPageList(Map<String, String> body) throws Exception{
        // TODO
        return contactDataService.list();
    }

    @PostMapping("add")
    public Boolean add(ContactData contactData){
        return contactDataService.save(contactData);
    }

    @PutMapping("update")
    public Boolean update(ContactData contactData){
        return contactDataService.updateById(contactData);
    }

    @DeleteMapping("batchDelete")
    public Boolean batchDelete(IDS ids){
        return contactDataService.removeByIds(ids.getIdList());
    }
}
