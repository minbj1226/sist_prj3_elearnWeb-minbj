package kr.co.sist.admin.lecture;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminLectureService {

	@Autowired(required=false)
	private AdminLectureMapper alm;
	
	//카테고리 옵션
	public List<String> searchAllCategory() throws PersistenceException{
		return alm.selectAllCategory();
	}
	
	//비공개 상태 변경
	public int disableLecture(String lectureId) throws PersistenceException{
		return alm.updateStatus(lectureId);
	}

	//교육 과목 관리 데이터
	public List<ManageLectureDomain> searchLectureByCategory(ManageLectureSearchDTO mlsDTO) throws PersistenceException{
		return alm.selectLectureByCategory(mlsDTO);
	}
	
	//강의 관리 데이터
	public List<ManageNotApprLectureDomain> searchNotApprLectList() throws PersistenceException {
		return alm.selectNotApprLectList();
	}
	
	//강의 관리 상세 데이터
	public List<AdminLectureDetailDomain> searchLectureDetail(String lectureId) throws PersistenceException {
		return alm.selectLectureDetail(lectureId);
	}

}
