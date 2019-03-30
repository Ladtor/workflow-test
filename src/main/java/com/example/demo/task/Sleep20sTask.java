package com.example.demo.task;

import com.alibaba.fastjson.JSONObject;
import com.ladtor.workflow.task.bo.Key;
import com.ladtor.workflow.task.task.AbstractTask;
import org.springframework.stereotype.Component;

@Component
public class Sleep20sTask extends AbstractTask {
    public Sleep20sTask() {
        super("sleep20s");
    }

    public void execute(Key key, JSONObject params) {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException ignored) {

        }
        this.success(key, params);
    }
}
