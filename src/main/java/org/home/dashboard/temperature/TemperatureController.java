package org.home.dashboard.temperature;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TemperatureController {

	@RequestMapping("/recupererTempJour")
	public @ResponseBody String recupererTemperatureJour() {
		return "On retourne ici les températures du jour";
	}

}
