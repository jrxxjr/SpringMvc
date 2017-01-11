package br.com.tidicas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller principal
 * @author Evaldo Junior
 *
 */
@Controller
@RequestMapping("/index")
public class MainController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView toIndex() {

		ModelAndView model = new ModelAndView("index");
		model.addObject("msg", "Página Inicial");

		return model;
	}
}