package com.sunlights.customer.dal.impl;

import com.sunlights.common.dal.EntityBaseDao;
import com.sunlights.customer.dal.LoginDao;
import models.LoginHistory;

import javax.persistence.Query;
import java.util.List;

/**
 * <p>Project: fsp</p>
 * <p>Title: LoginDao.java</p>
 * <p>Description: </p>
 * <p>Copyright (c) 2014 Sunlights.cc</p>
 * <p>All Rights Reserved.</p>
 *
 * @author <a href="mailto:jiaming.wang@sunlights.cc">wangJiaMing</a>
 */

public class LoginDaoImpl extends EntityBaseDao implements LoginDao {
    @Override
    public LoginHistory saveLoginHistory(LoginHistory loginHistory) {
        return create(loginHistory);
    }

    @Override
    public LoginHistory updateLoginHistory(LoginHistory loginHistory) {
        return update(loginHistory);
    }

    public LoginHistory findByPwd(String customerId) {
        return getLoginHistory(customerId, "findByPwd");
    }

    public LoginHistory findByGesturePwd(String customerId) {
        return getLoginHistory(customerId, "findByGesturePwd");
    }

    public LoginHistory findByLoginCustomer(String customerId) {
        return getLoginHistory(customerId, "findByLoginCustomer");
    }

    private LoginHistory getLoginHistory(String customerId, String queryName) {
        Query query = createNameQuery(queryName, customerId);
        List<LoginHistory> list = query.getResultList();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
