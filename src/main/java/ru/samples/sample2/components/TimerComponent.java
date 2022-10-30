package ru.samples.sample2.components;

import java.util.Date;
import org.springframework.stereotype.Component;

@Component
public class TimerComponent {
	public Date getCurrentDate () {
		return new Date ();
	}
}
