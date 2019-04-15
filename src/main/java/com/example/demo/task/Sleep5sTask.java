package com.example.demo.task;

import com.alibaba.fastjson.JSONObject;
import com.ladtor.workflow.task.exception.TaskFailException;
import com.ladtor.workflow.task.task.AbstractTask;
import org.springframework.stereotype.Component;

@Component
public class Sleep5sTask extends AbstractTask {

    public Sleep5sTask() {
        super("sleep5s");
    }

    @Override
    protected JSONObject doExecute(JSONObject params) throws TaskFailException {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {

        }
        return params;
    }
}
