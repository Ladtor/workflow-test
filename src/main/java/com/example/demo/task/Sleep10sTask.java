package com.example.demo.task;

import com.alibaba.fastjson.JSONObject;
import com.ladtor.workflow.task.bo.Key;
import com.ladtor.workflow.task.task.AbstractTask;
import org.springframework.stereotype.Component;

@Component
public class Sleep10sTask extends AbstractTask {
    public void execute(Key key, JSONObject params) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ignored) {

        }
        this.success(key, new JSONObject());
    }

    public String getKey() {
        return "sleep10s";
    }
}
