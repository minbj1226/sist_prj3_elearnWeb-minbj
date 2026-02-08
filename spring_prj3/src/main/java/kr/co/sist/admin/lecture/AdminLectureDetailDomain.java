package kr.co.sist.admin.lecture;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Alias("lectDetailDomain")

@Getter
@Setter
@ToString
public class AdminLectureDetailDomain {
	private String lectId, lectName, thumbnail, categoryName, instName, intro;
	private int price, userCount, availability, approval;
	private Date regDate;
}