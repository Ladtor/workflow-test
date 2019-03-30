package com.example.demo.task;

import com.alibaba.fastjson.JSONObject;
import com.ladtor.workflow.task.bo.Key;
import com.ladtor.workflow.task.task.AbstractTask;
import org.springframework.stereotype.Component;

@Component
public class Sleep5sTask extends AbstractTask {

    public Sleep5sTask() {
        super("sleep5s");
    }

    public void execute(Key key, JSONObject params) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {

        }
        this.success(key, params);
    }
}
