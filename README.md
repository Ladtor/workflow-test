### 说明
该项目为[工作流](../../../workflow)调度的任务节点Demo

### 依赖
依赖项目详见[Workflow-Task](../../../workflow-task)

```xml
<dependency>
    <groupId>com.ladtor</groupId>
    <artifactId>workflow-task</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

### 配置
工作流引擎地址

```yaml
workflow:
  sender:
    http:
      url: http://localhost:8080
```

### 使用
实现`com.ladtor.workflow.task.task.AbstractTask`接口，然后到管理系统任务应用配置即可
