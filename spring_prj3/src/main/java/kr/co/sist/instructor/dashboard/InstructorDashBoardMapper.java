package kr.co.sist.instructor.dashboard;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InstructorDashBoardMapper {
	
	public int selectCountLect();
	public int selectScoreReview();
}