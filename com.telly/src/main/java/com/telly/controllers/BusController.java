package com.telly.controllers;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.telly.model.Bus;
import com.telly.model.Reservations;
import com.telly.service.BusService;
import com.telly.service.ReservationsService;

@Controller
public class BusController {

	@Autowired
	ReservationsService reservationsService;

	@Autowired
	BusService busService;

	@RequestMapping(value="/createtrip", method=RequestMethod.GET)
	ModelAndView addStatus(ModelAndView modelAndView, @ModelAttribute ("bus")Bus bus){

		modelAndView.setViewName("app.createtrip");


		Bus bus1 = new Bus();


		modelAndView.getModel().put("bus", bus1);

		return modelAndView;
	}

	@RequestMapping(value="/createtrip", method=RequestMethod.POST)
	ModelAndView addStatus(ModelAndView modelAndView, Bus bus, BindingResult result){

		modelAndView.setViewName("app.createtrip");

		if(!result.hasErrors()){
			busService.save(bus);
			modelAndView.getModel().put("bus", new Bus());
		}



		return modelAndView;
	}

	@RequestMapping(value="/results", method=RequestMethod.GET)
	ModelAndView results(ModelAndView modelAndView, @ModelAttribute ("bus")Bus bus){

		modelAndView.setViewName("app.results");

		List<Bus> results = busService.findByDate(bus.getDateLeave(), bus.getDateReturn(), bus.getGoingTo(), bus.getLeaveFrom());


		modelAndView.getModel().put("results", results);

		return modelAndView;
	}

	@RequestMapping(value="/book", method=RequestMethod.POST)
	ModelAndView results(ModelAndView modelAndView, Reservations reserve, Bus bus, BindingResult result, Principal principal){


		if(!result.hasErrors()){
			reserve.setEmail(principal.getName());
			reserve.setBusId(bus.getId());
			reservationsService.save(reserve);
			modelAndView.setViewName("redirect:/");
		}

		return modelAndView;
	}

	@RequestMapping(value="/myreservations", method=RequestMethod.GET)
	ModelAndView myReservations(ModelAndView modelAndView, Reservations reserve, Bus bus, BindingResult result, Principal principal){

		modelAndView.setViewName("app.myreservations");

		List<Reservations> reservations = reservationsService.findByEmail(principal.getName());
		List<Bus> trips = new ArrayList<Bus>();
		Bus trip = new Bus();
		for(int i = 0; i < reservations.size(); i++){
			trip = busService.findById(reservations.get(i).getBusId());
			trips.add(trip);
		}

		modelAndView.getModel().put("reservations", reservations);
		modelAndView.getModel().put("trips", trips);



		return modelAndView;
	}
}
