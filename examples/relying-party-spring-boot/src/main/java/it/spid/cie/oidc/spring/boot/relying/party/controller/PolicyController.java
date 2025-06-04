package it.spid.cie.oidc.spring.boot.relying.party.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/oidc/rp")
public class PolicyController {
    @GetMapping("/policy")
    public ModelAndView home(HttpServletRequest request)
            throws Exception {

        ModelAndView mav = new ModelAndView("policy");

        return mav;
    }

}