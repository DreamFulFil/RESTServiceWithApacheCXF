package dream.blog.practice.rest.service.resource.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dream.blog.practice.rest.service.model.Car;
import dream.blog.practice.rest.service.resource.CarResource;

public class CarResourceImpl implements CarResource {

	private Map<Integer, Car> cars = new HashMap<>();
	
	{
		cars.put(1, new Car("TOYOTA", 600000));
		cars.put(2, new Car("LEXUS", 1800000));
	}
	
	@Override
	public List<Car> getAllCars() {
		Collection<Car> carsCollection = cars.values();
		return new ArrayList<>(carsCollection);
	}

}
