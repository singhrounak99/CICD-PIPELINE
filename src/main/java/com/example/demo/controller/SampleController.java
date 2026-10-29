package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Response.SampleResponse;
import com.example.demo.Service.SampleService;
import com.example.demo.request.SampleRequest;

@RestController
@RequestMapping
public class SampleController
{
	@Autowired
	SampleService sampleService;

	@PostMapping("place")
	public SampleResponse placeOrder(@RequestBody SampleRequest sampleRequest)
	{
		System.out.println("OrderController.placeOrder():::::::::::::::::::::::::::: START");
		SampleResponse sampleResponse = sampleService.SampleData(sampleRequest);
		System.out.println("OrderController.placeOrder():::::::::::::::::::::::::::: END");
		return sampleResponse;
	}

}
