package models;

import javax.persistence.*;
import java.util.Date;

/**
 * <p>Project: financeplatform</p>
 * <p>Title: FundAgreement.java</p>
 * <p>Description: </p>
 * <p>Copyright (c) 2014 Sunlights.cc</p>
 * <p>All Rights Reserved.</p>
 *
 * @author <a href="mailto:jiaming.wang@sunlights.cc">wangJiaMing</a>
 */
@Entity
@Table(name = "f_fund_Agreement")
public class FundAgreement extends IdEntity {
    @Column(name = "customer_id", length = 30)
    private String customerId;
    @Column(name = "fund_company_id", length = 100)
    private String fundCompanyId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_time")
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_time")
    private Date updateTime;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFundCompanyId() {
        return fundCompanyId;
    }

    public void setFundCompanyId(String fundCompanyId) {
        this.fundCompanyId = fundCompanyId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
