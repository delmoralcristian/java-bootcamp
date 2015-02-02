package com.cris.dao;

import java.util.List;

import com.cris.model.Meeting;

public interface MeetingDao {
	public void add (Meeting meeting);
	public void edit (Meeting meeting);
	public void delete (int id_meeting);
	public Meeting getMeeting(int id_meeting);
	public List<Meeting> getAllMeetings();

}
