package com.fengmang.cleanlogs.cleanadjiangsulogs.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SDT14325
 * created at 18:03 2019/12/6
 */
@RestController
@RequestMapping("/api")
public class CleanLogController {

    @RequestMapping("/readLog")
    public JSONObject readLog() {
        JSONObject back = new JSONObject();
        back.put("result", "ok");
        back.put("result2", "ok");
        return back;
    }
}
