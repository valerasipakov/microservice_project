package billservice.dto;

import java.math.BigDecimal;

public class BillRequestDTO {
 private BigDecimal amount;

 private  Boolean isOverdraftEnabled;

 private Long accountId;

 public BillRequestDTO() {
 }

 public BillRequestDTO(BigDecimal amount, Boolean isOverdraftEnable, Long accountId) {
  this.amount = amount;
  this.isOverdraftEnabled = isOverdraftEnable;
  this.accountId = accountId;
 }

 public BigDecimal getAmount() {
  return amount;
 }

 public Boolean getIsOverdraftEnabled() {
  return isOverdraftEnabled;
 }

 public Long getAccountId() {
  return accountId;
 }
}
