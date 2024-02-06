package com.main.service;

import java.util.List;

import com.main.model.GroupData;

public interface GroupService {

	void SaveGroupData(GroupData gdata);

	List<GroupData> getAllData();

	String updateGroup(GroupData dataforupdate, int gid);

	String deleteGroup(int gid);



	
	
}
