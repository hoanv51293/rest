package com.sample.rest.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListController {

    @RequestMapping(value = "/TodoList", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public Map<String, Object> search(HttpServletRequest request,
            @RequestParam(value = "allSearch", defaultValue = "") String allSearch) throws Exception {
        Map<String, Object> data = new HashMap<>();
        data.put("statusCode", "OK");
        return data;
    }

    @RequestMapping(value = "/TodoList", method = { RequestMethod.POST }, produces = {
            MediaType.APPLICATION_JSON_VALUE })
    public Map<String, Object> maintenance(HttpServletRequest request
     //, @RequestBody HoSoModel model
    ) throws Exception {
        Map<String, Object> data = new HashMap<>();
        data.put("statusCode", "OK");
        return data;
    }
    
    @RequestMapping(value = "", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public Map<String, Object> init(HttpServletRequest request,
            @RequestParam(value = "allSearch", defaultValue = "") String allSearch) throws Exception {
        Map<String, Object> data = new HashMap<>();
        data.put("statusCode", "OK");
        return data;
    }
}