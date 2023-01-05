package com.bankapp.web.controlller;

import com.bankapp.service.facade.BankService;
import com.bankapp.web.forms.DepositForm;
import com.bankapp.web.forms.TransferForm;
import com.bankapp.web.forms.WithdrawForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {
    private BankService bankService;
    @Autowired
    public AccountController(BankService bankService) {
        this.bankService = bankService;
    }


    @GetMapping("/")
    public String index(){
        return "redirect:showallaccounts";
    }

    //----------------------------showallaccounts-------------
    @GetMapping(path = "showallaccounts")
    public String showAllAccounts(ModelMap modelMap){
        modelMap.addAttribute("accounts", bankService.getAll());
        return "showallaccounts";
    }



    //----------------------------transfer-------------
    @GetMapping(path = "transfer")
    public String transferGet(@ModelAttribute(name = "transferForm") TransferForm transferForm){
        return "transfer";
    }

    @PostMapping(path = "transfer")
    public String transferPost( @ModelAttribute(name = "transferForm") TransferForm transferForm){
      bankService.transfer(transferForm.getFromAccId(), transferForm.getToAccId(), transferForm.getAmount());
        return "redirect:showallaccounts";
    }




    //----------------------------transfer-------------
    @GetMapping(path = "deposit")
    public String depostGet(@ModelAttribute(name = "depositForm") DepositForm depositForm){
        return "deposit";
    }

    @PostMapping(path = "deposit")
    public String depositPost( @ModelAttribute(name = "depositForm") DepositForm depositForm){
        bankService.deposit(depositForm.getAccId(), depositForm.getAmount());
        return "redirect:showallaccounts";
    }



    //----------------------------withdraw-------------
    @GetMapping(path = "withdraw")
    public String withdrawGet(@ModelAttribute(name = "withdraw")WithdrawForm withdrawForm){
        return "withdraw";
    }

    @PostMapping(path = "withdraw")
    public String withdrawPost( @ModelAttribute(name = "withdraw")WithdrawForm withdrawForm){
        bankService.withdraw(withdrawForm.getAccId(),withdrawForm.getAmount());
        return "redirect:showallaccounts";
    }

}













