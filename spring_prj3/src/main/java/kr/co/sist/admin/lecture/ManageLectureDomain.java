package kr.co.sist.admin.lecture;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Alias("lectListDomain")

@Getter
@Setter
@ToString
public class ManageLectureDomain {
	private String lect_name, inst_name, thumbnail;
	private int score, usercount, total_profit, availability;
}
