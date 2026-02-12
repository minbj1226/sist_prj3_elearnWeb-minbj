package kr.co.sist.instructor.dashboard;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstructorDashBoardService {

	@Autowired(required=false) 
	private InstructorDashBoardMapper adbm;
	
	public int getTotalCountInst() throws PersistenceException {
		int count=adbm.selectCountInst();
		
		return count;
	}//getTotalCountInst

	public int getTotalCountLect() throws PersistenceException {
		int count=adbm.selectCountLect();
		
		return count;
	}//getTotalCountLect
	
	public int getTotalCountUser() throws PersistenceException {
		int count=adbm.selectCountUser();
		
		return count;
	}//getTotalCountUser
	
	public int getTotalProfit() throws PersistenceException {
		int count=adbm.selectAllProfit();
		
		return count;
	}//getTotalProfit
	
	public List<InstructorDashBoardDomain> selectTopPayLecture() throws PersistenceException {
		List<InstructorDashBoardDomain> list=adbm.selectTopPayLecture();
		
		return list;
	}//selectTopPayLecture
	
	public List<InstructorDashBoardDomain> selectMostUserLecture() throws PersistenceException {
		List<InstructorDashBoardDomain> list=adbm.selectMostUserLecture();
		
		return list;
	}//selectMostUserLecture
	
}