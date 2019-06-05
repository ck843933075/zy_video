package com.zhiyou.video.service;

import java.util.List;

import com.zhiyou.video.model.CourseModel;
import com.zhiyou.video.model.SubjectModel;

/**
 * Created By zhouyc on 2017年7月16日
 * Descr:
 *
 */
public interface ICourseService {
	
	public List<SubjectModel> querySubjectModels();

	public List<CourseModel> queryCourseModels();
	
	public CourseModel queryCourseById(int id);
	
	public int addCourseModel(CourseModel model);
	
	public boolean updateCourseModel(CourseModel model);
	
	public boolean deleteById(int id);
	
	public List<CourseModel> queryCoursesBySubject(int subject);
	
	public SubjectModel querySubjectById(int subject);
	
}
