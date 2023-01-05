package com.bankapp.web.controlller;

import com.bankapp.service.facade.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {
    private BankService bankService;
    @Autowired
    public AccountController(BankService bankService) {
        this.bankService = bankService;
    }
    @GetMapping(path = "showallaccounts")
    public String showAllAccounts(ModelMap modelMap){
        modelMap.addAttribute("accounts", bankService.getAll());
        return "showallaccounts";
    }
}













