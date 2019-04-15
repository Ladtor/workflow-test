package com.example.demo.task;

import com.alibaba.fastjson.JSONObject;
import com.ladtor.workflow.task.exception.TaskFailException;
import com.ladtor.workflow.task.task.AbstractTask;
import org.springframework.stereotype.Component;

@Component
public class Sleep20sTask extends AbstractTask {
    public Sleep20sTask() {
        super("sleep20s");
    }

    @Override
    protected JSONObject doExecute(JSONObject params) throws TaskFailException {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException ignored) {

        }
        return params;
    }
}
