package kr.co.sist.instructor.dashboard;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InstructorDashBoardMapper {
	
	public int selectCountInst();
	public int selectCountLect();
	public int selectCountUser();
	public int selectAllProfit();
	public List<InstructorDashBoardDomain> selectTopPayLecture();
	public List<InstructorDashBoardDomain> selectMostUserLecture();
	
}
