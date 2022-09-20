package com.zoho.attendance.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.attendance.entity.ReqEvent;
import com.zoho.attendance.repository.ReqEventRepository;

@Service("ReqEventService")
public class ReqEventService {
    @Autowired
	ReqEventRepository reqEventRepository;

    public String reqEvent(ReqEvent reqEvent) {

        //Expense expensedetail = expenserepository.findById(expense.getId()).get();
           //if(expensedetail==null) {
            reqEventRepository.save(reqEvent);
           return "ReqEvent has been added";
           //}
           //return null;
       }

    public List<ReqEvent> getEventReq() {        
        List<ReqEvent> reqEvent = (List<ReqEvent>)reqEventRepository.findAll();
        if (reqEvent != null) {
            return reqEvent;
        }
        return null;
    }

    public String updateEventReq(Long id,ReqEvent reqEvent) {
    	ReqEvent l = reqEventRepository.findByEventNameAndId(reqEvent.getEventName(),reqEvent.getId());
    	if(l!=null) {
            l.setReqStatus(reqEvent.getReqStatus());

            reqEventRepository.save(l);		
    	}
		return "ReqEvent has been updated, user name = " + l.getReqBy();
	}
}
