package billservice.service;

import billservice.entity.Bill;
import billservice.exceprion.BillNotFoundException;
import billservice.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class BillService {
    private  final BillRepository billRepository;

    @Autowired
    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    public Bill getBillById(Long billId){
        return  billRepository.findById(billId)
                .orElseThrow(() -> new BillNotFoundException("Can't find bill with billId:" + billId));
    }

    public Long saveBill(BigDecimal amount, Boolean isOverdraftEnabled, Long accountId){
        Bill bill = new Bill(amount, isOverdraftEnabled, accountId);
        return billRepository.save(bill).getId();
        }



    public Bill getBillByAccountId(Long billAccountId){
        return  billRepository.findBillByAccountId(billAccountId)
                .orElseThrow(() -> new BillNotFoundException("Can't find bill with account id:" + billAccountId));
    }


    public List<Bill> getBills(){
        return billRepository.findAll();
    }



}

