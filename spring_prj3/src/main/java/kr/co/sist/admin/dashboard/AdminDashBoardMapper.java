package kr.co.sist.admin.dashboard;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminDashBoardMapper {
	
	public int selectCountInst();
	public int selectCountLect();
	public int selectCountUser();
	public int selectAllProfit();
}
