package com.T7.journalApp.controller;


import com.T7.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class journalEntryController {

    private Map<Long, JournalEntry> journalEntries=new HashMap();

    @GetMapping
    public List<JournalEntry> getAll(){ // localhost:8080/journal GET
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry MyEntry){ // localhost:8080/journal POST
        journalEntries.put(MyEntry.getId(),MyEntry);
        return true;
    }


    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable long myId){
       return journalEntries.get(myId);
    }
}
