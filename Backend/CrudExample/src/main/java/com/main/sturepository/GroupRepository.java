package com.main.sturepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.model.GroupData;

@Repository
public interface GroupRepository extends JpaRepository<GroupData, Integer>{

}
