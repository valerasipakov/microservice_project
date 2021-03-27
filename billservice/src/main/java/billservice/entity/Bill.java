package billservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private BigDecimal amount;

    private  Boolean isOverdraftEnabled;

    private Long accountId;

    public Bill() {
    }

    public Bill(BigDecimal amount, Boolean isOverdraftEnable, Long accountId) {
        this.amount = amount;
        this.isOverdraftEnabled = isOverdraftEnable;
        this.accountId = accountId;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Boolean getIsOverdraftEnabled() {
        return isOverdraftEnabled;
    }

    public void setIsOverdraftEnabled(Boolean overdraftEnable) {
        isOverdraftEnabled = isOverdraftEnabled;
    }

    public Long getAccountId() {
        return accountId;
    }

    public Boolean getOverdraftEnabled() {
        return isOverdraftEnabled;
    }

    public void setOverdraftEnabled(Boolean overdraftEnable) {
        isOverdraftEnabled = isOverdraftEnabled;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}
