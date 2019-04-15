package com.example.demo.task;

import com.alibaba.fastjson.JSONObject;
import com.ladtor.workflow.task.exception.TaskFailException;
import com.ladtor.workflow.task.task.AbstractTask;
import org.springframework.stereotype.Component;

@Component
public class Sleep1sTask extends AbstractTask {
    public Sleep1sTask(){
        super("sleep1");
    }

    @Override
    protected JSONObject doExecute(JSONObject params) throws TaskFailException {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {

        }
        return params;
    }
}
