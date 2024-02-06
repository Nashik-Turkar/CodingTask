package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.GroupData;
import com.main.service.GroupService;

@CrossOrigin("*")
@RestController
@RequestMapping("/Group")
public class GroupController {

	@Autowired
	GroupService gsi;
	
	@PostMapping(value="savegroup")
	public ResponseEntity<String> SaveGroupData(@RequestBody GroupData gdata) {
		gsi.SaveGroupData(gdata);
		return new ResponseEntity<String>("dataSubmited", HttpStatus.ACCEPTED);	
	}
	
	@GetMapping(value= "getAllGroups")
	public ResponseEntity<List<GroupData>> getAllData(){
		List<GroupData> data = gsi.getAllData();
		return new ResponseEntity<List<GroupData>>(data, HttpStatus.FOUND);
		
	}
	
	@PutMapping(value="getgroupbyid/{gid}")
	public ResponseEntity<String> updateData(@RequestBody GroupData dataforupdate, @PathVariable int gid){
		String resp= gsi.updateGroup(dataforupdate, gid);
		if(resp.equals("update")) {
			return new ResponseEntity<String>(resp, HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<String>("not accepted", HttpStatus.NOT_ACCEPTABLE);

	}
	
	@DeleteMapping(value= "/deletedata/{gid}")
	public  ResponseEntity<String> deleteDatabyId(@PathVariable int gid) {
		String resp=gsi.deleteGroup(gid);
		if(resp.equals("update")) {
			return new ResponseEntity<String>(resp, HttpStatus.FOUND);
		}
		return new ResponseEntity<String>("not accepted", HttpStatus.NOT_FOUND);
	}
	
	
	
	
	
	
	
	
	

	
	
	
	
}
