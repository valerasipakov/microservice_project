package billservice.dto;

import billservice.entity.Bill;

import java.math.BigDecimal;

public class BillResponseDTO {

    private BigDecimal amount;


    private  Boolean isOverdraftEnabled;


    public BillResponseDTO(Bill bill){
        this.amount = bill.getAmount();
        this.isOverdraftEnabled = bill.getIsOverdraftEnabled();
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setIsOverdraftEnabled(Boolean overdraftEnable) {
        isOverdraftEnabled = overdraftEnable;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Boolean getIsOverdraftEnabled() {
        return isOverdraftEnabled;
    }

    public BillResponseDTO() {
    }

    public BillResponseDTO(BigDecimal amount, Boolean isOverdraftEnable) {
        this.amount = amount;
        this.isOverdraftEnabled = isOverdraftEnable;
    }
}
