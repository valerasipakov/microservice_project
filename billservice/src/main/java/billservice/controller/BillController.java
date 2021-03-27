package billservice.controller;

import billservice.dto.BillRequestDTO;
import billservice.dto.BillResponseDTO;
import billservice.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BillController {

    private final BillService billService;

    @Autowired
    public BillController(BillService billService) {
        this.billService = billService;
    }

    @PostMapping("/bills")
    @ResponseBody
    public Long createBill(@RequestBody BillRequestDTO billRequestDTO){
        return billService.saveBill(billRequestDTO.getAmount(),
                billRequestDTO.getIsOverdraftEnabled(), billRequestDTO.getAccountId());
    }

    @GetMapping("/bills/{billId}")
    @ResponseBody
    public BillResponseDTO getBill(@PathVariable Long billId){
        return new BillResponseDTO(billService.getBillByAccountId(billId));
    }


    @GetMapping("/bills_by_account_id/{accountId}")
    @ResponseBody
    public BillResponseDTO getBillByAccountId(@PathVariable Long accountId){
        return  new BillResponseDTO(billService.getBillByAccountId(accountId));
    }

    @GetMapping("/bills")
    @ResponseBody
    public List<BillResponseDTO> getBills(){
       return billService.getBills().stream()
                .map(BillResponseDTO::new)
                .collect(Collectors.toList());
    }

}
