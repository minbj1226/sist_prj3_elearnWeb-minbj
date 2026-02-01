package kr.co.sist.admin.lecture;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminLectureService {

	@Autowired(required=false)
	private AdminLectureMapper alm;
	
	public List<ManageLectureDomain> searchLectureList() throws PersistenceException{
		List<ManageLectureDomain> lectureList;
		lectureList=alm.selectLectList();
		
		return lectureList;
	}//searchLectureList
}
