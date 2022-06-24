/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.formhandler.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Steed
 */
@RestController
public class FormReceiver {
 
  @GetMapping("/testForm")
@ResponseStatus(HttpStatus.OK)
  String testForm() {
    System.out.println("Accessed the Form Receiver");
    return "It worked!";
  }
}
