package com.cris.dao.imp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cris.dao.MeetingDao;
import com.cris.model.Meeting;


@Repository
public class MeetingDaoImp implements MeetingDao {

	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Meeting meeting) {
		session.getCurrentSession().save(meeting);
	}

	@Override
	public void edit(Meeting meeting) {
		session.getCurrentSession().update(meeting);
	}

	@Override
	public void delete(int id_meeting) {
		session.getCurrentSession().delete(getMeeting(id_meeting));

	}

	@Override
	public Meeting getMeeting(int id_meeting) {
		
		return (Meeting)session.getCurrentSession().get(Meeting.class, id_meeting);
	}

	@Override
	public List<Meeting> getAllMeetings() {
		return session.getCurrentSession().createQuery("from Meeting").list();
	}
}
