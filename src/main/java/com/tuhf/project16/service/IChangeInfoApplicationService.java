package com.tuhf.project16.service;

import com.tuhf.project16.model.ChangeInfoApplication;

import java.util.Collection;

public interface IChangeInfoApplicationService {
    int addApplication(ChangeInfoApplication application);

    Collection<ChangeInfoApplication> getApplicationsByCarrierId(long carrierId);
}
