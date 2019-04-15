package com.example.demo.task;

import com.alibaba.fastjson.JSONObject;
import com.ladtor.workflow.task.exception.TaskFailException;
import com.ladtor.workflow.task.task.AbstractTask;
import org.springframework.stereotype.Component;

@Component
public class SleepTask extends AbstractTask {
    public SleepTask() {
        super("sleep");
    }

    @Override
    protected JSONObject doExecute(JSONObject params) throws TaskFailException {
        params.put("start", System.currentTimeMillis());
        try {
            Integer val = params.getInteger("val");
            if (val != null) {
                Thread.sleep(val * 1000);
            }
        } catch (InterruptedException e) {
            params.put("end", System.currentTimeMillis());
            throw new TaskFailException(params);
        }
        params.put("end", System.currentTimeMillis());
        return params;
    }
}
