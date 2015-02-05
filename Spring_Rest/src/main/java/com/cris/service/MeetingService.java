package com.cris.service;

import java.util.List;

import com.cris.model.Meeting;

public interface MeetingService {
	public void add (Meeting meeting);
	public void edit (Meeting meeting);
	public void delete (int id_meeting);
	public Meeting getMeeting(int id_meeting);
	public List<Meeting> getAllMeetings();
}
