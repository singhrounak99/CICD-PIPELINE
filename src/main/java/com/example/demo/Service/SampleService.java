package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Response.SampleResponse;
import com.example.demo.entity.SampleEntity;
import com.example.demo.repositary.SampleRepositary;
import com.example.demo.request.SampleRequest;

@Service
public class SampleService
{
	@Autowired
	SampleRepositary sampleRepositary1;

	public SampleResponse SampleData(SampleRequest sampleRequest)
	{
		int rollNumber = sampleRequest.getRollNumber();
		String studentName = sampleRequest.getStudentName();

		SampleEntity sampleEntity = new SampleEntity();
		sampleEntity.setStudentName(studentName);
		sampleEntity.setRollNumber(rollNumber);

		SampleEntity save = sampleRepositary1.save(sampleEntity);

		int rollNumber1 = save.getRollNumber();
		String studentName2 = save.getStudentName();
		int id = save.getId();
		
		SampleResponse sampleResponse=new SampleResponse();
		sampleResponse.setId(id);
		sampleResponse.setRollNumber(rollNumber1);
		sampleResponse.setStudentName(studentName2);
		
		

		return sampleResponse;
	}
}