package kr.co.sist.admin.payment;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminPaymentService {

	@Autowired(required=false)
	private AdminPaymentMapper apm;
	
	public int getTotalProfit() throws PersistenceException {
		int count=apm.selectAllProfit();
		
		return count;
	}//getTotalProfit
	
	public List<LectProfitDomain> getLectProfit() throws PersistenceException {
		List<LectProfitDomain> lectProfitList;
		
		lectProfitList=apm.selectLectProfit();
		return lectProfitList;
	}//getLectProfit
}