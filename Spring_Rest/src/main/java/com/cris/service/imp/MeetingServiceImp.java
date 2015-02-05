package com.cris.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cris.dao.MeetingDao;
import com.cris.model.Meeting;
import com.cris.service.MeetingService;

@Service
public class MeetingServiceImp implements MeetingService {

	@Autowired
	private MeetingDao meetingDao;
	
	
	@Transactional
	public void add(Meeting meeting) {
		meetingDao.add(meeting);

	}

	@Transactional
	public void edit(Meeting meeting) {
		meetingDao.edit(meeting);

	}

	@Transactional
	public void delete(int id_meeting) {
		meetingDao.delete(id_meeting);

	}

	@Transactional
	public Meeting getMeeting(int id_meeting) {
		return meetingDao.getMeeting(id_meeting);
	}

	@Transactional
	public List<Meeting> getAllMeetings() {
		return meetingDao.getAllMeetings();
	}

}
