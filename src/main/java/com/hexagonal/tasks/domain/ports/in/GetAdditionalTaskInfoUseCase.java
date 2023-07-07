package com.hexagonal.tasks.domain.ports.in;

import com.hexagonal.tasks.domain.model.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
