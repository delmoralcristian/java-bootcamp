package com.cris.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cris.model.Meeting;
import com.cris.service.MeetingService;

@Controller
public class MeetingController {
	
	@Autowired
	private MeetingService meetingService;
	
	@RequestMapping("/index")
	public String setupForm (Map <String, Object> map){
		Meeting meeting= new Meeting();
		map.put("meeting", meeting);
		map.put("meetingList", meetingService.getAllMeetings());
		return "meeting";
	}
	
	@RequestMapping(value="/meeting.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Meeting meeting, BindingResult result, @RequestParam String action, Map <String, Object> map){
		Meeting meetingResult= new Meeting();
		switch (action.toLowerCase()){
		/**
		 * if the room does not exist, you can't create the meeting
		 */
		/**
		 * when I create a meeting, and I want to add an attendee to the meeting, 
		 * would have to add (id_room and id_assisits) Assists to the table in the database "meeting". 
		 * Here I represent a "list of Assistants"
		 */
		case "add":
			meetingService.add(meeting);
			meetingResult= meeting;
			break;
		case "edit":
			meetingService.edit(meeting);
			meetingResult= meeting;
			break;
		case "delete":
			meetingService.delete(meeting.getId_meeting());
			meetingResult= new Meeting();
			break;
		case "search":
			Meeting searchedMeeting= meetingService.getMeeting(meeting.getId_meeting());
			meetingResult= searchedMeeting != null ? searchedMeeting: new Meeting();
			break;
			
		}
		map.put("meeting", meetingResult);
		map.put("meetingList", meetingService.getAllMeetings());
		return "meeting";
	}

}
