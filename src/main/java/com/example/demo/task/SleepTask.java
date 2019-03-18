package com.example.demo.task;

import com.alibaba.fastjson.JSONObject;
import com.ladtor.workflow.task.bo.Key;
import com.ladtor.workflow.task.task.AbstractTask;
import org.springframework.stereotype.Component;

@Component
public class SleepTask extends AbstractTask {
    public void execute(Key key, JSONObject params) {
        params.put("start", System.currentTimeMillis());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            params.put("end", System.currentTimeMillis());
            fail(key, params);
            return;
        }
        params.put("end", System.currentTimeMillis());
        success(key, params);
    }

    public String getKey() {
        return "sleep";
    }
}
