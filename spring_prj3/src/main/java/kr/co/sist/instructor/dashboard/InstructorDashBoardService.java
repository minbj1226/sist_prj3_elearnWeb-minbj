package kr.co.sist.instructor.dashboard;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstructorDashBoardService {

	@Autowired(required=false) 
	private InstructorDashBoardMapper idbm;
	
	public int getTotalCountLect() throws PersistenceException {
		int count=idbm.selectCountLect();
		return count;
	}//getTotalCountInst
	
	public int getTotalScoreReview() throws PersistenceException {
		int score=idbm.selectScoreReview();
		return score;
	}//getTotalCountInst
}