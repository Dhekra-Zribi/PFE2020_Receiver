package com.smpp.api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



//@CrossOrigin(origins = "http://localhost:88")
@RestController
@RequestMapping("/api/auth")
public class ReceiverController {

	@Autowired
	ReceiverService service;

	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;
	@Autowired
	private SmsRepository smsRepository;
	
	//@GetMapping("inject_mo{short_message}{source_addr}{destination_addr}{submit}{data_coding}")
	//public void recu(@Valid @RequestBody Sms sms) {
	//public void recu(@RequestParam String short_message,@RequestParam String source_addr,@RequestParam String destination_addr,@RequestParam String submit, @RequestParam String data_coding) {
	
	@PostConstruct
	public void recu() {
		
		service.recu();
		//service.deleteAllNb();
		//service.countTrByDate();
	}
	
	@GetMapping("/smsrecu")
	public List<Sms> getAll(){
		return service.getAllTr();
	}
	
	
}
