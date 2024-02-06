package com.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.GroupData;
import com.main.service.GroupService;
import com.main.sturepository.GroupRepository;

@Service
public class MainServiceImpl implements GroupService{
	
	@Autowired
	GroupRepository gri;

	@Override
	public void SaveGroupData(GroupData gdata) {
		gri.save(gdata);
	}

	@Override
	public List<GroupData> getAllData() {
		List<GroupData> gd = gri.findAll();
		return gd;
	}

	@Override
	public String updateGroup(GroupData dataforupdate, int gid) {
		GroupData g = gri.getById(gid);
		if(g.getGroupid().equals(gid)) {
			gri.save(dataforupdate);
			return "update";
		}
		return "Error";
	}

	@Override
	public String deleteGroup(int gid) {
		
		GroupData g = gri.getById(gid);
		if(g.getGroupid().equals(gid)) {
			gri.deleteById(gid);
			return "deleted";
		}
		return "Idnotpresent";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
