package starter.endpoints;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;


import io.micrometer.core.instrument.Counter;

@Component
@Endpoint(id = "estados")
public class EndPoints {
	
	private Counter c;
	

	private static  List<String> listado = Arrays.asList("open", "close", "half-open");

	
	@ReadOperation
	public List<String> estados(){
		c.increment();
		return listado;
	}

	
	@WriteOperation
	public void writeOperationOpen(@Selector String n) {
		c.increment();
		listado.add(n);
	}

}
