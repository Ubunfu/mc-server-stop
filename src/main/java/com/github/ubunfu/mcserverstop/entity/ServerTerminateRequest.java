package com.github.ubunfu.mcserverstop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServerTerminateRequest {
    private String instanceId;
}
